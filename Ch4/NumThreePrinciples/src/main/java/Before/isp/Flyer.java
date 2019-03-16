package Before.isp;

public class Flyer implements Interface_Segregation_Principle {
    @Override
    public void swim() {
        //unused
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }

    @Override
    public void run() {
    //unused
    }
}
