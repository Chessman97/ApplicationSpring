package entity;

public class Tech {

    private Long id = 0L;

    private String name = "name";
    private String marka = "marka";
    private String gruz = "gruz";
    private String massa = "massa";
    private String dvig = "dvig";
    private String cost = "cost";




    public Tech(Long id, String name, String marka, String massa, String gruz, String dvig, String cost) {
        this.id = id;
        this.name = name;
        this.marka = marka;
        this.massa = massa;
        this.gruz = gruz;
        this.dvig = dvig;
        this.cost = cost;
    }

    public Tech() {

    }

    public Tech(String name, String marka, String gruz, String dvig, String cost) {
        this.name = name;
        this.marka = marka;
        this.gruz = gruz;
        this.dvig = dvig;
        this.cost = cost;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getGruz() {
        return gruz;
    }

    public void setGruz(String gruz) {
        this.gruz = gruz;
    }

    public String getDvig() {
        return dvig;
    }

    public void setDvig(String dvig) {
        this.dvig = dvig;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Tech{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marka='" + marka + '\'' +
                ", gruz='" + gruz + '\'' +
                ", dvig='" + dvig + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
