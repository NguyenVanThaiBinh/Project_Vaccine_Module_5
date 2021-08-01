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
    public void sendEmail(String from,Customer customer,String siteURL) {

        MimeMessage msg = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(msg, true, "UTF-8");
            helper.setSubject("Kết quả đăng ký tiêm chủng");
            helper.setFrom(from);
            helper.setTo(customer.getEmail());
            if (customer.getDate_vaccine() == null) {
                customer.setDate_vaccine("---");
                customer.setTime_vaccine("---");

            }
//            Tạo code verify + set trạng thái tài khoản
            String randomCode = RandomString.make(64);
            customer.setVerificationCode(randomCode);
            customer.setEnabled(false);
            repo.save(customer);

            String verifyURL = siteURL  + "/verify?code=" + customer.getVerificationCode();
            MailText mailText = new MailText(customer.getCustomer_name(), customer.getCMND(),
                    customer.getAge(), customer.getDate_vaccine(), customer.getTime_vaccine(),
                    customer.getDestination().getDestination_name(), customer.getHealthy_status(),verifyURL);

            helper.setText(mailText.sentVerifyAccountEmail(), true);
            mailSender.send(msg);
        } catch (Exception e) {
            System.err.println("Loi roi` part 2~~~~~~~~~~~~~~~~");
        }

    }

    public void sendVerificationEmail(Customer user, String siteURL)
            throws MessagingException, UnsupportedEncodingException {
        String toAddress = user.getEmail();
        String fromAddress = "boyte.vaccine.covid@gmail.com";
        String subject = "Please verify your registration";
        String content = "Dear [[name]],<br>"
                + "Please click the link below to verify your registration:<br>"
                + "<h3><a href=\"[[URL]]\" target=\"_self\">VERIFY</a></h3>"
                + "Thank you,<br>"
                + "Your company name.";

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setFrom(fromAddress);
        helper.setTo(toAddress);
        helper.setSubject(subject);

        content = content.replace("[[name]]", user.getCustomer_name());
        String verifyURL = siteURL  + "/verify?code=" + user.getVerificationCode();

        content = content.replace("[[URL]]", verifyURL);

        helper.setText(content, true);

        mailSender.send(message);

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