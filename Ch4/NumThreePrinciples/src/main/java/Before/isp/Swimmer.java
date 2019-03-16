package Before.isp;

public class Swimmer implements Interface_Segregation_Principle {

    @Override
    public void swim() {
        System.out.println("swimming");
    }

    @Override
    public void fly() {
//unused
    }

    @Override
    public void run() {
//unused
    }
}
