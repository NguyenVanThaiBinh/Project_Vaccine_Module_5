//package com.vaccine.model;
//
//public   class MailText {
//    public    String textMail(){
//        String mail = " ";
//        return mail;
//    }
//}
//public void sendEmail(String from, String to,String fullName,String CMND
//        ,int age,String day,String time,String address,int ) {

package com.vaccine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailText {
    String fullName;
    String CMND;
    int age;

    String address;
    int status;
    String link;
    String verifyURL;
    String date;
    String time;




    public MailText(String fullName, String CMND, int age,
                    String address,String date,String time ,int status,String verifyURL) {
        this.fullName = fullName;
        this.CMND = CMND;
        this.age = age;
        this.address = address;
        this.status = status;
        this.verifyURL = verifyURL;
        this.date = date;
        this.time= time;
    }

    public String checkStatus(int status) {

        if (status == 1 || status == 2) {
            return "Thành công";
        } else

            return "Thất bại";
    }

    public MailText(String fullName, String link) {
        this.fullName = fullName;
        this.link = link;
    }

    public MailText(String fullName, String CMND,int status,String verifyURL) {
        this.fullName = fullName;
        this.CMND = CMND;
        this.status = status;
        this.verifyURL = verifyURL;
    }
    public MailText(String fullName, String CMND,String link) {
        this.fullName = fullName;
        this.CMND = CMND;
        this.link = link;
    }

    public String getMailRegisterTwice(){
        String text = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
                "<head>\n" +
                "<!--[if gte mso 9]>\n" +
                "<xml>\n" +
                "  <o:OfficeDocumentSettings>\n" +
                "    <o:AllowPNG/>\n" +
                "    <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
                "  </o:OfficeDocumentSettings>\n" +
                "</xml>\n" +
                "<![endif]-->\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <meta name=\"x-apple-disable-message-reformatting\">\n" +
                "  <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->\n" +
                "  <title></title>\n" +
                "  \n" +
                "    <style type=\"text/css\">\n" +
                "\n" +
                "      table, td { color: #000000; } a { color: #6d6d6d; text-decoration: none; } @media (max-width: 480px) { #u_content_image_1 .v-src-width { width: auto !important; } #u_content_image_1 .v-src-max-width { max-width: 50% !important; } #u_content_text_1 .v-text-align { text-align: center !important; } #u_content_text_14 .v-text-align { text-align: center !important; } #u_content_text_15 .v-text-align { text-align: center !important; } }\n" +
                "@media only screen and (min-width: 620px) {\n" +
                "  .u-row {\n" +
                "    width: 600px !important;\n" +
                "  }\n" +
                "  .u-row .u-col {\n" +
                "    vertical-align: top;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-33p33 {\n" +
                "    width: 199.98px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-50 {\n" +
                "    width: 300px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-66p67 {\n" +
                "    width: 400.02px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-100 {\n" +
                "    width: 600px !important;\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "@media (max-width: 620px) {\n" +
                "  .u-row-container {\n" +
                "    max-width: 100% !important;\n" +
                "    padding-left: 0px !important;\n" +
                "    padding-right: 0px !important;\n" +
                "  }\n" +
                "  .u-row .u-col {\n" +
                "    min-width: 320px !important;\n" +
                "    max-width: 100% !important;\n" +
                "    display: block !important;\n" +
                "  }\n" +
                "  .u-row {\n" +
                "    width: calc(100% - 40px) !important;\n" +
                "  }\n" +
                "  .u-col {\n" +
                "    width: 100% !important;\n" +
                "  }\n" +
                "  .u-col > div {\n" +
                "    margin: 0 auto;\n" +
                "  }\n" +
                "  .no-stack .u-col {\n" +
                "    min-width: 0 !important;\n" +
                "    display: table-cell !important;\n" +
                "  }\n" +
                "\n" +
                ".no-stack .u-col-50 {\n" +
                "    width: 50% !important;\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "body {\n" +
                "  margin: 0;\n" +
                "  padding: 0;\n" +
                "}\n" +
                "\n" +
                "table,\n" +
                "tr,\n" +
                "td {\n" +
                "  vertical-align: top;\n" +
                "  border-collapse: collapse;\n" +
                "}\n" +
                "\n" +
                "p {\n" +
                "  margin: 0;\n" +
                "}\n" +
                "\n" +
                ".ie-container table,\n" +
                ".mso-container table {\n" +
                "  table-layout: fixed;\n" +
                "}\n" +
                "\n" +
                "* {\n" +
                "  line-height: inherit;\n" +
                "}\n" +
                "\n" +
                "a[x-apple-data-detectors='true'] {\n" +
                "  color: inherit !important;\n" +
                "  text-decoration: none !important;\n" +
                "}\n" +
                "\n" +
                "@media (max-width: 480px) {\n" +
                "  .hide-mobile {\n" +
                "    display: none !important;\n" +
                "    max-height: 0px;\n" +
                "    overflow: hidden;\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "    </style>\n" +
                "  \n" +
                "  \n" +
                "\n" +
                "<!--[if !mso]><!--><link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700&display=swap\" rel=\"stylesheet\" type=\"text/css\"><!--<![endif]-->\n" +
                "\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"clean-body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #eeeeee;color: #000000\">\n" +
                "  <!--[if IE]><div class=\"ie-container\"><![endif]-->\n" +
                "  <!--[if mso]><div class=\"mso-container\"><![endif]-->\n" +
                "  <table style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #eeeeee;width:100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "  <tbody>\n" +
                "  <tr style=\"vertical-align: top\">\n" +
                "    <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #eeeeee;\"><![endif]-->\n" +
                "    \n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #3598db;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #3598db;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"200\" style=\"width: 200px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-33p33\" style=\"max-width: 320px;min-width: 200px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table id=\"u_content_image_1\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:31px 10px 25px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "  <tr>\n" +
                "    <td class=\"v-text-align\" style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
                "      \n" +
                "      <img align=\"center\" border=\"0\" src=\"https://vnvc.vn/favicon.ico\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 23%;max-width: 41.4px;\" width=\"41.4\" class=\"v-src-width v-src-max-width\"/>\n" +
                "      \n" +
                "    </td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"400\" style=\"width: 400px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-66p67\" style=\"max-width: 320px;min-width: 400px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table class=\"hide-mobile\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #3598db;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table id=\"u_content_text_1\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:13px 26px 16px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #ffffff; line-height: 140%; text-align: right; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 18px; line-height: 25.2px;\">Hệ thống ti&ecirc;m chủng vaccine Việt Nam</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:40px 10px 10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "  <tr>\n" +
                "    <td class=\"v-text-align\" style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
                "      \n" +
                "      <img align=\"center\" border=\"0\" src=\"https://i.ibb.co/TtH1Y55/t-i-xu-ng.png\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width:45%;max-width: 160px;\" width=\"120\" class=\"v-src-width v-src-max-width\"/>\n" +
                "      \n" +
                "    </td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #47484b; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><strong><span style=\"font-size: 30px; line-height: 42px;\">Đăng ký tiêm chủng lần <span style=\"color: royalblue;\">2</span> </span></strong></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:2px 40px 25px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #7a7676; line-height: 170%; text-align: left; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 170%; text-align: center;\"><span style=\"font-size: 16px; line-height: 27.2px;\">V&igrave; một Việt Nam khoẻ mạnh, h&atilde;y ti&ecirc;m ph&ograve;ng vaccine</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "    <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "      <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "        <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "        \n" +
                "  <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "  <div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "    <div style=\"width: 100% !important;\">\n" +
                "    <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "    \n" +
                "  <table id=\"u_content_text_14\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "    <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: left; word-wrap: break-word;\">\n" +
                "      <p style=\"font-size: 14px; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 22px; line-height: 19.6px;\">Click vào <a style=\"color: rgb(26, 26, 204);\" href=\""+link+"\" >ĐÂY</a> để Vào form đăng ký</span></strong></p>\n" +
                "      <br><br>\n" +
                "      <p style=\"font-size: 14px; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 20px; line-height: 19.6px;\">Thông tin khách hàng</span></strong></p>\n" +
                "  \n" +
                "    </div>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "    <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "        <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row no-stack\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">Họ v&agrave; t&ecirc;n</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">"+fullName+"</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "    <div class=\"u-row no-stack\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "      <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "        <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "        \n" +
                "  <!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "  <div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "    <div style=\"width: 100% !important;\">\n" +
                "    <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "    \n" +
                "  <table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "    <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "      <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">Số chứng minh thư</span></p>\n" +
                "    </div>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "    <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "  <!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "  <div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "    <div style=\"width: 100% !important;\">\n" +
                "    <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "    \n" +
                "  <table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "    <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "      <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">"+CMND+"</span></p>\n" +
                "    </div>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "    <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "        <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "    <div class=\"u-row no-stack\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "      <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "        <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "        \n" +
                "  <!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "  <div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "    <div style=\"width: 100% !important;\">\n" +
                "    <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "    \n" +
                "  <table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "    <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "      <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 20px; line-height: 23px;font-weight: bold;color: crimson;\">Trạng thái</span></p>\n" +
                "    </div>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "    <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "  <!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "  <div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "    <div style=\"width: 100% !important;\">\n" +
                "    <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "    \n" +
                "  <table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "    <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "      <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">Đã tiêm chủng lần 1</span></p>\n" +
                "    </div>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "    <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "        <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row no-stack\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "    <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
                "      <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "        <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
                "        \n" +
                "  <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "  <div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "    <div style=\"width: 100% !important;\">\n" +
                "    <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "    \n" +
                "  <table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "    <div class=\"v-text-align\" style=\"line-height: 140%; text-align: left; word-wrap: break-word;\">\n" +
                "      <p style=\"font-size: 14px; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 18px; line-height: 25.2px;\"><em>Mọi th&ocirc;ng tin xin li&ecirc;n hệ <span style=\"color: #e03e2d; font-size: 18px; line-height: 25.2px;\">0365503545 </span>để được hỗ trợ!</em></span></strong></p>\n" +
                "    </div>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "\n" +
                "    <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "        <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "    <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "      <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "        <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "        \n" +
                "  <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "  <div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "    <div style=\"width: 100% !important;\">\n" +
                "    <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "    \n" +
                "  <table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "    <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "      <tbody>\n" +
                "        <tr style=\"vertical-align: top\">\n" +
                "          <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "            <span>&#160;</span>\n" +
                "          </td>\n" +
                "        </tr>\n" +
                "      </tbody>\n" +
                "    </table>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "  <table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "  <div align=\"center\">\n" +
                "    <div style=\"display: table; max-width:140px;\">\n" +
                "    <!--[if (mso)|(IE)]><table width=\"140\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"border-collapse:collapse;\" align=\"center\"><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse; mso-table-lspace: 0pt;mso-table-rspace: 0pt; width:140px;\"><tr><![endif]-->\n" +
                "    \n" +
                "      \n" +
                "      <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 15px;\" valign=\"top\"><![endif]-->\n" +
                "      <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 15px\">\n" +
                "        <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "          <a href=\"https://facebook.com/\" title=\"Facebook\" target=\"_blank\">\n" +
                "            <img src=\"https://cdn.tools.unlayer.com/social/icons/circle/facebook.png\" alt=\"Facebook\" title=\"Facebook\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "          </a>\n" +
                "        </td></tr>\n" +
                "      </tbody></table>\n" +
                "      <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      \n" +
                "      <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 15px;\" valign=\"top\"><![endif]-->\n" +
                "      <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 15px\">\n" +
                "        <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "          <a href=\"https://instagram.com/\" title=\"Instagram\" target=\"_blank\">\n" +
                "            <img src=\"https://cdn.tools.unlayer.com/social/icons/circle/instagram.png\" alt=\"Instagram\" title=\"Instagram\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "          </a>\n" +
                "        </td></tr>\n" +
                "      </tbody></table>\n" +
                "      <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      \n" +
                "      <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 0px;\" valign=\"top\"><![endif]-->\n" +
                "      <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 0px\">\n" +
                "        <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "          <a href=\"https://twitter.com/\" title=\"Twitter\" target=\"_blank\">\n" +
                "            <img src=\"https://cdn.tools.unlayer.com/social/icons/circle/twitter.png\" alt=\"Twitter\" title=\"Twitter\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "          </a>\n" +
                "        </td></tr>\n" +
                "      </tbody></table>\n" +
                "      <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      \n" +
                "      \n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "    <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "        <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #236fa1;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #236fa1;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:16px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #ecf7ff; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\">&copy; VaccineVIetNam. All Rights Reserved</p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "    <!--[if (mso)|(IE)]></td></tr></table><![endif]-->\n" +
                "    </td>\n" +
                "  </tr>\n" +
                "  </tbody>\n" +
                "  </table>\n" +
                "  <!--[if mso]></div><![endif]-->\n" +
                "  <!--[if IE]></div><![endif]-->\n" +
                "</body>\n" +
                "\n" +
                "</html>\n";
        return text;
    }

    public String getMailApologyToCustomerFail(){
        String text = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
                "<head>\n" +
                "<!--[if gte mso 9]>\n" +
                "<xml>\n" +
                "  <o:OfficeDocumentSettings>\n" +
                "    <o:AllowPNG/>\n" +
                "    <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
                "  </o:OfficeDocumentSettings>\n" +
                "</xml>\n" +
                "<![endif]-->\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <meta name=\"x-apple-disable-message-reformatting\">\n" +
                "  <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->\n" +
                "  <title></title>\n" +
                "  \n" +
                "    <style type=\"text/css\">\n" +
                "\n" +
                "      table, td { color: #000000; } a { color: #6d6d6d; text-decoration: none; } @media (max-width: 480px) { #u_content_image_1 .v-src-width { width: auto !important; } #u_content_image_1 .v-src-max-width { max-width: 50% !important; } #u_content_text_1 .v-text-align { text-align: center !important; } #u_content_text_14 .v-text-align { text-align: center !important; } #u_content_text_15 .v-text-align { text-align: center !important; } }\n" +
                "@media only screen and (min-width: 620px) {\n" +
                "  .u-row {\n" +
                "    width: 600px !important;\n" +
                "  }\n" +
                "  .u-row .u-col {\n" +
                "    vertical-align: top;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-33p33 {\n" +
                "    width: 199.98px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-50 {\n" +
                "    width: 300px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-66p67 {\n" +
                "    width: 400.02px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-100 {\n" +
                "    width: 600px !important;\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "@media (max-width: 620px) {\n" +
                "  .u-row-container {\n" +
                "    max-width: 100% !important;\n" +
                "    padding-left: 0px !important;\n" +
                "    padding-right: 0px !important;\n" +
                "  }\n" +
                "  .u-row .u-col {\n" +
                "    min-width: 320px !important;\n" +
                "    max-width: 100% !important;\n" +
                "    display: block !important;\n" +
                "  }\n" +
                "  .u-row {\n" +
                "    width: calc(100% - 40px) !important;\n" +
                "  }\n" +
                "  .u-col {\n" +
                "    width: 100% !important;\n" +
                "  }\n" +
                "  .u-col > div {\n" +
                "    margin: 0 auto;\n" +
                "  }\n" +
                "  .no-stack .u-col {\n" +
                "    min-width: 0 !important;\n" +
                "    display: table-cell !important;\n" +
                "  }\n" +
                "\n" +
                ".no-stack .u-col-50 {\n" +
                "    width: 50% !important;\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "body {\n" +
                "  margin: 0;\n" +
                "  padding: 0;\n" +
                "}\n" +
                "\n" +
                "table,\n" +
                "tr,\n" +
                "td {\n" +
                "  vertical-align: top;\n" +
                "  border-collapse: collapse;\n" +
                "}\n" +
                "\n" +
                "p {\n" +
                "  margin: 0;\n" +
                "}\n" +
                "\n" +
                ".ie-container table,\n" +
                ".mso-container table {\n" +
                "  table-layout: fixed;\n" +
                "}\n" +
                "\n" +
                "* {\n" +
                "  line-height: inherit;\n" +
                "}\n" +
                "\n" +
                "a[x-apple-data-detectors='true'] {\n" +
                "  color: inherit !important;\n" +
                "  text-decoration: none !important;\n" +
                "}\n" +
                "\n" +
                "@media (max-width: 480px) {\n" +
                "  .hide-mobile {\n" +
                "    display: none !important;\n" +
                "    max-height: 0px;\n" +
                "    overflow: hidden;\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "    </style>\n" +
                "  \n" +
                "  \n" +
                "\n" +
                "<!--[if !mso]><!--><link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700&display=swap\" rel=\"stylesheet\" type=\"text/css\"><!--<![endif]-->\n" +
                "\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"clean-body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #eeeeee;color: #000000\">\n" +
                "  <!--[if IE]><div class=\"ie-container\"><![endif]-->\n" +
                "  <!--[if mso]><div class=\"mso-container\"><![endif]-->\n" +
                "  <table style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #eeeeee;width:100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "  <tbody>\n" +
                "  <tr style=\"vertical-align: top\">\n" +
                "    <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #eeeeee;\"><![endif]-->\n" +
                "    \n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #3598db;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #3598db;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"200\" style=\"width: 200px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-33p33\" style=\"max-width: 320px;min-width: 200px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table id=\"u_content_image_1\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:31px 10px 25px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "  <tr>\n" +
                "    <td class=\"v-text-align\" style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
                "      \n" +
                "      <img align=\"center\" border=\"0\" src=\"https://vnvc.vn/favicon.ico\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 23%;max-width: 41.4px;\" width=\"41.4\" class=\"v-src-width v-src-max-width\"/>\n" +
                "      \n" +
                "    </td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"400\" style=\"width: 400px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-66p67\" style=\"max-width: 320px;min-width: 400px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table class=\"hide-mobile\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #3598db;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table id=\"u_content_text_1\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:13px 26px 16px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #ffffff; line-height: 140%; text-align: right; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 18px; line-height: 25.2px;\">Hệ thống ti&ecirc;m chủng vaccine Việt Nam</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:40px 10px 10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "  <tr>\n" +
                "    <td class=\"v-text-align\" style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
                "      \n" +
                "      <img align=\"center\" border=\"0\" src=\"https://cdn.iconscout.com/icon/free/png-512/sad-emoji-17-894764.png\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width:45%;max-width: 180px;\" width=\"120\" class=\"v-src-width v-src-max-width\"/>\n" +
                "      \n" +
                "    </td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #47484b; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><strong><span style=\"font-size: 30px; line-height: 42px;\">Thông báo lịch tiêm đã bị <span style=\"color: red;\">HUỶ</span> </span></strong></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:2px 40px 25px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #7a7676; line-height: 170%; text-align: left; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 170%; text-align: center;\"><span style=\"font-size: 16px; line-height: 27.2px;\">V&igrave; một Việt Nam khoẻ mạnh, h&atilde;y ti&ecirc;m ph&ograve;ng vaccine</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table id=\"u_content_text_14\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: left; word-wrap: break-word;\">\n" +
                "  \n" +
                "    <p style=\"font-size: 14px; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 20px; line-height: 19.6px;\">Vì hệ thống đã được thay đổi </span></strong></p><br><br>\n" +
                "\n" +
                "    <p style=\"font-size: 14px; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 20px; line-height: 19.6px;\">Chúng tôi không thể tiếp nhận lịch tiêm của bạn!</span></strong></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row no-stack\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\"><br><br>\n" +
                "    <p style=\"font-size: 19px; line-height: 140%;\"><span style=\"font-size: 19px; line-height: 19.6px;\">Chúng tôi rất xin lỗi vì sự bất tiện này!</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row no-stack\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "    <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
                "      <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "        <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
                "        \n" +
                "  <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "  <div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "    <div style=\"width: 100% !important;\">\n" +
                "    <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "    \n" +
                "  <table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "    <div class=\"v-text-align\" style=\"line-height: 140%; text-align: left; word-wrap: break-word;\">\n" +
                "      <p style=\"font-size: 14px; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 18px; line-height: 25.2px;\"><em>Mọi th&ocirc;ng tin xin li&ecirc;n hệ <span style=\"color: #e03e2d; font-size: 18px; line-height: 25.2px;\">0365503545 </span>để được hỗ trợ!</em></span></strong></p>\n" +
                "    </div>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "\n" +
                "    <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "        <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "    <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "      <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "        <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "        \n" +
                "  <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "  <div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "    <div style=\"width: 100% !important;\">\n" +
                "    <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "    \n" +
                "  <table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "    <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "      <tbody>\n" +
                "        <tr style=\"vertical-align: top\">\n" +
                "          <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "            <span>&#160;</span>\n" +
                "          </td>\n" +
                "        </tr>\n" +
                "      </tbody>\n" +
                "    </table>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "  <table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "  <div align=\"center\">\n" +
                "    <div style=\"display: table; max-width:140px;\">\n" +
                "    <!--[if (mso)|(IE)]><table width=\"140\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"border-collapse:collapse;\" align=\"center\"><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse; mso-table-lspace: 0pt;mso-table-rspace: 0pt; width:140px;\"><tr><![endif]-->\n" +
                "    \n" +
                "      \n" +
                "      <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 15px;\" valign=\"top\"><![endif]-->\n" +
                "      <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 15px\">\n" +
                "        <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "          <a href=\"https://facebook.com/\" title=\"Facebook\" target=\"_blank\">\n" +
                "            <img src=\"https://cdn.tools.unlayer.com/social/icons/circle/facebook.png\" alt=\"Facebook\" title=\"Facebook\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "          </a>\n" +
                "        </td></tr>\n" +
                "      </tbody></table>\n" +
                "      <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      \n" +
                "      <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 15px;\" valign=\"top\"><![endif]-->\n" +
                "      <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 15px\">\n" +
                "        <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "          <a href=\"https://instagram.com/\" title=\"Instagram\" target=\"_blank\">\n" +
                "            <img src=\"https://cdn.tools.unlayer.com/social/icons/circle/instagram.png\" alt=\"Instagram\" title=\"Instagram\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "          </a>\n" +
                "        </td></tr>\n" +
                "      </tbody></table>\n" +
                "      <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      \n" +
                "      <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 0px;\" valign=\"top\"><![endif]-->\n" +
                "      <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 0px\">\n" +
                "        <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "          <a href=\"https://twitter.com/\" title=\"Twitter\" target=\"_blank\">\n" +
                "            <img src=\"https://cdn.tools.unlayer.com/social/icons/circle/twitter.png\" alt=\"Twitter\" title=\"Twitter\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "          </a>\n" +
                "        </td></tr>\n" +
                "      </tbody></table>\n" +
                "      <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      \n" +
                "      \n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "    <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "        <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #236fa1;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #236fa1;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:16px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #ecf7ff; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\">&copy; VaccineVIetNam. All Rights Reserved</p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "    <!--[if (mso)|(IE)]></td></tr></table><![endif]-->\n" +
                "    </td>\n" +
                "  </tr>\n" +
                "  </tbody>\n" +
                "  </table>\n" +
                "  <!--[if mso]></div><![endif]-->\n" +
                "  <!--[if IE]></div><![endif]-->\n" +
                "</body>\n" +
                "\n" +
                "</html>\n";
        return  text;
    }

    public String getMailTextCustomerDone(){
        String text = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
                "\n" +
                "<head>\n" +
                "    <!--[if gte mso 9]>\n" +
                "      <xml>\n" +
                "        <o:OfficeDocumentSettings>\n" +
                "          <o:AllowPNG />\n" +
                "          <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
                "        </o:OfficeDocumentSettings>\n" +
                "      </xml>\n" +
                "    <![endif]-->\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
                "    <meta name=\"x-apple-disable-message-reformatting\" />\n" +
                "    <!--[if !mso]><!-->\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n" +
                "    <!--<![endif]-->\n" +
                "    <title></title>\n" +
                "\n" +
                "    <style type=\"text/css\">\n" +
                "        table,\n" +
                "        td {\n" +
                "            color: #000000;\n" +
                "        }\n" +
                "        \n" +
                "        a {\n" +
                "            color: #6d6d6d;\n" +
                "            text-decoration: none;\n" +
                "        }\n" +
                "        \n" +
                "        @media (max-width: 480px) {\n" +
                "            #u_content_image_1 .v-src-width {\n" +
                "                width: auto !important;\n" +
                "            }\n" +
                "            #u_content_image_1 .v-src-max-width {\n" +
                "                max-width: 50% !important;\n" +
                "            }\n" +
                "            #u_content_text_1 .v-text-align {\n" +
                "                text-align: center !important;\n" +
                "            }\n" +
                "            #u_content_text_14 .v-text-align {\n" +
                "                text-align: center !important;\n" +
                "            }\n" +
                "            #u_content_text_15 .v-text-align {\n" +
                "                text-align: center !important;\n" +
                "            }\n" +
                "        }\n" +
                "        \n" +
                "        @media only screen and (min-width: 620px) {\n" +
                "            .u-row {\n" +
                "                width: 600px !important;\n" +
                "            }\n" +
                "            .u-row .u-col {\n" +
                "                vertical-align: top;\n" +
                "            }\n" +
                "            .u-row .u-col-33p33 {\n" +
                "                width: 199.98px !important;\n" +
                "            }\n" +
                "            .u-row .u-col-50 {\n" +
                "                width: 300px !important;\n" +
                "            }\n" +
                "            .u-row .u-col-66p67 {\n" +
                "                width: 400.02px !important;\n" +
                "            }\n" +
                "            .u-row .u-col-100 {\n" +
                "                width: 600px !important;\n" +
                "            }\n" +
                "        }\n" +
                "        \n" +
                "        @media (max-width: 620px) {\n" +
                "            .u-row-container {\n" +
                "                max-width: 100% !important;\n" +
                "                padding-left: 0px !important;\n" +
                "                padding-right: 0px !important;\n" +
                "            }\n" +
                "            .u-row .u-col {\n" +
                "                min-width: 320px !important;\n" +
                "                max-width: 100% !important;\n" +
                "                display: block !important;\n" +
                "            }\n" +
                "            .u-row {\n" +
                "                width: calc(100% - 40px) !important;\n" +
                "            }\n" +
                "            .u-col {\n" +
                "                width: 100% !important;\n" +
                "            }\n" +
                "            .u-col>div {\n" +
                "                margin: 0 auto;\n" +
                "            }\n" +
                "            .no-stack .u-col {\n" +
                "                min-width: 0 !important;\n" +
                "                display: table-cell !important;\n" +
                "            }\n" +
                "            .no-stack .u-col-50 {\n" +
                "                width: 50% !important;\n" +
                "            }\n" +
                "        }\n" +
                "        \n" +
                "        body {\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "        }\n" +
                "        \n" +
                "        table,\n" +
                "        tr,\n" +
                "        td {\n" +
                "            vertical-align: top;\n" +
                "            border-collapse: collapse;\n" +
                "        }\n" +
                "        \n" +
                "        p {\n" +
                "            margin: 0;\n" +
                "        }\n" +
                "        \n" +
                "        .ie-container table,\n" +
                "        .mso-container table {\n" +
                "            table-layout: fixed;\n" +
                "        }\n" +
                "        \n" +
                "        * {\n" +
                "            line-height: inherit;\n" +
                "        }\n" +
                "        \n" +
                "        a[x-apple-data-detectors=\"true\"] {\n" +
                "            color: inherit !important;\n" +
                "            text-decoration: none !important;\n" +
                "        }\n" +
                "        \n" +
                "        @media (max-width: 480px) {\n" +
                "            .hide-mobile {\n" +
                "                display: none !important;\n" +
                "                max-height: 0px;\n" +
                "                overflow: hidden;\n" +
                "            }\n" +
                "        }\n" +
                "    </style>\n" +
                "\n" +
                "    <!--[if !mso]><!-->\n" +
                "    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700&display=swap\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "    <!--<![endif]-->\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"clean-body\" style=\"\n" +
                "      margin: 0;\n" +
                "      padding: 0;\n" +
                "      -webkit-text-size-adjust: 100%;\n" +
                "      background-color: #eeeeee;\n" +
                "      color: #000000;\n" +
                "    \">\n" +
                "    <!--[if IE]><div class=\"ie-container\"><![endif]-->\n" +
                "    <!--[if mso]><div class=\"mso-container\"><![endif]-->\n" +
                "    <table style=\"\n" +
                "        border-collapse: collapse;\n" +
                "        table-layout: fixed;\n" +
                "        border-spacing: 0;\n" +
                "        mso-table-lspace: 0pt;\n" +
                "        mso-table-rspace: 0pt;\n" +
                "        vertical-align: top;\n" +
                "        min-width: 320px;\n" +
                "        margin: 0 auto;\n" +
                "        background-color: #eeeeee;\n" +
                "        width: 100%;\n" +
                "      \" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "        <tbody>\n" +
                "            <tr style=\"vertical-align: top\">\n" +
                "                <td style=\"\n" +
                "              word-break: break-word;\n" +
                "              border-collapse: collapse !important;\n" +
                "              vertical-align: top;\n" +
                "            \">\n" +
                "                    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #eeeeee;\"><![endif]-->\n" +
                "\n" +
                "                    <div class=\"u-row-container\" style=\"padding: 0px; background-color: transparent\">\n" +
                "                        <div class=\"u-row\" style=\"\n" +
                "                  margin: 0 auto;\n" +
                "                  min-width: 320px;\n" +
                "                  max-width: 600px;\n" +
                "                  overflow-wrap: break-word;\n" +
                "                  word-wrap: break-word;\n" +
                "                  word-break: break-word;\n" +
                "                  background-color: #3598db;\n" +
                "                \">\n" +
                "                            <div style=\"\n" +
                "                    border-collapse: collapse;\n" +
                "                    display: table;\n" +
                "                    width: 100%;\n" +
                "                    background-color: transparent;\n" +
                "                  \">\n" +
                "                                <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #3598db;\"><![endif]-->\n" +
                "\n" +
                "                                <!--[if (mso)|(IE)]><td align=\"center\" width=\"200\" style=\"width: 200px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                                <div class=\"u-col u-col-33p33\" style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 200px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \">\n" +
                "                                    <div style=\"width: 100% !important\">\n" +
                "                                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                                        <div style=\"\n" +
                "                          padding: 0px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \">\n" +
                "                                            <!--<![endif]-->\n" +
                "                                            <table id=\"u_content_image_1\" style=\"font-family: 'Open Sans', sans-serif\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "                                                <tbody>\n" +
                "                                                    <tr>\n" +
                "                                                        <td style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 31px 10px 25px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \" align=\"left\">\n" +
                "                                                            <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "                                                                <tr>\n" +
                "                                                                    <td class=\"v-text-align\" style=\"\n" +
                "                                        padding-right: 0px;\n" +
                "                                        padding-left: 0px;\n" +
                "                                      \" align=\"center\">\n" +
                "                                                                        <img align=\"center\" border=\"0\" src=\"https://vnvc.vn/favicon.ico\" alt=\"Image\" title=\"Image\" style=\"\n" +
                "                                          outline: none;\n" +
                "                                          text-decoration: none;\n" +
                "                                          -ms-interpolation-mode: bicubic;\n" +
                "                                          clear: both;\n" +
                "                                          display: inline-block !important;\n" +
                "                                          border: none;\n" +
                "                                          height: auto;\n" +
                "                                          float: none;\n" +
                "                                          width: 23%;\n" +
                "                                          max-width: 41.4px;\n" +
                "                                        \" width=\"41.4\" class=\"v-src-width v-src-max-width\" />\n" +
                "                                                                    </td>\n" +
                "                                                                </tr>\n" +
                "                                                            </table>\n" +
                "                                                        </td>\n" +
                "                                                    </tr>\n" +
                "                                                </tbody>\n" +
                "                                            </table>\n" +
                "\n" +
                "                                            <!--[if (!mso)&(!IE)]><!-->\n" +
                "                                        </div>\n" +
                "                                        <!--<![endif]-->\n" +
                "                                    </div>\n" +
                "                                </div>\n" +
                "                                <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "                                <!--[if (mso)|(IE)]><td align=\"center\" width=\"400\" style=\"width: 400px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                                <div class=\"u-col u-col-66p67\" style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 400px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \">\n" +
                "                                    <div style=\"width: 100% !important\">\n" +
                "                                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                                        <div style=\"\n" +
                "                          padding: 0px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \">\n" +
                "                                            <!--<![endif]-->\n" +
                "                                            <table class=\"hide-mobile\" style=\"font-family: 'Open Sans', sans-serif\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "                                                <tbody>\n" +
                "                                                    <tr>\n" +
                "                                                        <td style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 10px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \" align=\"left\">\n" +
                "                                                            <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"\n" +
                "                                    border-collapse: collapse;\n" +
                "                                    table-layout: fixed;\n" +
                "                                    border-spacing: 0;\n" +
                "                                    mso-table-lspace: 0pt;\n" +
                "                                    mso-table-rspace: 0pt;\n" +
                "                                    vertical-align: top;\n" +
                "                                    border-top: 1px solid #3598db;\n" +
                "                                    -ms-text-size-adjust: 100%;\n" +
                "                                    -webkit-text-size-adjust: 100%;\n" +
                "                                  \">\n" +
                "                                                                <tbody>\n" +
                "                                                                    <tr style=\"vertical-align: top\">\n" +
                "                                                                        <td style=\"\n" +
                "                                          word-break: break-word;\n" +
                "                                          border-collapse: collapse !important;\n" +
                "                                          vertical-align: top;\n" +
                "                                          font-size: 0px;\n" +
                "                                          line-height: 0px;\n" +
                "                                          mso-line-height-rule: exactly;\n" +
                "                                          -ms-text-size-adjust: 100%;\n" +
                "                                          -webkit-text-size-adjust: 100%;\n" +
                "                                        \">\n" +
                "                                                                            <span>&#160;</span>\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                </tbody>\n" +
                "                                                            </table>\n" +
                "                                                        </td>\n" +
                "                                                    </tr>\n" +
                "                                                </tbody>\n" +
                "                                            </table>\n" +
                "\n" +
                "                                            <table id=\"u_content_text_1\" style=\"font-family: 'Open Sans', sans-serif\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "                                                <tbody>\n" +
                "                                                    <tr>\n" +
                "                                                        <td style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 13px 26px 16px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \" align=\"left\">\n" +
                "                                                            <div class=\"v-text-align\" style=\"\n" +
                "                                    color: #ffffff;\n" +
                "                                    line-height: 140%;\n" +
                "                                    text-align: right;\n" +
                "                                    word-wrap: break-word;\n" +
                "                                  \">\n" +
                "                                                                <p style=\"\n" +
                "                                      font-size: 14px;\n" +
                "                                      line-height: 140%;\n" +
                "                                      text-align: left;\n" +
                "                                    \">\n" +
                "                                                                    <span style=\"\n" +
                "                                        font-size: 18px;\n" +
                "                                        line-height: 25.2px;\n" +
                "                                      \">Hệ thống ti&ecirc;m chủng vaccine Việt\n" +
                "                                      Nam</span\n" +
                "                                    >\n" +
                "                                  </p>\n" +
                "                                </div>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                      </div>\n" +
                "                      <!--<![endif]-->\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "                  <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "\n" +
                "            <div\n" +
                "              class=\"u-row-container\"\n" +
                "              style=\"padding: 0px; background-color: transparent\"\n" +
                "            >\n" +
                "              <div\n" +
                "                class=\"u-row\"\n" +
                "                style=\"\n" +
                "                  margin: 0 auto;\n" +
                "                  min-width: 320px;\n" +
                "                  max-width: 600px;\n" +
                "                  overflow-wrap: break-word;\n" +
                "                  word-wrap: break-word;\n" +
                "                  word-break: break-word;\n" +
                "                  background-color: #ffffff;\n" +
                "                \"\n" +
                "              >\n" +
                "                <div\n" +
                "                  style=\"\n" +
                "                    border-collapse: collapse;\n" +
                "                    display: table;\n" +
                "                    width: 100%;\n" +
                "                    background-color: transparent;\n" +
                "                  \"\n" +
                "                >\n" +
                "                  <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "\n" +
                "                  <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                  <div\n" +
                "                    class=\"u-col u-col-100\"\n" +
                "                    style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 600px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \"\n" +
                "                  >\n" +
                "                    <div style=\"width: 100% !important\">\n" +
                "                      <!--[if (!mso)&(!IE)]><!--><div\n" +
                "                        style=\"\n" +
                "                          padding: 0px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \"\n" +
                "                      ><!--<![endif]-->\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 40px 10px 10px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              >\n" +
                "                                <table\n" +
                "                                  width=\"100%\"\n" +
                "                                  cellpadding=\"0\"\n" +
                "                                  cellspacing=\"0\"\n" +
                "                                  border=\"0\"\n" +
                "                                >\n" +
                "                                  <tr>\n" +
                "                                    <td\n" +
                "                                      class=\"v-text-align\"\n" +
                "                                      style=\"\n" +
                "                                        padding-right: 0px;\n" +
                "                                        padding-left: 0px;\n" +
                "                                      \"\n" +
                "                                      align=\"center\"\n" +
                "                                    >\n" +
                "                                      <img\n" +
                "                                        align=\"center\"\n" +
                "                                        border=\"0\"\n" +
                "                                        src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTyX32zWaKPTixs_pnyyZZebgpZWoPYQBWaew&usqp=CAU\"\n" +
                "                                        alt=\"Image\"\n" +
                "                                        title=\"Image\"\n" +
                "                                        style=\"\n" +
                "                                          outline: none;\n" +
                "                                          text-decoration: none;\n" +
                "                                          -ms-interpolation-mode: bicubic;\n" +
                "                                          clear: both;\n" +
                "                                          display: inline-block !important;\n" +
                "                                          border: none;\n" +
                "                                          height: auto;\n" +
                "                                          float: none;\n" +
                "                                          width: 45%;\n" +
                "                                          max-width: 280px;\n" +
                "                                        \"\n" +
                "                                        width=\"120\"\n" +
                "                                        class=\"v-src-width v-src-max-width\"\n" +
                "                                      />\n" +
                "                                    </td>\n" +
                "                                  </tr>\n" +
                "                                </table>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 10px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              >\n" +
                "                                <div\n" +
                "                                  class=\"v-text-align\"\n" +
                "                                  style=\"\n" +
                "                                    color: #47484b;\n" +
                "                                    line-height: 140%;\n" +
                "                                    text-align: center;\n" +
                "                                    word-wrap: break-word;\n" +
                "                                  \"\n" +
                "                                >\n" +
                "                                  <p style=\"font-size: 14px; line-height: 140%\">\n" +
                "                                    <strong\n" +
                "                                      ><span\n" +
                "                                        style=\"\n" +
                "                                          font-size: 30px;\n" +
                "                                          line-height: 42px;\n" +
                "                                        \"\n" +
                "                                        >Xác nhận hoàn thành tiêm chủng \n" +
                "                                      </span></strong>\n" +
                "                                                                </p>\n" +
                "                                                            </div>\n" +
                "                                                        </td>\n" +
                "                                                    </tr>\n" +
                "                                                </tbody>\n" +
                "                                            </table>\n" +
                "\n" +
                "                                            <table style=\"font-family: 'Open Sans', sans-serif\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "                                                <tbody>\n" +
                "                                                    <tr>\n" +
                "                                                        <td style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 2px 40px 25px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \" align=\"left\">\n" +
                "                                                            <div class=\"v-text-align\" style=\"\n" +
                "                                    color: #7a7676;\n" +
                "                                    line-height: 170%;\n" +
                "                                    text-align: left;\n" +
                "                                    word-wrap: break-word;\n" +
                "                                  \">\n" +
                "                                                                <p style=\"\n" +
                "                                      font-size: 14px;\n" +
                "                                      line-height: 170%;\n" +
                "                                      text-align: center;\n" +
                "                                    \">\n" +
                "                                                                    <span style=\"\n" +
                "                                        font-size: 16px;\n" +
                "                                        line-height: 27.2px;\n" +
                "                                      \">V&igrave; một Việt Nam khoẻ mạnh,\n" +
                "                                      h&atilde;y ti&ecirc;m ph&ograve;ng\n" +
                "                                      vaccine</span\n" +
                "                                    >\n" +
                "                                  </p>\n" +
                "                                </div>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 0px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              >\n" +
                "                                <table\n" +
                "                                  height=\"0px\"\n" +
                "                                  align=\"center\"\n" +
                "                                  border=\"0\"\n" +
                "                                  cellpadding=\"0\"\n" +
                "                                  cellspacing=\"0\"\n" +
                "                                  width=\"90%\"\n" +
                "                                  style=\"\n" +
                "                                    border-collapse: collapse;\n" +
                "                                    table-layout: fixed;\n" +
                "                                    border-spacing: 0;\n" +
                "                                    mso-table-lspace: 0pt;\n" +
                "                                    mso-table-rspace: 0pt;\n" +
                "                                    vertical-align: top;\n" +
                "                                    border-top: 1px solid #bbbbbb;\n" +
                "                                    -ms-text-size-adjust: 100%;\n" +
                "                                    -webkit-text-size-adjust: 100%;\n" +
                "                                  \"\n" +
                "                                >\n" +
                "                                  <tbody>\n" +
                "                                    <tr style=\"vertical-align: top\">\n" +
                "                                      <td\n" +
                "                                        style=\"\n" +
                "                                          word-break: break-word;\n" +
                "                                          border-collapse: collapse !important;\n" +
                "                                          vertical-align: top;\n" +
                "                                          font-size: 0px;\n" +
                "                                          line-height: 0px;\n" +
                "                                          mso-line-height-rule: exactly;\n" +
                "                                          -ms-text-size-adjust: 100%;\n" +
                "                                          -webkit-text-size-adjust: 100%;\n" +
                "                                        \"\n" +
                "                                      >\n" +
                "                                        <span>&#160;</span>\n" +
                "                                                        </td>\n" +
                "                                                    </tr>\n" +
                "                                                </tbody>\n" +
                "                                            </table>\n" +
                "                </td>\n" +
                "            </tr>\n" +
                "        </tbody>\n" +
                "    </table>\n" +
                "\n" +
                "    <!--[if (!mso)&(!IE)]><!-->\n" +
                "    </div>\n" +
                "    <!--<![endif]-->\n" +
                "    </div>\n" +
                "    </div>\n" +
                "    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "    <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "    </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"u-row-container\" style=\"padding: 0px; background-color: transparent\">\n" +
                "        <div class=\"u-row\" style=\"\n" +
                "                  margin: 0 auto;\n" +
                "                  min-width: 320px;\n" +
                "                  max-width: 600px;\n" +
                "                  overflow-wrap: break-word;\n" +
                "                  word-wrap: break-word;\n" +
                "                  word-break: break-word;\n" +
                "                  background-color: #ffffff;\n" +
                "                \">\n" +
                "            <div style=\"\n" +
                "                    border-collapse: collapse;\n" +
                "                    display: table;\n" +
                "                    width: 100%;\n" +
                "                    background-color: transparent;\n" +
                "                  \">\n" +
                "                <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "\n" +
                "                <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                <div class=\"u-col u-col-100\" style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 600px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \">\n" +
                "                    <div style=\"width: 100% !important\">\n" +
                "                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                        <div style=\"\n" +
                "                          padding: 0px 30px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \">\n" +
                "                            <!--<![endif]-->\n" +
                "                            <table id=\"u_content_text_14\" style=\"font-family: 'Open Sans', sans-serif\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "                                <tbody>\n" +
                "                                    <tr>\n" +
                "                                        <td style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 10px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \" align=\"left\">\n" +
                "                                            <div class=\"v-text-align\" style=\"\n" +
                "                                    color: #615e5e;\n" +
                "                                    line-height: 140%;\n" +
                "                                    text-align: left;\n" +
                "                                    word-wrap: break-word;\n" +
                "                                  \">\n" +
                "                                                <p style=\"\n" +
                "                                      font-size: 14px;\n" +
                "                                      line-height: 140%;\n" +
                "                                      text-align: center;\n" +
                "                                    \">\n" +
                "                                                    <strong><span\n" +
                "                                        style=\"\n" +
                "                                          font-size: 22px;\n" +
                "                                          line-height: 19.6px;\n" +
                "                                        \"\n" +
                "                                        >Click vào\n" +
                "                                        <a\n" +
                "                                          style=\"color: rgb(26, 26, 204)\"\n" +
                "                                          href=\""+verifyURL+"\"\n" +
                "                                          >ĐÂY</a\n" +
                "                                        >\n" +
                "                                        lấy mã QR!</span\n" +
                "                                      ></strong\n" +
                "                                    >\n" +
                "                                  </p>\n" +
                "                                  <br /><br />\n" +
                "                                  <p\n" +
                "                                    style=\"\n" +
                "                                      font-size: 14px;\n" +
                "                                      line-height: 140%;\n" +
                "                                      text-align: center;\n" +
                "                                    \"\n" +
                "                                  >\n" +
                "                                    <strong\n" +
                "                                      ><span\n" +
                "                                        style=\"\n" +
                "                                          font-size: 20px;\n" +
                "                                          line-height: 19.6px;\n" +
                "                                        \"\n" +
                "                                        >Thông tin khách hàng</span\n" +
                "                                      ></strong\n" +
                "                                  </p>\n" +
                "                                </div>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                      </div>\n" +
                "                      <!--<![endif]-->\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "                  <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "\n" +
                "            <div\n" +
                "              class=\"u-row-container\"\n" +
                "              style=\"padding: 0px; background-color: transparent\"\n" +
                "            >\n" +
                "              <div\n" +
                "                class=\"u-row\"\n" +
                "                style=\"\n" +
                "                  margin: 0 auto;\n" +
                "                  min-width: 320px;\n" +
                "                  max-width: 600px;\n" +
                "                  overflow-wrap: break-word;\n" +
                "                  word-wrap: break-word;\n" +
                "                  word-break: break-word;\n" +
                "                  background-color: #ffffff;\n" +
                "                \"\n" +
                "              >\n" +
                "                <div\n" +
                "                  style=\"\n" +
                "                    border-collapse: collapse;\n" +
                "                    display: table;\n" +
                "                    width: 100%;\n" +
                "                    background-color: transparent;\n" +
                "                  \"\n" +
                "                >\n" +
                "                  <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "\n" +
                "                  <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                  <div\n" +
                "                    class=\"u-col u-col-100\"\n" +
                "                    style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 600px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \"\n" +
                "                  >\n" +
                "                    <div style=\"width: 100% !important\">\n" +
                "                      <!--[if (!mso)&(!IE)]><!--><div\n" +
                "                        style=\"\n" +
                "                          padding: 0px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \"\n" +
                "                      ><!--<![endif]-->\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 0px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              >\n" +
                "                                <table\n" +
                "                                  height=\"0px\"\n" +
                "                                  align=\"center\"\n" +
                "                                  border=\"0\"\n" +
                "                                  cellpadding=\"0\"\n" +
                "                                  cellspacing=\"0\"\n" +
                "                                  width=\"90%\"\n" +
                "                                  style=\"\n" +
                "                                    border-collapse: collapse;\n" +
                "                                    table-layout: fixed;\n" +
                "                                    border-spacing: 0;\n" +
                "                                    mso-table-lspace: 0pt;\n" +
                "                                    mso-table-rspace: 0pt;\n" +
                "                                    vertical-align: top;\n" +
                "                                    border-top: 1px solid #bbbbbb;\n" +
                "                                    -ms-text-size-adjust: 100%;\n" +
                "                                    -webkit-text-size-adjust: 100%;\n" +
                "                                  \"\n" +
                "                                >\n" +
                "                                  <tbody>\n" +
                "                                    <tr style=\"vertical-align: top\">\n" +
                "                                      <td\n" +
                "                                        style=\"\n" +
                "                                          word-break: break-word;\n" +
                "                                          border-collapse: collapse !important;\n" +
                "                                          vertical-align: top;\n" +
                "                                          font-size: 0px;\n" +
                "                                          line-height: 0px;\n" +
                "                                          mso-line-height-rule: exactly;\n" +
                "                                          -ms-text-size-adjust: 100%;\n" +
                "                                          -webkit-text-size-adjust: 100%;\n" +
                "                                        \"\n" +
                "                                      >\n" +
                "                                        <span>&#160;</span>\n" +
                "                                      </td>\n" +
                "                                    </tr>\n" +
                "                                  </tbody>\n" +
                "                                </table>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                      </div>\n" +
                "                      <!--<![endif]-->\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "                  <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "\n" +
                "            <div\n" +
                "              class=\"u-row-container\"\n" +
                "              style=\"padding: 0px; background-color: transparent\"\n" +
                "            >\n" +
                "              <div\n" +
                "                class=\"u-row no-stack\"\n" +
                "                style=\"\n" +
                "                  margin: 0 auto;\n" +
                "                  min-width: 320px;\n" +
                "                  max-width: 600px;\n" +
                "                  overflow-wrap: break-word;\n" +
                "                  word-wrap: break-word;\n" +
                "                  word-break: break-word;\n" +
                "                  background-color: #ffffff;\n" +
                "                \"\n" +
                "              >\n" +
                "                <div\n" +
                "                  style=\"\n" +
                "                    border-collapse: collapse;\n" +
                "                    display: table;\n" +
                "                    width: 100%;\n" +
                "                    background-color: transparent;\n" +
                "                  \"\n" +
                "                >\n" +
                "                  <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "\n" +
                "                  <!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                  <div\n" +
                "                    class=\"u-col u-col-50\"\n" +
                "                    style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 300px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \"\n" +
                "                  >\n" +
                "                    <div style=\"width: 100% !important\">\n" +
                "                      <!--[if (!mso)&(!IE)]><!--><div\n" +
                "                        style=\"\n" +
                "                          padding: 0px 30px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \"\n" +
                "                      ><!--<![endif]-->\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 10px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              >\n" +
                "                                <div\n" +
                "                                  class=\"v-text-align\"\n" +
                "                                  style=\"\n" +
                "                                    color: #615e5e;\n" +
                "                                    line-height: 140%;\n" +
                "                                    text-align: center;\n" +
                "                                    word-wrap: break-word;\n" +
                "                                  \"\n" +
                "                                >\n" +
                "                                  <p style=\"font-size: 14px; line-height: 140%\">\n" +
                "                                    <span\n" +
                "                                      style=\"\n" +
                "                                        font-size: 14px;\n" +
                "                                        line-height: 19.6px;\n" +
                "                                      \"\n" +
                "                                      >Họ v&agrave; t&ecirc;n</span\n" +
                "                                    >\n" +
                "                                  </p>\n" +
                "                                </div>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                      </div>\n" +
                "                      <!--<![endif]-->\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "                  <!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                  <div\n" +
                "                    class=\"u-col u-col-50\"\n" +
                "                    style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 300px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \"\n" +
                "                  >\n" +
                "                    <div style=\"width: 100% !important\">\n" +
                "                      <!--[if (!mso)&(!IE)]><!--><div\n" +
                "                        style=\"\n" +
                "                          padding: 0px 30px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \"\n" +
                "                      ><!--<![endif]-->\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 10px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              >\n" +
                "                                <div\n" +
                "                                  class=\"v-text-align\"\n" +
                "                                  style=\"\n" +
                "                                    color: #615e5e;\n" +
                "                                    line-height: 140%;\n" +
                "                                    text-align: center;\n" +
                "                                    word-wrap: break-word;\n" +
                "                                  \"\n" +
                "                                >\n" +
                "                                  <p style=\"font-size: 14px; line-height: 140%\">\n" +
                "                                    <span\n" +
                "                                      style=\"\n" +
                "                                        font-size: 14px;\n" +
                "                                        line-height: 19.6px;\n" +
                "                                      \"\n" +
                "                                      >"+fullName+"</span\n" +
                "                                    >\n" +
                "                                  </p>\n" +
                "                                </div>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                      </div>\n" +
                "                      <!--<![endif]-->\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "                  <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div\n" +
                "              class=\"u-row-container\"\n" +
                "              style=\"padding: 0px; background-color: transparent\"\n" +
                "            >\n" +
                "              <div\n" +
                "                class=\"u-row no-stack\"\n" +
                "                style=\"\n" +
                "                  margin: 0 auto;\n" +
                "                  min-width: 320px;\n" +
                "                  max-width: 600px;\n" +
                "                  overflow-wrap: break-word;\n" +
                "                  word-wrap: break-word;\n" +
                "                  word-break: break-word;\n" +
                "                  background-color: #ffffff;\n" +
                "                \"\n" +
                "              >\n" +
                "                <div\n" +
                "                  style=\"\n" +
                "                    border-collapse: collapse;\n" +
                "                    display: table;\n" +
                "                    width: 100%;\n" +
                "                    background-color: transparent;\n" +
                "                  \"\n" +
                "                >\n" +
                "                  <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "\n" +
                "                  <!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                  <div\n" +
                "                    class=\"u-col u-col-50\"\n" +
                "                    style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 300px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \"\n" +
                "                  >\n" +
                "                    <div style=\"width: 100% !important\">\n" +
                "                      <!--[if (!mso)&(!IE)]><!--><div\n" +
                "                        style=\"\n" +
                "                          padding: 0px 30px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \"\n" +
                "                      ><!--<![endif]-->\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 10px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              >\n" +
                "                                <div\n" +
                "                                  class=\"v-text-align\"\n" +
                "                                  style=\"\n" +
                "                                    color: #615e5e;\n" +
                "                                    line-height: 140%;\n" +
                "                                    text-align: center;\n" +
                "                                    word-wrap: break-word;\n" +
                "                                  \"\n" +
                "                                >\n" +
                "                                  <p style=\"font-size: 14px; line-height: 140%\">\n" +
                "                                    <span\n" +
                "                                      style=\"\n" +
                "                                        font-size: 14px;\n" +
                "                                        line-height: 19.6px;\n" +
                "                                      \"\n" +
                "                                      >Số chứng minh thư</span\n" +
                "                                    >\n" +
                "                                  </p>\n" +
                "                                </div>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                      </div>\n" +
                "                      <!--<![endif]-->\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "                  <!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                  <div\n" +
                "                    class=\"u-col u-col-50\"\n" +
                "                    style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 300px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \"\n" +
                "                  >\n" +
                "                    <div style=\"width: 100% !important\">\n" +
                "                      <!--[if (!mso)&(!IE)]><!--><div\n" +
                "                        style=\"\n" +
                "                          padding: 0px 30px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \"\n" +
                "                      ><!--<![endif]-->\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 10px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              >\n" +
                "                                <div\n" +
                "                                  class=\"v-text-align\"\n" +
                "                                  style=\"\n" +
                "                                    color: #615e5e;\n" +
                "                                    line-height: 140%;\n" +
                "                                    text-align: center;\n" +
                "                                    word-wrap: break-word;\n" +
                "                                  \"\n" +
                "                                >\n" +
                "                                  <p style=\"font-size: 14px; line-height: 140%\">\n" +
                "                                    <span\n" +
                "                                      style=\"\n" +
                "                                        font-size: 14px;\n" +
                "                                        line-height: 19.6px;\n" +
                "                                      \"\n" +
                "                                      >"+CMND+"</span\n" +
                "                                    >\n" +
                "                                  </p>\n" +
                "                                </div>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                      </div>\n" +
                "                      <!--<![endif]-->\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "                  <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div\n" +
                "              class=\"u-row-container\"\n" +
                "              style=\"padding: 0px; background-color: transparent\"\n" +
                "            >\n" +
                "              <div\n" +
                "                class=\"u-row no-stack\"\n" +
                "                style=\"\n" +
                "                  margin: 0 auto;\n" +
                "                  min-width: 320px;\n" +
                "                  max-width: 600px;\n" +
                "                  overflow-wrap: break-word;\n" +
                "                  word-wrap: break-word;\n" +
                "                  word-break: break-word;\n" +
                "                  background-color: #ffffff;\n" +
                "                \"\n" +
                "              >\n" +
                "                <div\n" +
                "                  style=\"\n" +
                "                    border-collapse: collapse;\n" +
                "                    display: table;\n" +
                "                    width: 100%;\n" +
                "                    background-color: transparent;\n" +
                "                  \"\n" +
                "                >\n" +
                "                  <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "\n" +
                "                  <!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                  <div\n" +
                "                    class=\"u-col u-col-50\"\n" +
                "                    style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 300px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \"\n" +
                "                  >\n" +
                "                    <div style=\"width: 100% !important\">\n" +
                "                      <!--[if (!mso)&(!IE)]><!--><div\n" +
                "                        style=\"\n" +
                "                          padding: 0px 30px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \"\n" +
                "                      ><!--<![endif]-->\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 10px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              >\n" +
                "                                <div\n" +
                "                                  class=\"v-text-align\"\n" +
                "                                  style=\"\n" +
                "                                    color: #615e5e;\n" +
                "                                    line-height: 140%;\n" +
                "                                    text-align: center;\n" +
                "                                    word-wrap: break-word;\n" +
                "                                  \"\n" +
                "                                >\n" +
                "                                  <p style=\"font-size: 14px; line-height: 140%\">\n" +
                "                                    <span\n" +
                "                                      style=\"\n" +
                "                                        font-size: 20px;\n" +
                "                                        line-height: 23px;\n" +
                "                                        font-weight: bold;\n" +
                "                                        color: crimson;\n" +
                "                                      \"\n" +
                "                                      >Trạng thái</span\n" +
                "                                    >\n" +
                "                                  </p>\n" +
                "                                </div>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                      </div>\n" +
                "                      <!--<![endif]-->\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "                  <!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                  <div\n" +
                "                    class=\"u-col u-col-50\"\n" +
                "                    style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 300px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \"\n" +
                "                  >\n" +
                "                    <div style=\"width: 100% !important\">\n" +
                "                      <!--[if (!mso)&(!IE)]><!--><div\n" +
                "                        style=\"\n" +
                "                          padding: 0px 30px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \"\n" +
                "                      ><!--<![endif]-->\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 10px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              >\n" +
                "                                <div\n" +
                "                                  class=\"v-text-align\"\n" +
                "                                  style=\"\n" +
                "                                    color: #615e5e;\n" +
                "                                    line-height: 140%;\n" +
                "                                    text-align: center;\n" +
                "                                    word-wrap: break-word;\n" +
                "                                  \"\n" +
                "                                >\n" +
                "                                  <p style=\"font-size: 14px; line-height: 140%\">\n" +
                "                                    <span\n" +
                "                                      style=\"\n" +
                "                                        font-size: 14px;\n" +
                "                                        line-height: 19.6px;\n" +
                "                                      \"\n" +
                "                                      >"+checkStatus(status)+"</span\n" +
                "                                    >\n" +
                "                                  </p>\n" +
                "                                </div>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                      </div>\n" +
                "                      <!--<![endif]-->\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "                  <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "\n" +
                "            <div\n" +
                "              class=\"u-row-container\"\n" +
                "              style=\"padding: 0px; background-color: transparent\"\n" +
                "            >\n" +
                "              <div\n" +
                "                class=\"u-row no-stack\"\n" +
                "                style=\"\n" +
                "                  margin: 0 auto;\n" +
                "                  min-width: 320px;\n" +
                "                  max-width: 600px;\n" +
                "                  overflow-wrap: break-word;\n" +
                "                  word-wrap: break-word;\n" +
                "                  word-break: break-word;\n" +
                "                  background-color: #ffffff;\n" +
                "                \"\n" +
                "              >\n" +
                "                <div\n" +
                "                  style=\"\n" +
                "                    border-collapse: collapse;\n" +
                "                    display: table;\n" +
                "                    width: 100%;\n" +
                "                    background-color: transparent;\n" +
                "                  \"\n" +
                "                >\n" +
                "                  <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "\n" +
                "                  <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                  <div\n" +
                "                    class=\"u-col u-col-100\"\n" +
                "                    style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 600px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \"\n" +
                "                  >\n" +
                "                    <div style=\"width: 100% !important\">\n" +
                "                      <!--[if (!mso)&(!IE)]><!--><div\n" +
                "                        style=\"\n" +
                "                          padding: 0px 30px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \"\n" +
                "                      ><!--<![endif]-->\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 10px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              ></td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                      </div>\n" +
                "                      <!--<![endif]-->\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "                  <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "\n" +
                "            <div\n" +
                "              class=\"u-row-container\"\n" +
                "              style=\"padding: 0px; background-color: transparent\"\n" +
                "            >\n" +
                "              <div\n" +
                "                class=\"u-row\"\n" +
                "                style=\"\n" +
                "                  margin: 0 auto;\n" +
                "                  min-width: 320px;\n" +
                "                  max-width: 600px;\n" +
                "                  overflow-wrap: break-word;\n" +
                "                  word-wrap: break-word;\n" +
                "                  word-break: break-word;\n" +
                "                  background-color: transparent;\n" +
                "                \"\n" +
                "              >\n" +
                "                <div\n" +
                "                  style=\"\n" +
                "                    border-collapse: collapse;\n" +
                "                    display: table;\n" +
                "                    width: 100%;\n" +
                "                    background-color: transparent;\n" +
                "                  \"\n" +
                "                >\n" +
                "                  <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
                "\n" +
                "                  <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                  <div\n" +
                "                    class=\"u-col u-col-100\"\n" +
                "                    style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 600px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \"\n" +
                "                  >\n" +
                "                    <div style=\"width: 100% !important\">\n" +
                "                      <!--[if (!mso)&(!IE)]><!--><div\n" +
                "                        style=\"\n" +
                "                          padding: 0px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \"\n" +
                "                      ><!--<![endif]-->\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 10px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              >\n" +
                "                                <div\n" +
                "                                  class=\"v-text-align\"\n" +
                "                                  style=\"\n" +
                "                                    line-height: 140%;\n" +
                "                                    text-align: left;\n" +
                "                                    word-wrap: break-word;\n" +
                "                                  \"\n" +
                "                                >\n" +
                "                                  <p\n" +
                "                                    style=\"\n" +
                "                                      font-size: 14px;\n" +
                "                                      line-height: 140%;\n" +
                "                                      text-align: center;\n" +
                "                                    \"\n" +
                "                                  >\n" +
                "                                    <strong\n" +
                "                                      ><span\n" +
                "                                        style=\"\n" +
                "                                          font-size: 18px;\n" +
                "                                          line-height: 25.2px;\n" +
                "                                        \"\n" +
                "                                        ><em\n" +
                "                                          >Mọi th&ocirc;ng tin xin li&ecirc;n hệ\n" +
                "                                          <span\n" +
                "                                            style=\"\n" +
                "                                              color: #e03e2d;\n" +
                "                                              font-size: 18px;\n" +
                "                                              line-height: 25.2px;\n" +
                "                                            \"\n" +
                "                                            >0365503545 </span\n" +
                "                                          >để được hỗ trợ!</em\n" +
                "                                        ></span\n" +
                "                                      ></strong\n" +
                "                                    >\n" +
                "                                  </p>\n" +
                "                                </div>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                      </div>\n" +
                "                      <!--<![endif]-->\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "                  <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div\n" +
                "              class=\"u-row-container\"\n" +
                "              style=\"padding: 0px; background-color: transparent\"\n" +
                "            >\n" +
                "              <div\n" +
                "                class=\"u-row\"\n" +
                "                style=\"\n" +
                "                  margin: 0 auto;\n" +
                "                  min-width: 320px;\n" +
                "                  max-width: 600px;\n" +
                "                  overflow-wrap: break-word;\n" +
                "                  word-wrap: break-word;\n" +
                "                  word-break: break-word;\n" +
                "                  background-color: #ffffff;\n" +
                "                \"\n" +
                "              >\n" +
                "                <div\n" +
                "                  style=\"\n" +
                "                    border-collapse: collapse;\n" +
                "                    display: table;\n" +
                "                    width: 100%;\n" +
                "                    background-color: transparent;\n" +
                "                  \"\n" +
                "                >\n" +
                "                  <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "\n" +
                "                  <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                  <div\n" +
                "                    class=\"u-col u-col-100\"\n" +
                "                    style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 600px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \"\n" +
                "                  >\n" +
                "                    <div style=\"width: 100% !important\">\n" +
                "                      <!--[if (!mso)&(!IE)]><!--><div\n" +
                "                        style=\"\n" +
                "                          padding: 0px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \"\n" +
                "                      ><!--<![endif]-->\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 0px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              >\n" +
                "                                <table\n" +
                "                                  height=\"0px\"\n" +
                "                                  align=\"center\"\n" +
                "                                  border=\"0\"\n" +
                "                                  cellpadding=\"0\"\n" +
                "                                  cellspacing=\"0\"\n" +
                "                                  width=\"90%\"\n" +
                "                                  style=\"\n" +
                "                                    border-collapse: collapse;\n" +
                "                                    table-layout: fixed;\n" +
                "                                    border-spacing: 0;\n" +
                "                                    mso-table-lspace: 0pt;\n" +
                "                                    mso-table-rspace: 0pt;\n" +
                "                                    vertical-align: top;\n" +
                "                                    border-top: 1px solid #bbbbbb;\n" +
                "                                    -ms-text-size-adjust: 100%;\n" +
                "                                    -webkit-text-size-adjust: 100%;\n" +
                "                                  \"\n" +
                "                                >\n" +
                "                                  <tbody>\n" +
                "                                    <tr style=\"vertical-align: top\">\n" +
                "                                      <td\n" +
                "                                        style=\"\n" +
                "                                          word-break: break-word;\n" +
                "                                          border-collapse: collapse !important;\n" +
                "                                          vertical-align: top;\n" +
                "                                          font-size: 0px;\n" +
                "                                          line-height: 0px;\n" +
                "                                          mso-line-height-rule: exactly;\n" +
                "                                          -ms-text-size-adjust: 100%;\n" +
                "                                          -webkit-text-size-adjust: 100%;\n" +
                "                                        \"\n" +
                "                                      >\n" +
                "                                        <span>&#160;</span>\n" +
                "                                      </td>\n" +
                "                                    </tr>\n" +
                "                                  </tbody>\n" +
                "                                </table>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 10px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              >\n" +
                "                                <div align=\"center\">\n" +
                "                                  <div style=\"display: table; max-width: 140px\">\n" +
                "                                    <!--[if (mso)|(IE)]><table width=\"140\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"border-collapse:collapse;\" align=\"center\"><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse; mso-table-lspace: 0pt;mso-table-rspace: 0pt; width:140px;\"><tr><![endif]-->\n" +
                "\n" +
                "                                    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 15px;\" valign=\"top\"><![endif]-->\n" +
                "                                    <table\n" +
                "                                      align=\"left\"\n" +
                "                                      border=\"0\"\n" +
                "                                      cellspacing=\"0\"\n" +
                "                                      cellpadding=\"0\"\n" +
                "                                      width=\"32\"\n" +
                "                                      height=\"32\"\n" +
                "                                      style=\"\n" +
                "                                        border-collapse: collapse;\n" +
                "                                        table-layout: fixed;\n" +
                "                                        border-spacing: 0;\n" +
                "                                        mso-table-lspace: 0pt;\n" +
                "                                        mso-table-rspace: 0pt;\n" +
                "                                        vertical-align: top;\n" +
                "                                        margin-right: 15px;\n" +
                "                                      \"\n" +
                "                                    >\n" +
                "                                      <tbody>\n" +
                "                                        <tr style=\"vertical-align: top\">\n" +
                "                                          <td\n" +
                "                                            align=\"left\"\n" +
                "                                            valign=\"middle\"\n" +
                "                                            style=\"\n" +
                "                                              word-break: break-word;\n" +
                "                                              border-collapse: collapse !important;\n" +
                "                                              vertical-align: top;\n" +
                "                                            \"\n" +
                "                                          >\n" +
                "                                            <a\n" +
                "                                              href=\"https://facebook.com/\"\n" +
                "                                              title=\"Facebook\"\n" +
                "                                              target=\"_blank\"\n" +
                "                                            >\n" +
                "                                              <img\n" +
                "                                                src=\"https://cdn.tools.unlayer.com/social/icons/circle/facebook.png\"\n" +
                "                                                alt=\"Facebook\"\n" +
                "                                                title=\"Facebook\"\n" +
                "                                                width=\"32\"\n" +
                "                                                style=\"\n" +
                "                                                  outline: none;\n" +
                "                                                  text-decoration: none;\n" +
                "                                                  -ms-interpolation-mode: bicubic;\n" +
                "                                                  clear: both;\n" +
                "                                                  display: block !important;\n" +
                "                                                  border: none;\n" +
                "                                                  height: auto;\n" +
                "                                                  float: none;\n" +
                "                                                  max-width: 32px !important;\n" +
                "                                                \"\n" +
                "                                              />\n" +
                "                                            </a>\n" +
                "                                          </td>\n" +
                "                                        </tr>\n" +
                "                                      </tbody>\n" +
                "                                    </table>\n" +
                "                                    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "\n" +
                "                                    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 15px;\" valign=\"top\"><![endif]-->\n" +
                "                                    <table\n" +
                "                                      align=\"left\"\n" +
                "                                      border=\"0\"\n" +
                "                                      cellspacing=\"0\"\n" +
                "                                      cellpadding=\"0\"\n" +
                "                                      width=\"32\"\n" +
                "                                      height=\"32\"\n" +
                "                                      style=\"\n" +
                "                                        border-collapse: collapse;\n" +
                "                                        table-layout: fixed;\n" +
                "                                        border-spacing: 0;\n" +
                "                                        mso-table-lspace: 0pt;\n" +
                "                                        mso-table-rspace: 0pt;\n" +
                "                                        vertical-align: top;\n" +
                "                                        margin-right: 15px;\n" +
                "                                      \"\n" +
                "                                    >\n" +
                "                                      <tbody>\n" +
                "                                        <tr style=\"vertical-align: top\">\n" +
                "                                          <td\n" +
                "                                            align=\"left\"\n" +
                "                                            valign=\"middle\"\n" +
                "                                            style=\"\n" +
                "                                              word-break: break-word;\n" +
                "                                              border-collapse: collapse !important;\n" +
                "                                              vertical-align: top;\n" +
                "                                            \"\n" +
                "                                          >\n" +
                "                                            <a\n" +
                "                                              href=\"https://instagram.com/\"\n" +
                "                                              title=\"Instagram\"\n" +
                "                                              target=\"_blank\"\n" +
                "                                            >\n" +
                "                                              <img\n" +
                "                                                src=\"https://cdn.tools.unlayer.com/social/icons/circle/instagram.png\"\n" +
                "                                                alt=\"Instagram\"\n" +
                "                                                title=\"Instagram\"\n" +
                "                                                width=\"32\"\n" +
                "                                                style=\"\n" +
                "                                                  outline: none;\n" +
                "                                                  text-decoration: none;\n" +
                "                                                  -ms-interpolation-mode: bicubic;\n" +
                "                                                  clear: both;\n" +
                "                                                  display: block !important;\n" +
                "                                                  border: none;\n" +
                "                                                  height: auto;\n" +
                "                                                  float: none;\n" +
                "                                                  max-width: 32px !important;\n" +
                "                                                \"\n" +
                "                                              />\n" +
                "                                            </a>\n" +
                "                                          </td>\n" +
                "                                        </tr>\n" +
                "                                      </tbody>\n" +
                "                                    </table>\n" +
                "                                    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "\n" +
                "                                    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 0px;\" valign=\"top\"><![endif]-->\n" +
                "                                    <table\n" +
                "                                      align=\"left\"\n" +
                "                                      border=\"0\"\n" +
                "                                      cellspacing=\"0\"\n" +
                "                                      cellpadding=\"0\"\n" +
                "                                      width=\"32\"\n" +
                "                                      height=\"32\"\n" +
                "                                      style=\"\n" +
                "                                        border-collapse: collapse;\n" +
                "                                        table-layout: fixed;\n" +
                "                                        border-spacing: 0;\n" +
                "                                        mso-table-lspace: 0pt;\n" +
                "                                        mso-table-rspace: 0pt;\n" +
                "                                        vertical-align: top;\n" +
                "                                        margin-right: 0px;\n" +
                "                                      \"\n" +
                "                                    >\n" +
                "                                      <tbody>\n" +
                "                                        <tr style=\"vertical-align: top\">\n" +
                "                                          <td\n" +
                "                                            align=\"left\"\n" +
                "                                            valign=\"middle\"\n" +
                "                                            style=\"\n" +
                "                                              word-break: break-word;\n" +
                "                                              border-collapse: collapse !important;\n" +
                "                                              vertical-align: top;\n" +
                "                                            \"\n" +
                "                                          >\n" +
                "                                            <a\n" +
                "                                              href=\"https://twitter.com/\"\n" +
                "                                              title=\"Twitter\"\n" +
                "                                              target=\"_blank\"\n" +
                "                                            >\n" +
                "                                              <img\n" +
                "                                                src=\"https://cdn.tools.unlayer.com/social/icons/circle/twitter.png\"\n" +
                "                                                alt=\"Twitter\"\n" +
                "                                                title=\"Twitter\"\n" +
                "                                                width=\"32\"\n" +
                "                                                style=\"\n" +
                "                                                  outline: none;\n" +
                "                                                  text-decoration: none;\n" +
                "                                                  -ms-interpolation-mode: bicubic;\n" +
                "                                                  clear: both;\n" +
                "                                                  display: block !important;\n" +
                "                                                  border: none;\n" +
                "                                                  height: auto;\n" +
                "                                                  float: none;\n" +
                "                                                  max-width: 32px !important;\n" +
                "                                                \"\n" +
                "                                              />\n" +
                "                                            </a>\n" +
                "                                          </td>\n" +
                "                                        </tr>\n" +
                "                                      </tbody>\n" +
                "                                    </table>\n" +
                "                                    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "\n" +
                "                                    <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "                                  </div>\n" +
                "                                </div>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                      </div>\n" +
                "                      <!--<![endif]-->\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "                  <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "\n" +
                "            <div\n" +
                "              class=\"u-row-container\"\n" +
                "              style=\"padding: 0px; background-color: transparent\"\n" +
                "            >\n" +
                "              <div\n" +
                "                class=\"u-row\"\n" +
                "                style=\"\n" +
                "                  margin: 0 auto;\n" +
                "                  min-width: 320px;\n" +
                "                  max-width: 600px;\n" +
                "                  overflow-wrap: break-word;\n" +
                "                  word-wrap: break-word;\n" +
                "                  word-break: break-word;\n" +
                "                  background-color: #236fa1;\n" +
                "                \"\n" +
                "              >\n" +
                "                <div\n" +
                "                  style=\"\n" +
                "                    border-collapse: collapse;\n" +
                "                    display: table;\n" +
                "                    width: 100%;\n" +
                "                    background-color: transparent;\n" +
                "                  \"\n" +
                "                >\n" +
                "                  <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #236fa1;\"><![endif]-->\n" +
                "\n" +
                "                  <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "                  <div\n" +
                "                    class=\"u-col u-col-100\"\n" +
                "                    style=\"\n" +
                "                      max-width: 320px;\n" +
                "                      min-width: 600px;\n" +
                "                      display: table-cell;\n" +
                "                      vertical-align: top;\n" +
                "                    \"\n" +
                "                  >\n" +
                "                    <div style=\"width: 100% !important\">\n" +
                "                      <!--[if (!mso)&(!IE)]><!--><div\n" +
                "                        style=\"\n" +
                "                          padding: 0px;\n" +
                "                          border-top: 0px solid transparent;\n" +
                "                          border-left: 0px solid transparent;\n" +
                "                          border-right: 0px solid transparent;\n" +
                "                          border-bottom: 0px solid transparent;\n" +
                "                        \"\n" +
                "                      ><!--<![endif]-->\n" +
                "                        <table\n" +
                "                          style=\"font-family: 'Open Sans', sans-serif\"\n" +
                "                          role=\"presentation\"\n" +
                "                          cellpadding=\"0\"\n" +
                "                          cellspacing=\"0\"\n" +
                "                          width=\"100%\"\n" +
                "                          border=\"0\"\n" +
                "                        >\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td\n" +
                "                                style=\"\n" +
                "                                  overflow-wrap: break-word;\n" +
                "                                  word-break: break-word;\n" +
                "                                  padding: 16px;\n" +
                "                                  font-family: 'Open Sans', sans-serif;\n" +
                "                                \"\n" +
                "                                align=\"left\"\n" +
                "                              >\n" +
                "                                <div\n" +
                "                                  class=\"v-text-align\"\n" +
                "                                  style=\"\n" +
                "                                    color: #ecf7ff;\n" +
                "                                    line-height: 140%;\n" +
                "                                    text-align: center;\n" +
                "                                    word-wrap: break-word;\n" +
                "                                  \"\n" +
                "                                >\n" +
                "                                  <p style=\"font-size: 14px; line-height: 140%\">\n" +
                "                                    &copy; VaccineVIetNam. All Rights Reserved\n" +
                "                                  </p>\n" +
                "                                </div>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "\n" +
                "                        <!--[if (!mso)&(!IE)]><!-->\n" +
                "                      </div>\n" +
                "                      <!--<![endif]-->\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "                  <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "\n" +
                "            <!--[if (mso)|(IE)]></td></tr></table><![endif]-->\n" +
                "          </td>\n" +
                "        </tr>\n" +
                "      </tbody>\n" +
                "    </table>\n" +
                "    <!--[if mso]></div><![endif]-->\n" +
                "    <!--[if IE]></div><![endif]-->\n" +
                "  </body>\n" +
                "</html>";
        return  text;
    }

    public String getPassword(){
        String text = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
                "<head>\n" +
                "<!--[if gte mso 9]>\n" +
                "<xml>\n" +
                "  <o:OfficeDocumentSettings>\n" +
                "    <o:AllowPNG/>\n" +
                "    <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
                "  </o:OfficeDocumentSettings>\n" +
                "</xml>\n" +
                "<![endif]-->\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <meta name=\"x-apple-disable-message-reformatting\">\n" +
                "  <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->\n" +
                "  <title></title>\n" +
                "  \n" +
                "    <style type=\"text/css\">\n" +
                "\n" +
                "      table, td { color: #000000; } a { color: #6d6d6d; text-decoration: none; } @media (max-width: 480px) { #u_content_image_1 .v-src-width { width: auto !important; } #u_content_image_1 .v-src-max-width { max-width: 50% !important; } #u_content_text_1 .v-text-align { text-align: center !important; } #u_content_text_14 .v-text-align { text-align: center !important; } #u_content_text_15 .v-text-align { text-align: center !important; } }\n" +
                "@media only screen and (min-width: 620px) {\n" +
                "  .u-row {\n" +
                "    width: 600px !important;\n" +
                "  }\n" +
                "  .u-row .u-col {\n" +
                "    vertical-align: top;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-33p33 {\n" +
                "    width: 199.98px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-50 {\n" +
                "    width: 300px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-66p67 {\n" +
                "    width: 400.02px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-100 {\n" +
                "    width: 600px !important;\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "@media (max-width: 620px) {\n" +
                "  .u-row-container {\n" +
                "    max-width: 100% !important;\n" +
                "    padding-left: 0px !important;\n" +
                "    padding-right: 0px !important;\n" +
                "  }\n" +
                "  .u-row .u-col {\n" +
                "    min-width: 320px !important;\n" +
                "    max-width: 100% !important;\n" +
                "    display: block !important;\n" +
                "  }\n" +
                "  .u-row {\n" +
                "    width: calc(100% - 40px) !important;\n" +
                "  }\n" +
                "  .u-col {\n" +
                "    width: 100% !important;\n" +
                "  }\n" +
                "  .u-col > div {\n" +
                "    margin: 0 auto;\n" +
                "  }\n" +
                "  .no-stack .u-col {\n" +
                "    min-width: 0 !important;\n" +
                "    display: table-cell !important;\n" +
                "  }\n" +
                "\n" +
                ".no-stack .u-col-50 {\n" +
                "    width: 50% !important;\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "body {\n" +
                "  margin: 0;\n" +
                "  padding: 0;\n" +
                "}\n" +
                "\n" +
                "table,\n" +
                "tr,\n" +
                "td {\n" +
                "  vertical-align: top;\n" +
                "  border-collapse: collapse;\n" +
                "}\n" +
                "\n" +
                "p {\n" +
                "  margin: 0;\n" +
                "}\n" +
                "\n" +
                ".ie-container table,\n" +
                ".mso-container table {\n" +
                "  table-layout: fixed;\n" +
                "}\n" +
                "\n" +
                "* {\n" +
                "  line-height: inherit;\n" +
                "}\n" +
                "\n" +
                "a[x-apple-data-detectors='true'] {\n" +
                "  color: inherit !important;\n" +
                "  text-decoration: none !important;\n" +
                "}\n" +
                "\n" +
                "@media (max-width: 480px) {\n" +
                "  .hide-mobile {\n" +
                "    display: none !important;\n" +
                "    max-height: 0px;\n" +
                "    overflow: hidden;\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "    </style>\n" +
                "  \n" +
                "  \n" +
                "\n" +
                "<!--[if !mso]><!--><link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700&display=swap\" rel=\"stylesheet\" type=\"text/css\"><!--<![endif]-->\n" +
                "\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"clean-body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #eeeeee;color: #000000\">\n" +
                "  <!--[if IE]><div class=\"ie-container\"><![endif]-->\n" +
                "  <!--[if mso]><div class=\"mso-container\"><![endif]-->\n" +
                "  <table style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #eeeeee;width:100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "  <tbody>\n" +
                "  <tr style=\"vertical-align: top\">\n" +
                "    <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #eeeeee;\"><![endif]-->\n" +
                "    \n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #3598db;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #3598db;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"200\" style=\"width: 200px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-33p33\" style=\"max-width: 320px;min-width: 200px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table id=\"u_content_image_1\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:31px 10px 25px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "  <tr>\n" +
                "    <td class=\"v-text-align\" style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
                "      \n" +
                "      <img align=\"center\" border=\"0\" src=\"https://vnvc.vn/favicon.ico\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 23%;max-width: 41.4px;\" width=\"41.4\" class=\"v-src-width v-src-max-width\"/>\n" +
                "      \n" +
                "    </td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"400\" style=\"width: 400px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-66p67\" style=\"max-width: 320px;min-width: 400px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table class=\"hide-mobile\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #3598db;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table id=\"u_content_text_1\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:13px 26px 16px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #ffffff; line-height: 140%; text-align: right; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 18px; line-height: 25.2px;\">Hệ thống ti&ecirc;m chủng vaccine Việt Nam</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:40px 10px 10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "  <tr>\n" +
                "    <td class=\"v-text-align\" style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
                "      \n" +
                "      <img align=\"center\" border=\"0\" src=\"https://cdn.templates.unlayer.com/assets/1594973454042-618167-200.png\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 17%;max-width: 98.6px;\" width=\"98.6\" class=\"v-src-width v-src-max-width\"/>\n" +
                "      \n" +
                "    </td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #47484b; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><strong><span style=\"font-size: 30px; line-height: 42px;\">Lấy lại mật khẩu khách hàng</span></strong></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:2px 40px 25px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #7a7676; line-height: 170%; text-align: left; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 170%; text-align: center;\"><span style=\"font-size: 16px; line-height: 27.2px;\">V&igrave; một Việt Nam khoẻ mạnh, h&atilde;y ti&ecirc;m ph&ograve;ng vaccine</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table id=\"u_content_text_14\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: left; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 22px; line-height: 19.6px;\">Thông tin khách hàng</span></strong></p>"+
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +

                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +

                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row no-stack\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">Họ v&agrave; t&ecirc;n</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">"+fullName+"</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +

                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row no-stack\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: left; word-wrap: break-word;\">\n" +
                "    <a href=\""+link+"\"><p style=\"font-size: 15px;color: red; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 14px; line-height: 19.6px;\">Click đây để tạo mới mật khẩu</span></strong></p></a>\n" +
                "    \n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "    <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
                "      <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "        <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
                "        \n" +
                "  <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "  <div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "    <div style=\"width: 100% !important;\">\n" +
                "    <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "    \n" +
                "  <table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "    <div class=\"v-text-align\" style=\"line-height: 140%; text-align: left; word-wrap: break-word;\">\n" +
                "      <p style=\"font-size: 14px; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 18px; line-height: 25.2px;\"><em>Mọi th&ocirc;ng tin xin li&ecirc;n hệ <span style=\"color: #e03e2d; font-size: 18px; line-height: 25.2px;\">0365503545 </span>để được hỗ trợ!</em></span></strong></p>\n" +
                "    </div>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "  <table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "    <div class=\"v-text-align\" style=\"line-height: 140%; text-align: left; word-wrap: break-word;\">\n" +
                "      <p style=\"font-size: 14px; line-height: 140%; text-align: right;\"><span style=\"color: #e67e23; font-size: 14px; line-height: 19.6px;\"><em><span style=\"font-size: 14px; line-height: 19.6px;\">(*) Tuỳ v&agrave;o kết quả đăng k&yacute;</span></em></span></p>\n" +
                "    </div>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "    <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "        <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "    <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "      <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "        <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "        \n" +
                "  <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "  <div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "    <div style=\"width: 100% !important;\">\n" +
                "    <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "    \n" +
                "  <table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "    <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "      <tbody>\n" +
                "        <tr style=\"vertical-align: top\">\n" +
                "          <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "            <span>&#160;</span>\n" +
                "          </td>\n" +
                "        </tr>\n" +
                "      </tbody>\n" +
                "    </table>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "  <table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "    <tbody>\n" +
                "      <tr>\n" +
                "        <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "          \n" +
                "  <div align=\"center\">\n" +
                "    <div style=\"display: table; max-width:140px;\">\n" +
                "    <!--[if (mso)|(IE)]><table width=\"140\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"border-collapse:collapse;\" align=\"center\"><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse; mso-table-lspace: 0pt;mso-table-rspace: 0pt; width:140px;\"><tr><![endif]-->\n" +
                "    \n" +
                "      \n" +
                "      <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 15px;\" valign=\"top\"><![endif]-->\n" +
                "      <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 15px\">\n" +
                "        <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "          <a href=\"https://facebook.com/\" title=\"Facebook\" target=\"_blank\">\n" +
                "            <img src=\"https://cdn.tools.unlayer.com/social/icons/circle/facebook.png\" alt=\"Facebook\" title=\"Facebook\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "          </a>\n" +
                "        </td></tr>\n" +
                "      </tbody></table>\n" +
                "      <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      \n" +
                "      <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 15px;\" valign=\"top\"><![endif]-->\n" +
                "      <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 15px\">\n" +
                "        <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "          <a href=\"https://instagram.com/\" title=\"Instagram\" target=\"_blank\">\n" +
                "            <img src=\"https://cdn.tools.unlayer.com/social/icons/circle/instagram.png\" alt=\"Instagram\" title=\"Instagram\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "          </a>\n" +
                "        </td></tr>\n" +
                "      </tbody></table>\n" +
                "      <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      \n" +
                "      <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 0px;\" valign=\"top\"><![endif]-->\n" +
                "      <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 0px\">\n" +
                "        <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "          <a href=\"https://twitter.com/\" title=\"Twitter\" target=\"_blank\">\n" +
                "            <img src=\"https://cdn.tools.unlayer.com/social/icons/circle/twitter.png\" alt=\"Twitter\" title=\"Twitter\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "          </a>\n" +
                "        </td></tr>\n" +
                "      </tbody></table>\n" +
                "      <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      \n" +
                "      \n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  \n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "  \n" +
                "    <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "        <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #236fa1;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #236fa1;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:16px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #ecf7ff; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\">&copy; VaccineVIetNam. All Rights Reserved</p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "    <!--[if (mso)|(IE)]></td></tr></table><![endif]-->\n" +
                "    </td>\n" +
                "  </tr>\n" +
                "  </tbody>\n" +
                "  </table>\n" +
                "  <!--[if mso]></div><![endif]-->\n" +
                "  <!--[if IE]></div><![endif]-->\n" +
                "</body>\n" +
                "\n" +
                "</html>\n";
        return text;
    }


    public String sentVerifyAccountEmail() {

        String mail = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
                "<head>\n" +
                "<!--[if gte mso 9]>\n" +
                "<xml>\n" +
                "  <o:OfficeDocumentSettings>\n" +
                "    <o:AllowPNG/>\n" +
                "    <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
                "  </o:OfficeDocumentSettings>\n" +
                "</xml>\n" +
                "<![endif]-->\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <meta name=\"x-apple-disable-message-reformatting\">\n" +
                "  <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->\n" +
                "  <title></title>\n" +
                "  \n" +
                "    <style type=\"text/css\">\n" +
                "\n" +
                "      table, td { color: #000000; } a { color: #6d6d6d; text-decoration: none; } @media (max-width: 480px) { #u_content_image_1 .v-src-width { width: auto !important; } #u_content_image_1 .v-src-max-width { max-width: 50% !important; } #u_content_text_1 .v-text-align { text-align: center !important; } #u_content_text_14 .v-text-align { text-align: center !important; } #u_content_text_15 .v-text-align { text-align: center !important; } }\n" +
                "@media only screen and (min-width: 620px) {\n" +
                "  .u-row {\n" +
                "    width: 600px !important;\n" +
                "  }\n" +
                "  .u-row .u-col {\n" +
                "    vertical-align: top;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-33p33 {\n" +
                "    width: 199.98px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-50 {\n" +
                "    width: 300px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-66p67 {\n" +
                "    width: 400.02px !important;\n" +
                "  }\n" +
                "\n" +
                "  .u-row .u-col-100 {\n" +
                "    width: 600px !important;\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "@media (max-width: 620px) {\n" +
                "  .u-row-container {\n" +
                "    max-width: 100% !important;\n" +
                "    padding-left: 0px !important;\n" +
                "    padding-right: 0px !important;\n" +
                "  }\n" +
                "  .u-row .u-col {\n" +
                "    min-width: 320px !important;\n" +
                "    max-width: 100% !important;\n" +
                "    display: block !important;\n" +
                "  }\n" +
                "  .u-row {\n" +
                "    width: calc(100% - 40px) !important;\n" +
                "  }\n" +
                "  .u-col {\n" +
                "    width: 100% !important;\n" +
                "  }\n" +
                "  .u-col > div {\n" +
                "    margin: 0 auto;\n" +
                "  }\n" +
                "  .no-stack .u-col {\n" +
                "    min-width: 0 !important;\n" +
                "    display: table-cell !important;\n" +
                "  }\n" +
                "\n" +
                ".no-stack .u-col-50 {\n" +
                "    width: 50% !important;\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "body {\n" +
                "  margin: 0;\n" +
                "  padding: 0;\n" +
                "}\n" +
                "\n" +
                "table,\n" +
                "tr,\n" +
                "td {\n" +
                "  vertical-align: top;\n" +
                "  border-collapse: collapse;\n" +
                "}\n" +
                "\n" +
                "p {\n" +
                "  margin: 0;\n" +
                "}\n" +
                "\n" +
                ".ie-container table,\n" +
                ".mso-container table {\n" +
                "  table-layout: fixed;\n" +
                "}\n" +
                "\n" +
                "* {\n" +
                "  line-height: inherit;\n" +
                "}\n" +
                "\n" +
                "a[x-apple-data-detectors='true'] {\n" +
                "  color: inherit !important;\n" +
                "  text-decoration: none !important;\n" +
                "}\n" +
                "\n" +
                "@media (max-width: 480px) {\n" +
                "  .hide-mobile {\n" +
                "    display: none !important;\n" +
                "    max-height: 0px;\n" +
                "    overflow: hidden;\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "    </style>\n" +
                "  \n" +
                "  \n" +
                "\n" +
                "<!--[if !mso]><!--><link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700&display=swap\" rel=\"stylesheet\" type=\"text/css\"><!--<![endif]-->\n" +
                "\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"clean-body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #eeeeee;color: #000000\">\n" +
                "  <!--[if IE]><div class=\"ie-container\"><![endif]-->\n" +
                "  <!--[if mso]><div class=\"mso-container\"><![endif]-->\n" +
                "  <table style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #eeeeee;width:100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "  <tbody>\n" +
                "  <tr style=\"vertical-align: top\">\n" +
                "    <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #eeeeee;\"><![endif]-->\n" +
                "    \n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #3598db;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #3598db;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"200\" style=\"width: 200px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-33p33\" style=\"max-width: 320px;min-width: 200px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table id=\"u_content_image_1\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:31px 10px 25px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "  <tr>\n" +
                "    <td class=\"v-text-align\" style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
                "      \n" +
                "      <img align=\"center\" border=\"0\" src=\"https://vnvc.vn/favicon.ico\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 23%;max-width: 41.4px;\" width=\"41.4\" class=\"v-src-width v-src-max-width\"/>\n" +
                "      \n" +
                "    </td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"400\" style=\"width: 400px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-66p67\" style=\"max-width: 320px;min-width: 400px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table class=\"hide-mobile\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #3598db;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table id=\"u_content_text_1\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:13px 26px 16px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #ffffff; line-height: 140%; text-align: right; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 18px; line-height: 25.2px;\">Hệ thống ti&ecirc;m chủng vaccine Việt Nam</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:40px 10px 10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "  <tr>\n" +
                "    <td class=\"v-text-align\" style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
                "      \n" +
                "      <img align=\"center\" border=\"0\" src=\"https://cdn.templates.unlayer.com/assets/1594973454042-618167-200.png\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 17%;max-width: 98.6px;\" width=\"98.6\" class=\"v-src-width v-src-max-width\"/>\n" +
                "      \n" +
                "    </td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #47484b; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><strong><span style=\"font-size: 30px; line-height: 42px;\">C&aacute;m ơn " + fullName + " đ&atilde; đăng k&yacute;!</span></strong></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:2px 40px 25px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #7a7676; line-height: 170%; text-align: left; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 170%; text-align: center;\"><span style=\"font-size: 16px; line-height: 27.2px;\">V&igrave; một Việt Nam khoẻ mạnh, h&atilde;y ti&ecirc;m ph&ograve;ng vaccine</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table id=\"u_content_text_14\" style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: left; word-wrap: break-word;\">\n" +
                " <p style=\"font-size: 14px; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 19px; line-height: 19.6px;\">Click vào <a style=\"color: rgb(26, 26, 204);\" href=\""+verifyURL+"\" >ĐÂY</a> để có thể đăng nhập vào hệ thống!!!</span></strong></p>\n" +
                "    <br><br>\n" +
                "    <p style=\"font-size: 14px; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 20px; line-height: 19.6px;\">Thông tin đã đăng ký</span></strong></p>"+
                "\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>"+
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row no-stack\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">Họ v&agrave; t&ecirc;n</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">" + fullName + "</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row no-stack\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">Số chứng minh nh&acirc;n d&acirc;n</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">" + CMND + "</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row no-stack\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">Tuổi</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">" + age + "</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row no-stack\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\">Ng&agrave;y giờ ti&ecirc;m chủng <span style=\"color: #e67e23; font-size: 14px; line-height: 19.6px;\">(*)</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">"+time+" : "+date+"</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row no-stack\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\">Địa điểm ti&ecirc;m chủng <span style=\"color: #e67e23; font-size: 14px; line-height: 19.6px;\">(*)</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #615e5e; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">" + address + "</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row no-stack\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #df4949; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 18px; line-height: 22.4px;\"><strong>Kết quả đăng ký</strong></span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"300\" style=\"width: 300px;padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-50\" style=\"max-width: 320px;min-width: 300px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px 30px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #df4949; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 18px; line-height: 22.4px;\"><strong>"+checkStatus(status)+"</strong></span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"line-height: 140%; text-align: left; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 18px; line-height: 25.2px;\"><em>Mọi th&ocirc;ng tin xin li&ecirc;n hệ <span style=\"color: #e03e2d; font-size: 18px; line-height: 25.2px;\">0365503545 </span>để được hỗ trợ!</em></span></strong></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"line-height: 140%; text-align: left; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%; text-align: right;\"><span style=\"color: #e67e23; font-size: 14px; line-height: 19.6px;\"><em><span style=\"font-size: 14px; line-height: 19.6px;\">(*) Tuỳ v&agrave;o kết quả đăng k&yacute;</span></em></span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #ffffff;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<div align=\"center\">\n" +
                "  <div style=\"display: table; max-width:140px;\">\n" +
                "  <!--[if (mso)|(IE)]><table width=\"140\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"border-collapse:collapse;\" align=\"center\"><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse; mso-table-lspace: 0pt;mso-table-rspace: 0pt; width:140px;\"><tr><![endif]-->\n" +
                "  \n" +
                "    \n" +
                "    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 15px;\" valign=\"top\"><![endif]-->\n" +
                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 15px\">\n" +
                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "        <a href=\"https://facebook.com/\" title=\"Facebook\" target=\"_blank\">\n" +
                "          <img src=\"https://cdn.tools.unlayer.com/social/icons/circle/facebook.png\" alt=\"Facebook\" title=\"Facebook\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "        </a>\n" +
                "      </td></tr>\n" +
                "    </tbody></table>\n" +
                "    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "    \n" +
                "    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 15px;\" valign=\"top\"><![endif]-->\n" +
                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 15px\">\n" +
                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "        <a href=\"https://instagram.com/\" title=\"Instagram\" target=\"_blank\">\n" +
                "          <img src=\"https://cdn.tools.unlayer.com/social/icons/circle/instagram.png\" alt=\"Instagram\" title=\"Instagram\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "        </a>\n" +
                "      </td></tr>\n" +
                "    </tbody></table>\n" +
                "    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "    \n" +
                "    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 0px;\" valign=\"top\"><![endif]-->\n" +
                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 0px\">\n" +
                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "        <a href=\"https://twitter.com/\" title=\"Twitter\" target=\"_blank\">\n" +
                "          <img src=\"https://cdn.tools.unlayer.com/social/icons/circle/twitter.png\" alt=\"Twitter\" title=\"Twitter\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "        </a>\n" +
                "      </td></tr>\n" +
                "    </tbody></table>\n" +
                "    <!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "    \n" +
                "    \n" +
                "    <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #0095df;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #0095df;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "    <tbody>\n" +
                "      <tr style=\"vertical-align: top\">\n" +
                "        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
                "          <span>&#160;</span>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #236fa1;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: #236fa1;\"><![endif]-->\n" +
                "      \n" +
                "<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\"width: 600px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\n" +
                "  \n" +
                "<table style=\"font-family:'Open Sans',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:16px;font-family:'Open Sans',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div class=\"v-text-align\" style=\"color: #ecf7ff; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\">&copy; VaccineVIetNam. All Rights Reserved</p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
                "  </div>\n" +
                "</div>\n" +
                "<!--[if (mso)|(IE)]></td><![endif]-->\n" +
                "      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "    <!--[if (mso)|(IE)]></td></tr></table><![endif]-->\n" +
                "    </td>\n" +
                "  </tr>\n" +
                "  </tbody>\n" +
                "  </table>\n" +
                "  <!--[if mso]></div><![endif]-->\n" +
                "  <!--[if IE]></div><![endif]-->\n" +
                "</body>\n" +
                "\n" +"<span style=\"\n" +
                "    display: none;\n" +
                "\">"+status+"</span>"+
                "</html>\n";
        return mail;
    }


    //send email error
}
