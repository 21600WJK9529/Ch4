package me.two;

public class twoInherit {
    private long id=216009529;
    private String name="used_for_dependence";

    public String twoInherit(long id, String name) {
        this.id = id;
        this.name = name;
        return "ID:"+id+" Name:"+name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "twoInherit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
