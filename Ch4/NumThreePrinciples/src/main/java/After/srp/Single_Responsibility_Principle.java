package After.srp;

import java.util.Arrays;
import java.util.List;

public class Single_Responsibility_Principle {
    private List<String> customerDetails = Arrays.asList(new String[]{"John","Violation"});
    public void customer(){
        for (String str : customerDetails) {
            System.out.print(str+" ");
        }
    }

    public List<String> getCustomerDetails() {
        return customerDetails;
    }
}
