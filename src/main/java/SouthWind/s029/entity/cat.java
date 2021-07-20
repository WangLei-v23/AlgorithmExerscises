package SouthWind.s029.entity;

import java.io.Serializable;

public class cat implements Comparable, Serializable {
    private int id;
    private String name;
    public String neekName;

    public cat() {
    }

    public cat(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public cat(Integer id, String name, String neekName) {
        this.id = id;
        this.name = name;
        this.neekName = neekName;
    }

    public String getNeekName() {
        return neekName;
    }

    public void setNeekName(String neekName) {
        this.neekName = neekName;
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
                ", neekName='" + neekName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
