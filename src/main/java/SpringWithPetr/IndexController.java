package SpringWithPetr;

import db.DataBase;
import db.EmptyDB;
import entity.Tech;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Controller
public class IndexController {
    // Static Resource Config

    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        // Css resource.
        registry.addResourceHandler("/img/**") //
                .addResourceLocations("/resources/static/").setCachePeriod(31556926);

    }
    private DataBase db = new EmptyDB();

    @GetMapping("/delete/{id}")
    public String getTech(@PathVariable int id) {
        db.deleteTech(id);
        return "redirect:/";
    }

    @PostMapping("/edit/{id}")
    public String editTech(@PathVariable int id, @ModelAttribute Tech Tech) {
        if (!Tech.getName().equals("") && !Tech.getCost().equals("") && !Tech.getDvig().equals("") && !Tech.getGruz().equals("") && !Tech.getMarka().equals("") && !Tech.getMassa().equals("")) {
            db.editTech(id, Tech);
            return "redirect:/";
        } else {
            return "error";
        }
    }

    @GetMapping("/edit/{id}")
    public String editTech(@PathVariable int id, Model m) throws Exception {
        Tech Tech = db.getTech(id);
        m.addAttribute("tech", Tech);
        return "edit";
    }

    @PostMapping("/create")
    public String createTech(@ModelAttribute Tech Tech) {
        if (!Tech.getName().equals("") && !Tech.getCost().equals("") && !Tech.getDvig().equals("") && !Tech.getGruz().equals("") && !Tech.getMarka().equals("") && !Tech.getMassa().equals("")) {
            db.saveTech(Tech);
            return "redirect:/";
        } else {
            return "error";
        }
    }

    @GetMapping("/create")
    public String createTech() {
        return "create";
    }

    @GetMapping("/")
    public String index(Model m) {
        m.addAttribute("techs", db.getTechs());
        return "index";
    }
}
