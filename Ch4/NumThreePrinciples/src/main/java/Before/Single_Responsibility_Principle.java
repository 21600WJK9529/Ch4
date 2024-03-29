package Before;

import java.util.Arrays;
import java.util.List;

public class Single_Responsibility_Principle {

    private List<String> customerDetails = Arrays.asList(new String[]{"John","Violation"});

    public static void main(String[] args) {
        Single_Responsibility_Principle srp=new Single_Responsibility_Principle();
        srp.customer();
        srp.print();
    }
    public void customer(){
        for (String str : customerDetails) {
            System.out.print(str+" ");
        }
    }
    public void print(){
        System.out.println("\n"+getCustomerDetails());
    }
    public List<String> getCustomerDetails() {
        return customerDetails;
    }

}
