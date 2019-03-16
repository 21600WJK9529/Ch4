package Before.isp;

public class Runner implements Interface_Segregation_Principle {

    @Override
    public void swim() {
        //unused
    }

    @Override
    public void fly() {
    //unused
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}
