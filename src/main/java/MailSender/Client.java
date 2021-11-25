package MailSender;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class Client {
    private static int counter = 0;
    private int id;
    private String name;
    private int age;
    private String sex;

    public Client(String name, int age, String sex) {
        this.id = this.counter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


//    @Override
//    public String toString() {
//        return "Client{" +
//                "id="+ id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", sex='" + sex + '\'' +
//                '}';
//    }
}
