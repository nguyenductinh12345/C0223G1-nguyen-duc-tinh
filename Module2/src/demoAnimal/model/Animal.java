package demoAnimal.model;

public class Animal {
    private String id;
    private String name;
    private int eag;

    public Animal() {
    }

    public Animal(String id, String name, int eag) {
        this.id = id;
        this.name = name;
        this.eag = eag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEag() {
        return eag;
    }

    public void setEag(int eag) {
        this.eag = eag;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", eag=" + eag +
                '}';
    }

    public String getToCsv() {
        return id + "," + name + "," + eag;
    }
}
