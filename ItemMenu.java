import java.util.Scanner;

public class ItemMenu {
    public void main(){
        int value = 0;
        do{
            System.out.println("Items Menu");
            System.out.println("1- Add new Item");
            System.out.println("2- Update Item details");
            System.out.println("3- Find Item");
            System.out.println("4- Remove Existing Item");
            System.out.println("5- Back to Main Menu");
            System.out.println("Press 1 to 5 to select an option:");
            Scanner sc = new Scanner(System.in);
            try{
                value = sc.nextInt();
                checkForValue(value);
            }catch(Exception e){
                ClearScreen cs = new ClearScreen();
                cs.clear();
                System.out.println("Invalid Input, Please try again");
            }
        }while(value != 5);
        return;
    }

    public void checkForValue(int val){
        ClearScreen cs = new ClearScreen();
        cs.clear();  
        if(val == 1){
            
        }
        else if(val == 2){

        }
        else if(val == 3){

        }
        else if(val == 4){

        }
        else if(val == 5){
            return;
        }
        else{
            System.out.println("Invalid Value, Please Choose from 1 to 5");
        }
    }
}
