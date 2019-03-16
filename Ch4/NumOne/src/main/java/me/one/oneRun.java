package me.one;

public class oneRun {
    public static void main(String[] args) {
        //1.encapsulation
        onePIE onePIE=new onePIE();
        System.out.println("id: "+onePIE.getId()+" name: "+onePIE.getName()+"\n");

        //2.inheritance
        long a=220009529;
        String b="inherit";
        onepieTwo onepieTwo=new onepieTwo();
        onepieTwo.onepieTwo(a,b);
        onepieTwo.onePIE(a,b);

        System.out.println("id: "+onepieTwo.onePIE(a,b));
        System.out.println("id: "+onepieTwo.onepieTwo(a,b)+"\n");

        //3.Polymorphism
        onepieIntPoly onepieIntPoly=new onepieIntPoly();
        onepieIntPoly.person("WinstonInt", "KrugerInt", 214009529);

    }
}
