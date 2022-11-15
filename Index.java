import java.util.Scanner;

public class Index {
    public static void main(String[] args){
        int value = 0;
        do{
            System.out.println("Main Menu");
            System.out.println("1- Manage Items");
            System.out.println("2- Manage Customers");
            System.out.println("3- Make New Sale");
            System.out.println("4- Make Payment");
            System.out.println("5- Print Reports");
            System.out.println("6- Exit");
            System.out.println("Press 1 to 6 to select an option:");
            Scanner sc = new Scanner(System.in);
            try{
                value = sc.nextInt();
                checkForValue(value);
            }catch(Exception e){
                ClearScreen cs = new ClearScreen();
                cs.clear();
                System.out.println("Invalid Input, Please try again");
            }
        }while(value != 6);
        System.out.println("Good Bye! Thanks For Coming!");
    }

    public static void checkForValue(int val){
        ClearScreen cs = new ClearScreen(); 
        cs.clear();
        if(val == 1){
            ItemMenu im = new ItemMenu();
            im.main();
        }
        else if(val == 2){
            CustomerMenu cm = new CustomerMenu();
            cm.main();
        }
        else if(val == 3){

        }
        else if(val == 4){

        }
        else if(val == 5){
            ReportMenu rm = new ReportMenu();
            rm.main();
        }
        else if(val == 6){
            return;
        }
        else{
            System.out.println("Invalid Value, Please Choose from 1 to 5 and/or 6 to Exit");
        }
    }
}
