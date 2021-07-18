package SouthWind.s029.entity;

public class cat {
    private int id;
    private String name;

    public cat() {
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
        return "cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
