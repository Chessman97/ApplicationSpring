package db;

import db.DataBase;
import entity.Tech;

import java.util.LinkedList;
import java.util.List;

public class EmptyDB implements DataBase {

    private List<Tech> techs = new LinkedList<>();

    public EmptyDB() {
        techs.add(new Tech((long) 1, "КМУ", "Kamaz","100000", "33000", "340", "2300"));
        techs.add(new Tech((long) 2, "КАМАЗ", "Kamaz","100000", "33000", "340", "2300"));
        techs.add(new Tech((long) 3, "КАМАЗ", "Kamaz","100000","33000", "340", "2300"));
        techs.add(new Tech((long) 4, "КМУ", "Kamaz","100000","33000", "340", "2300"));
    }

    @Override
    public Tech getTech(int id) throws Exception {
        for (int i = 0; i < techs.size(); i++) {
            if (techs.get(i).getId() == id) {
                return techs.get(i);
            }
        }
        throw new Exception("Нету в базе");
    }

    @Override
    public void deleteTech(int id) {
        for (int i = 0; i < techs.size(); i++) {
            if (techs.get(i).getId() == id) {
                techs.remove(i);
                return;
            }
        }
    }

    @Override
    public List<Tech> getTechs() {
        return techs;
    }

    @Override
    public void saveTech(Tech Tech) {
        techs.add(Tech);
    }

    @Override
    public void editTech(int id, Tech Tech) {
        for (int i = 0; i < techs.size(); i++) {
            if (techs.get(i).getId() == id) {
                techs.get(i).setName(Tech.getName());
                techs.get(i).setMarka(Tech.getMarka());
                techs.get(i).setMassa(Tech.getMassa());
                techs.get(i).setGruz(Tech.getGruz());
                techs.get(i).setDvig(Tech.getDvig());
                techs.get(i).setCost(Tech.getCost());
                System.out.println("edit");
                return;
            }
        }
    }
}
