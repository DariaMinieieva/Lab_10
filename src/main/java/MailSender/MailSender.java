package MailSender;

public class MailSender {

    public String sendMail(MailInfo info) {
        return info.client + " got the letter type " + info.mailCode;
    }
}
