import java.util.Scanner;

public class AccountApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account myAccount = new Account("1234", "Checking", 500);

        System.out.println("Welcome to the Codelaborators Banking System");

        //build out user menu/game loop
        //For loops if you know the start and end, otherwise While loops with a FLAG
        System.out.println("Press 1 to see your Bank Balance");
        System.out.println("Press 2 to make a Deposit");
        System.out.println("Press 3 to make a Withdrawal");
        System.out.println("Press 4 to exit");
        String userChoice = input.nextLine();

        //Run while the user has not chosen to exit
        while (!userChoice.equals("4")) {
            //while the condition is TRUE, do things inside of the code block
            if (userChoice.equals("1")) {
                System.out.println("Your current balance is : " + myAccount.getBalance());
            } else if (userChoice.equals("2")) {
                System.out.println("You want to make a deposit");
                System.out.println("How much do you want to deposit?");
                int amountToDeposit = input.nextInt();
                myAccount.deposit(amountToDeposit);
                input.nextLine(); //give an extra space so that the program doesn't move forward
            } else if (userChoice.equals("3")) {
                System.out.println("You want to make a withdrawal");
                System.out.println("How much do you want to withdrawal?");
                int amountToWithdrawal = input.nextInt();
                myAccount.withdrawal(amountToWithdrawal);
                input.nextLine(); //give an extra space so that the program doesn't move forward
            } else {
                System.out.println("Unable to perform your request, please try again.");
            }

            System.out.println("Press 1 to see your Bank Balance");
            System.out.println("Press 2 to make a Deposit");
            System.out.println("Press 3 to make a Withdrawal");
            System.out.println("Press 4 to exit");
            userChoice = input.nextLine();
        }

        System.out.println("Thanks for banking with us today!");

    }
}
