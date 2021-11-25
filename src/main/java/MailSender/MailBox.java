package MailSender;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    List<MailInfo> infos = new ArrayList<MailInfo>();
    MailSender sender = new MailSender();

    public void addMailInfo(MailInfo single_info) {
        infos.add(single_info);
    }

    public String sendAll() {
        String res = "";
        for (int i = 0; i < infos.size(); i++) {
            res += sender.sendMail(infos.get(i)) + "\n";
        }
        return res;
    }
}
