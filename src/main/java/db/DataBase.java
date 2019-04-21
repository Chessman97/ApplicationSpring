package db;

import entity.Tech;

import java.util.List;

public interface DataBase {
    Tech getTech(int id) throws Exception;

    void deleteTech(int id);

    List<Tech> getTechs();

    void saveTech(Tech Tech);

    void editTech(int id, Tech Tech);
}
