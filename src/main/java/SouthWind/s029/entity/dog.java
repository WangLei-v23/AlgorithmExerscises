package SouthWind.s029.entity;

public class dog {
    private int id;
    private String name;

    public dog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return "dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
