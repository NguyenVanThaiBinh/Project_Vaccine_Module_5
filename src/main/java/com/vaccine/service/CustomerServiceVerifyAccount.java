package com.vaccine.service;

import com.vaccine.model.Customer;
import com.vaccine.model.MailText;
import com.vaccine.repository.ICustomerRepository;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

@Service
public class CustomerServiceVerifyAccount {

    @Autowired
    private ICustomerRepository repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JavaMailSender mailSender;


    public void register(Customer user)
            throws UnsupportedEncodingException, MessagingException {
        // Mã hoá mật khẩu
//        String encodedPassword = passwordEncoder.encode(user.getPassword());
//        user.setPassword(encodedPassword);

        String randomCode = RandomString.make(64);
        user.setVerificationCode(randomCode);
        user.setEnabled(false);

        repo.save(user);


    }
    public void sendEmailVerifyAccount(String from, Customer customer, String siteURL) {

        MimeMessage msg = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(msg, true, "UTF-8");
            helper.setSubject("Xác minh tài khoản tiêm chủng");
            helper.setFrom(from);
            helper.setTo(customer.getEmail());
//            if (customer.getDate_vaccine() == null) {
//                customer.setDate_vaccine("null");
//                customer.setTime_vaccine("null");
//            }
//            Tạo code verify + set trạng thái tài khoản
            String randomCode = RandomString.make(64);
            customer.setVerificationCode(randomCode);
            customer.setEnabled(false);
            repo.save(customer);

            String verifyURL = siteURL  + "/verify?code=" + customer.getVerificationCode();
            MailText mailText = new MailText(customer.getCustomer_name(), customer.getCMND(),
                    customer.getAge(),customer.getDestination().getDestination_name(), customer.getHealthy_status(),verifyURL);

            helper.setText(mailText.sentVerifyAccountEmail(), true);
            mailSender.send(msg);
        } catch (Exception e) {
            System.err.println("Gửi email bị lỗi!!!!!!!!!!!!!!!!!!!!!");
        }

    }

    public boolean isVerify(String verificationCode) {
        Customer customer = repo.findByVerificationCode(verificationCode);
        if (customer == null || customer.isEnabled()) {
            return false;
        } else {
            customer.setVerificationCode(null);
            customer.setEnabled(true);
            repo.save(customer);
            return true;
        }

    }


}