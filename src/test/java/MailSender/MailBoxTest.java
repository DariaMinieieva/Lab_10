package MailSender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    Client cl1 = new Client("Mark", 13, "male");
    Client cl2 = new Client("Mark2", 17, "male");

    MailInfo inf1 = new MailInfo(cl1, LetterTypes.UCUROZSYLKA);
    MailInfo inf2 = new MailInfo(cl2, LetterTypes.SPAM);

    MailBox box = new MailBox();

    @BeforeEach
    void setUp() {
        box.addMailInfo(inf1);
        box.addMailInfo(inf2);
    }


    @Test
    void sendAll() {
        assertEquals("Client(id=0, name=Mark, age=13, sex=male) got the letter type UCUROZSYLKA\nClient(id=1, name=Mark2, age=17, sex=male) got the letter type SPAM\n", box.sendAll());
    }
}