package MailSender;

import lombok.Getter;

public enum LetterTypes {
    HAPPYBIRTHDAY(1),
    SPAM(2),
    UCUROZSYLKA(3),
    OFFER(4);

    private int type_letter;

    LetterTypes(int type_letter) {
        this.type_letter = type_letter;
    }
}
