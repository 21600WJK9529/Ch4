package me.one;
//polymorphism
public class onepieIntPoly implements onepieInterface{
    @Override
    public String person(String name, String surname, long id) {
        System.out.println("ID:"+id+" Name:"+name+" Surname:"+surname);
        return id+""+name+""+surname;
    }

}
