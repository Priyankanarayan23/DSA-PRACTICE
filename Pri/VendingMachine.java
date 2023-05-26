import java.util.Scanner;

public class VendingMachine{
    private static final int START_STATE = 0;
    private static final int SELECTION_STATE = 1;
    private static final int FINAL_STATE = 2;
    private static final int TEA_CODE = 1;
    private static final int COFFEE_CODE = 2;
    private static final int COLD_DRINK_CODE = 3;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentState = START_STATE;
        int inputAmount=0;
        
        while (currentState != FINAL_STATE) {
            switch (currentState) {
                case START_STATE:
                    while(true){
                        System.out.println("enter coin now or press 0 to select item");
                        int t=sc.nextInt();
                        inputAmount+=t;
                        if(t==0)break;
                    }
                    
                    if (inputAmount == 10 || inputAmount == 20 || inputAmount == 30 || inputAmount==50 || inputAmount==40) {
                        currentState = SELECTION_STATE;
                    }
                    break;
                    // tea -10 , 20 -coffee, cold drink -30
                case SELECTION_STATE:
                    System.out.println("Select an item: (1 = tea(10/-), 2 = coffee(20/-), 3 = cold drink(30/-))");
                    int selectedItem = sc.nextInt();
                    switch (selectedItem) {
                        case TEA_CODE:

                            
                            int balance =inputAmount-10;
                            if(balance>=0){
                                System.out.println("Dispensing tea...");
                                System.out.println("Return balance : "+balance);
                            }
                            else System.out.println("Insuffecient amount");
                            currentState = FINAL_STATE;
                            break;
                            
                        case COFFEE_CODE:
                             balance = inputAmount - 20;
                            if (balance >= 0) {
                                System.out.println("Dispensing coffee...");
                                System.out.println("Return balance : " + balance);
                            } else
                                System.out.println("Insuffecient amount");
                            currentState = FINAL_STATE;
                            break;
                            
                        case COLD_DRINK_CODE:
                            balance = inputAmount - 30;
                            if (balance >= 0) {
                                System.out.println("Dispensing cold drink...");
                                System.out.println("Return balance : " + balance);
                            } else
                                System.out.println("Insuffecient amount");
                            currentState = FINAL_STATE;
                            break;
                            
                        default:
                            System.out.println("Invalid selection");
                            break;
                    }
                    break;
            }
        }
        
        System.out.println("Thank you for using the vending machine!");
    }
}