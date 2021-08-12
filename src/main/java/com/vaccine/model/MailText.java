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




    public MailText(String fullName, String CMND, int age,
                    String address, int status,String verifyURL) {
        this.fullName = fullName;
        this.CMND = CMND;
        this.age = age;

        this.address = address;
        this.status = status;
        this.verifyURL = verifyURL;
    }

    public String checkStatus(int status) {

        if (status == 1 || status == 0) {
            return "Thành công";
        } else

            return "Thất bại";
    }

    public MailText(String fullName, String link) {
        this.fullName = fullName;
        this.link = link;
    }

    public MailText(String fullName, String CMND,int status) {
        this.fullName = fullName;
        this.CMND = CMND;
        this.status = status;
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
                "      <img align=\"center\" border=\"0\" src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAA1VBMVEX///8zMzP5ukgwMDAsLCwtLS0oKCggICAeHh4lJSUpKSlwcHAcHBxdXV1ra2t8fHyampoYGBjY2NjS0tL19fXGxsZUVFT39/eJiYlJSUliYmKPj4+ioqJERETj4+Ps7Oytra09PT3U1NSWlpZ3d3e0tLS9vb0AAAARERE/Pz+pqan5tzxHR0dPT0/+8Nr6zYH/+/T6wV795sIiKTLBk0H6yHT71575vlH6zYL5tTH84bdvWzjapEKDfnYcISebeT1ORDUVIzKFajtAPDTssUayiUBhUTfTFIVTAAAS9ElEQVR4nO1daZujupVuWoAQxgu2Aa+Ay0vj6nJnbjq5N3cyM5lkJvP/f1IwOgIJBN7A4Hrm/dJNGRu9SDqrdPTlS4fw4w//1nYTGsYv37/+se02NIpfv3/9+v0zd+OPmGBM8RN3429fKX7/rN3463dg+Fm78UdK8Gvzs3G03MZYOo0+JI9fvvL4/r3RblwTPUa0avIZefz6/auI3//SYDfOkRKDvDf3hAJ+5Ak2OxtPlGHY2AOK+K1AsLHZuDUVDppfdp93Sm7Qw1qeWhijDc7GLUGI8UOIjMvu8+YaioHDOh4qGaPN6catzvehXt6H8xqH8i9lBONu/K3ubmyDYckYZRz/XMMjOLTA8MfvVQQ/A8OKMZqg5pm4jAgBUaMSHJVKmi+1Maweo1+///vDTxAxCcPwmDRe3e3DMCjc4K/ez1ixm8Lkcn/3A8vlaCNjlKJS4zvfSIK0o88w3HufNf3rf1QzbMR2q7TaHEMpQuvf+6z//K+ff3vmGKU4WjjGN7nlXS/DSaQoP/+7tBubGaPxVKOYSj+sl+H6PFzQ3//xvyUU2/D2a2U4IvT7P//nT08coxfg2CgBcKMX5n0Mx4S9IvTzr8VubGqMXsBEWSeAlm2Si+Pg2q8LQ99RM/vi589/PkeOXg1QKdcrQn/Vm+MoivBHb8VMpenQQhnH/xMlTjtjNMWNVpu/dQ2iUjZIjfXnFkg663SkKpqgOFoaoyluYujNCNFE0UT0GR2w3jLKPhIUR8tR01sYrgzBnAfo9oh+PD7hzOn++z+6MUZvYTjty/TLGcYCzN6VmsVOQHG0PUZvYOh/yDoQunENs9Ff2Fk3JoqjZTkawwPT7lLIcaJnswzpJP4K0TPxqVlvcN+eVxzaP583Rpe9BGHxk7dJgqJ7JSAwUzqEnGahM3HC2Sn1TGK5mikOg1ccpa533egTNYaxvPf7J5UNSDLKGu1v0x5TTx77q6A4yLMi7otkjOn3MtyxNltDsbODYcS6tpf+UVAc2C2PL9SJxxg6FoxFXDR9DmykRlwGiFccmj27s9E34TGGLu0SpMm6Y6yAibPm/8orDrJxnOFJQafd4cJ0fwAPMTxAF2J5nm5iw8dCBwuKA2MzcV0M1Fia6CGG0Em4TGisqCmAPjzhz3tS1KAIu3KH/G54DoULETW4vOk3xrSPtPIoFYxiY5J7+I5THAzmul6K/jfjDDbv1eTKUm56CDjwdvl7mWBFPkR4xZFSvDvaJYVvF55wlgne5W9moHYdmlfcQicBOhU+8JZq4fH15LkYamDo026oVN0r6GaJBbMuDFR0vOkFX2re4wwhZGVV2V8+lSn4UPgEBrAAq861EzUwpP2DlMqbaG5A0s+j4kRU9DpNAF+MqNGQmnYTw2XSP6g63k+jPfq28AGdoYrJJ93Vq+NdV8C3ZH34cYssHZpXtIoSMYudQ8WUOeM9DrSp0+MIzphO+9ACj17f8gvAsFd5UxnDgFoL8QTlFQey6vc4HrBp6Cit0PdnlI3SMRVTZyHrLW3e43iT/cwDeIAhSJpN5U1lkuZARamWWNzjeUZRwzV7HA8wdGgjrSq3wKd6vagtqChF4B5PefVPlFoX3D3AEJISlbGqEKeDUYQopsaC3EPWrkZn6hHfgo7Ayok4SDoHzQtaqC9IoDCn/nXl/qx64UlJRC26a+xTUaPY5dGIMVjehZ/3FCFWCb/EqWejX5fiOOzPCCeX7ywCPNyK3OKCzq+89xQrC1v4gPYock+Z4lCfuzi0BJCJKc1PQQxAYlGDTWtCR2lM4jarOG7HO/jwunycwhiVxQBC0DTUxIAePQdDxnMuVFW34rgDc4g1Idmk8VkkSmKbg00LfiMoR5L8ysrMVEfNiuMOHCAng8ziRHYQDDi76DqBCGcWH9gOGr3yF5mpiuw6Fcc9WIBrgMhInGveiI02aXCCSk0C6bde0muZ2tmjLFRVp+K4B1OFvW6ihBlHL9wwqahtZJ1AA+LM1KE/wumU6Y6POC6elOPwpsG06D76WQ6G2Iv3wzgYH94XUfZXUxospkLWop9N6TQUwqq8x/EcxeEMT7qhrneFOXXg/DuNYMu2MJfwRpFkEqaiJaJv7A3zfAENexx5TD5wkkVDJl7npRufQMxDM+WyEAJUOr3ag/GaGyHjU2bLNa04+NeJ7LwNG0hinxRkXiIId1S0gAyaJeIKfRRuWxFOcWwaVBxbMeJh5Sl6MyJscQCYZFYW9gG/GH4IrPBh8b4nKY59PixXnFt+L8pzNO1euUUu2N3T0njcl+coDs/Mh26RWoznvA2xpSNm4uiWsauQDSGkM+i4g5iqIR+F017EK44munFJ2M8bGKYjKQYHY0yW7vy42WyOc3dZ7qt4h14EEsSmzQUr3ChrvHNsWHGA7Wme9m8HF/w4eVx1OlkuTsfTYOuUxeymzlAzmPRAiP4KBDSOpYE+b2lxiuNUd3IcHAQwqfoQdyk+xd+6mmHG4xRpuqH1R5J2OLuNwQ15ZqXtkimsLSoa8ZYpDiR59mMA5Yyp5QTZmEKWaDIQF7bFun8gtsQZIizOaCY8T3mbTYYVhq4vTcfeDbD7WaSFZlRzEzHYRcVcmRoNmD3pTWbEygksZEbU7p5C8uaCnPQXiSl/ITx7D+gsSSMVNLQkvvC9Il/3ZWoHSu9o5XWJaqi7A31pkEm+PPiSx1QEhZpjOLPz6iTtJzx7m62xnus9FUe9QypXqM2GlMt6IIilcAPG2yWG3oKLBCKkqiriCJkSetrgwIticPerMskpnFOdOVTABYZTNx2hSDeQOxgMXJSfc9ngjOntc51F7ZsLCZ4mUc0wWKczjGizN9r44G2mSoxxDVsFevEYh8j5M7ddi6hk6G+YDFWtEf8tb2WJ0lUjtluk54+YvSLL9D8JVQwnqQ7Eg3zrgwW3EBGb/eIuuSA8pbEAcWXYc1HB8JDuNLBkIm4I1hAxFu+FHgoOA5xFRqvW5DSOcoZh2kJ7JP3qDCuIRO6qOACdnYL5UYwlvuHTUMpwxPxiZIQl393Z81VRzb3N8vYbrnOFws0oYzhjfjEqWZl4hsRAH63tnIpUrTZ7sIShOpyxHQiadn3eKnjvGyRnAej24K7EV32QMoxNE0YQXWsoeoeFhsWwHDItdduemgDIGTKY6yvDCs7OytNTsTJsufsSVDIk1y17fVtucgZArCK13qEBI/MOVDHEgyva6I9ORt78JvZCsk++JVQwNHaXv37gdpcw2WIcJTqkPZQzNK7x1Qaic3xOCyyfs8/iapQyNK4KmPT4Ua0ayqwLskVECUNkh1d9PWOoYZvz7DuEEn147XJeYIgIccMu0vtSwlBD1w42yhAdJeZ3VyBjqG44YVEdBaQMZXmlzkDC0ORT84vqAMtLMiRupuen8wuOwSsy5A0Zf21eaHwNDKFOSWMmXp5hxDV2vFEvNf5xhv43nGxIbsxOyDHsc4bM5JyCbp7htVH/e5FjyCW490k0/9MxzLCiobTXZwjZtUJSawlhjNdnSDOkbCVoiiGL0zyLYXkNy0fxBkvQBDPNG6QJp8YZBk0zhO07Qpp96mYR++YY7vuLM/qwX7w/SC4bWIsBq9G5/Hlw5FK6zTEcGVoCeBBKLppIkcK6OsViuXtH5YNmzTFcyZbL1bpFkWEDcRZ8eo+Np0PPkK6oKMFLMDywCheIGCrBubDgZ2CYlfcQqW0+D8Mv/eKzED7Mrmn8I5LGPtdV15lUU5MraabycUwX+Y3XGnFg+1lzDJ1lArq+VtGG2+RSuqq6BgwjXn4iY+5/aZwhgGn8pgM9476h091JyMSbZOHEkxg2bpemeFu6CrYtfb3bU3f70zH8ct7/Pfaz/d6fkaGI/2eYoAaGUVLv4bUZTink0bRA35xxdTa9RtTHsLc5xlBKlDnwv7eZDwAYVhsZVzFcJOWwSOfCxvUxHJSVB2kZOYbBhAfLbFxkGH9t3IclpuOLZRqfixzD0Tcrwze20u0iw338NVaOK/5e2/t+BeQYDvnV6ulfLzMUjPqSrUEtIcewL+y3YIGrl2YIjWcM53xwI63pQncaVqzi7jLDvlA0JFCE8A3bEAqbmsqXAHeY4XQtFO/wxTgAW7cNm4qs0p/pMMNArOoxgQoSIG/YolP4c1SqBfaRzpbTIlOPusQQdpzDli9W6eIY0NamXUs9A6t07YYX26NQYWHoCbbZ+3Ee46NqT1uzOIi7eaAuVh8kTlrTR6wtIIfcplnhsy2nFmsuPgsrodITE5o7VgKCvXqlYpMvwyIp15xfzs4e0EDbr8NMF5ikknUrlgAr36idYTk4V9we5N5C6wwHgi6fbphkBeGI4bbZNVXdpGid4Ycw/AKDSVbYuMwk0Ps1Vd2kaJuhRwQRApJV99O4CkhPUIjodqehLL/+LDAisO2ek6y2SP32FO4owYpKWHRcJZfbp/tVuVpW8MLPtS2OQnWdqX2zsWLTQ8PAkkf0quKEuIbANrfCJc0uJItSQATBInBvIxh310C6q/j5sbZR1mlncEphpqdks09uyYp1hCFV7Gl9Vk6xr0TuV5U5FdARhmupcXaebTlzbnuzQuwIQ7C7YYUwSFbjLFnHYjqMVn2sKHtRANaKp4ZpxrMZBqKIZJWvz/0WEOGjCWjK66X9yU3ACn7Tq/mzGXJVcs/Yc44uq6gDu7N9WZ2ra9CyTcOqdcEllA2gwQpRegZUXVyqe1FEywxz5coHvGTdidLzJFgANz+iLYbDTMOfseZLPueKRJeW9L6AlhmKVXKhDiKUrdmLCzaHlyvsSNEyQ9F38k1efE44wZq19HjrI9plmJVUT/AmlHyG4l3suC6oim3cup2AJkKilqotMBKgAlipJUoiJz3fys+4qEQwpqiv1bdgIlYgy0W256L7rwoWwIsglAmT1AxfiNEn5Wb/qQNYih5STiHkVMm87IyLLiONjibwxGHJok8ILgeio/UakOad0sC2I5p01H+6J9zWHphxHdLLvHEtN8vtNlp6L8BBYvkW8J1SBymwBOnpiBbASyDn5MK8y44VgwrkIb3yxSL6L4GyvBPDHfmnjoEVU4TLQrL+jvxTx5ALGLr5Y0ByNs41+aeOQTRa4DgOruQn+E9QgpUPF78KxNrGgZiL+ZKarbmQf4s12W6GmHyBDXzcKReBLP90TXnLriCXd2JjMiMgT701t4WwdrAkaLkTPxeiT1n69FUAZhiBy2FRkIj5p+nt+aeWAaY06zS3qAzKljG8CnLukOS0zlx9ZdHZegF8iC6txCi7ZNZ1HWJYgi3s4gvpwwGShrgkrHg4WVehCbE0R7I4LxDOBmD65LbDeNvERqiiDoemCQssvQ/BuwDR9DoM4ZRUPfEHITqaS/LCoXnUCoAoxwtFaqjHG5OKjZSJS8OhuUL0sIlXO47PB8bALa+jLXzY3a0RDbGKlrly8GzJMCLnOtj0/21szroXu6xMOfxr5kfgjm1OSPPxantrYW+Hr+WKriM9n5WY4twtyvNXNT2C/Ok6BNS9F6QHezm5Le5Ru+en3YxQOBABnVY7V7EZImvj7lYL4Y76T95oGs6R30aAdFUYuEhThaqsuMnzqBpDWHasRRGovXMB7oczm19NUFHWHaxbWonJEJeeYSHvRNPCnSj8fBX81cmWnbN2CaZ1GnW3xmeGcc8kxd5DSDUJxoZhWZZhYEx04TAWdhfRqw4r6wQc18h3n2ZibCpub7baHxxnMp44zmG/mvVOyvmD/NmIpnHqslSduLbYYk23NHe4n8gHnz/ZD13NIrnv2G5XOU4WhtBWFdvu9uLW5GAycm2x9JJmLboodIKe0EwN24viuTFl390PIqGqvop7XYt/T5e8+LyjsrMXuoS3ctRo2anS0HuFM6MRVu4qq+4vFd7fIEpYcyvvh+NyLUPW8f3etz8Njxb3S7gjYtUfcAIG4c1juerDkXtbmjFo3wQIlrbK8TuGD//inueoRrOWp2PIT0DdXNURDvRWiPtRorTpdzgn/nXbw7okfDCL+IFROCb6WfD73AGnGu7XOWX8BacfkdVvI4QTzIQJeKp7MYxz4o8sr298XA1xrphhA48Q5zh6bhznsBYmYEPybrrkpyN5UA/dgrHLBdI03KDO8nvCdHSfMx2DISdgkNGwqzNxOStHsxo7Pp3DSOO2/xG1+TCuYPPq2qjhDNxhw4UoTLJ8RsLP2+LMb4kFXJMvVRwyxu5ZRmOw43xPZJ2a8o/9nSVo4Wf64ZM+L9yMXiPvdmlmExAR9dnLXQ+IU1CmXv/82PMxQl1tY2/ESOVlnB7W+uPOiZuAqvF8EypBMOSnY51hR7/HT0C7317QdrxowtbwZoQT1lhpd735YcNPR1yHvehYvIn9ZPtXhhVvAZBrz3erQKCm70w1Zl2IYgazbDoirYYWwYk48QRcdGUpQTYd68mNJ2uaWowlyOBQ962mdWKO1XY8SIZwE09HoyaxtyDGsgsTUMR0iUldNaLGzZiBD8MfXCUY/gWlRldM2q5OGgAAAABJRU5ErkJggg==\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width:45%;max-width: 160px;\" width=\"120\" class=\"v-src-width v-src-max-width\"/>\n" +
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
                "      <p style=\"font-size: 14px; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 22px; line-height: 19.6px;\">Click vào <a style=\"color: rgb(26, 26, 204);\" href=\"index.html\" >ĐÂY</a> để vào form đăng ký</span></strong></p>\n" +
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
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">$200</span></p>\n" +
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
                "      <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">$200</span></p>\n" +
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
                "      <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">$200</span></p>\n" +
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
                "            <img align=\"center\" border=\"0\" src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTyX32zWaKPTixs_pnyyZZebgpZWoPYQBWaew&usqp=CAU\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width:45%;max-width: 280px;\" width=\"120\" class=\"v-src-width v-src-max-width\"/>\n" +
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
                "    <p style=\"font-size: 14px; line-height: 140%;\"><strong><span style=\"font-size: 30px; line-height: 42px;\">Xác nhận tiêm chủng lần 1 </span></strong></p>\n" +
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
                "    <p style=\"font-size: 14px; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 20px; line-height: 19.6px;\">Thông tin khách hàng</span></strong></p>\n" +
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
                "      <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 20px; line-height: 23px;font-weight: bold;color: crimson;\">"+checkStatus(status)+"</span></p>\n" +
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
                " <p style=\"font-size: 14px; line-height: 140%; text-align: center;\"><strong><span style=\"font-size: 22px; line-height: 19.6px;\">Click vào <a style=\"color: rgb(26, 26, 204);\" href=\""+verifyURL+"\" >ĐÂY</a> để xác minh tài khoản của bạn!!!</span></strong></p>\n" +
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
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px;\">"+"Chờ xác minh tài khoản"+"</span></p>\n" +
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
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 18px; line-height: 22.4px;\"><strong>Đang chờ xác minh</strong></span></p>\n" +
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
