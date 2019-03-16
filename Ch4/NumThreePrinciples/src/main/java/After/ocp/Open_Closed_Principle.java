package After.ocp;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Open_Closed_Principle {

        private List<String> options = Arrays.asList(new String[]{"Save","Delete"});
        private int selection;

        static Scanner input=new Scanner(System.in);
        static Open_Closed_Principle open_closed_principle;
        public static void main(String[] args) {
            open_closed_principle=new Open_Closed_Principle();
            open_closed_principle.showOptions();
            open_closed_principle.selectOption();
        }
        public void showOptions(){
            System.out.println("Options available");
            int i=0;
            for (String str : options) {
                System.out.println(++i+"."+str);
            }
        }
        public void selectOption(){
            System.out.println("Please select option");
            selection = input.nextInt();
            while(selection<1 || selection>options.size()){
                System.out.println("Invalid selection");
                selection=input.nextInt();
            }
            switch(selection) {
                case 1 :
                    saveFunction();
                    break;
                case 2 :
                    deleteFunction();
                    break;
                //case 3 :

                //case 4 :

                //case 5 :

                default :
                    System.out.println("Invalid selection");
                    break;
            }

        }

        //functions Start
        public void saveFunction(){
            System.out.println("save");
        }
        public void deleteFunction(){
            System.out.println("delete");
        }

        //functions end, add new functions above


}
