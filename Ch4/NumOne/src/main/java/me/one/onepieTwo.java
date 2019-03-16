package me.one;
//inheritance
public class onepieTwo extends onePIE{
    private long id;
    private String name;

    public String onepieTwo(long id, String name) {
        this.id = id;
        this.name = name;
        return "ID:"+id+" Name:"+name;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
