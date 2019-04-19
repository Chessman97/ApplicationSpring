package db;

import entity.Mail;

import java.util.List;

public interface DataBase {
    Mail getMail(int id) throws Exception;

    void deleteMail(int id);

    List<Mail> getMails();

    void saveMail(Mail mail);

    void editMail(int id, Mail mail);
}
