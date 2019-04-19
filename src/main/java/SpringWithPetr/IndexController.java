package SpringWithPetr;

import db.DataBase;
import db.EmptyDB;
import entity.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    private DataBase db = new EmptyDB();

    @GetMapping("/delete/{id}")
    public String getMail(@PathVariable int id) {
        db.deleteMail(id);
        return "redirect:/";
    }

    @PostMapping("/edit/{id}")
    public String editMail(@PathVariable int id, @ModelAttribute Mail mail) {
        if (!mail.getSubject().equals("") && !mail.getText().equals("")) {
            db.editMail(id, mail);
            return "redirect:/";
        } else {
            return "error";
        }
    }

    @GetMapping("/edit/{id}")
    public String editMail(@PathVariable int id, Model m) throws Exception {
        Mail mail = db.getMail(id);
        m.addAttribute("mail", mail);
        return "edit";
    }

    @PostMapping("/create")
    public String createMail(@ModelAttribute Mail mail) {
        if (!mail.getSubject().equals("") && !mail.getText().equals("")) {
            db.saveMail(mail);
            return "redirect:/";
        } else {
            return "error";
        }
    }

    @GetMapping("/create")
    public String createMail() {
        return "create";
    }

    @GetMapping("/")
    public String index(Model m) {
        m.addAttribute("mails", db.getMails());
        return "index";
    }
}
