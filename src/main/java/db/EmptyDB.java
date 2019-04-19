package db;

import db.DataBase;
import entity.Mail;

import java.util.LinkedList;
import java.util.List;

public class EmptyDB implements DataBase {

    private List<Mail> mails = new LinkedList<>();

    public EmptyDB() {
        mails.add(new Mail((long) 1, "s1", "t1"));
        mails.add(new Mail((long) 2, "s2", "t2"));
        mails.add(new Mail((long) 3, "s3", "t3"));
        mails.add(new Mail((long) 4, "s4", "t4"));
    }

    @Override
    public Mail getMail(int id) throws Exception {
        for (int i = 0; i < mails.size(); i++) {
            if (mails.get(i).getId() == id) {
                return mails.get(i);
            }
        }
        throw new Exception("Нету в базе");
    }

    @Override
    public void deleteMail(int id) {
        for (int i = 0; i < mails.size(); i++) {
            if (mails.get(i).getId() == id) {
                mails.remove(i);
                return;
            }
        }
    }

    @Override
    public List<Mail> getMails() {
        return mails;
    }

    @Override
    public void saveMail(Mail mail) {
        mails.add(mail);
    }

    @Override
    public void editMail(int id, Mail mail) {
        for (int i = 0; i < mails.size(); i++) {
            if (mails.get(i).getId() == id) {
                mails.get(i).setSubject(mail.getSubject());
                mails.get(i).setText(mail.getText());
                System.out.println("edit");
                return;
            }
        }
    }
}
