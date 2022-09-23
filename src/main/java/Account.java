public class Account {

    private String acctNum;
    private String acctType;
    private int balance;

    public Account(String acctNum, String acctType, int balance) {
        this.acctNum = acctNum;
        this.acctType = acctType;
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int depositAmount) {
        this.balance += depositAmount; //accumulator formula
    }

    public void withdrawal(int withdrawalAmount) {
        if(this.balance >= withdrawalAmount) {
            this.balance -= withdrawalAmount;
        } else {
            System.out.println("Unable to withdrawal. Insufficient funds");
        }
    }
}
