package me.one;

public class onePIE {
    //encapsulation,inheritance,polymorphism
    private long id=216009529;
    private String name="Winston";
    //encapsulation
    public String onePIE(long id, String name) {
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
}
