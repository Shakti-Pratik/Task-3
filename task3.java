import java.util.Scanner;
interface user{
    void withdraw(int x);
    void deposite(int y);
    void check_balance();
}
 class ATM implements user{
    int account_balance;
    ATM(bank_account b){
      this.account_balance=b.account_balance;
    }
    public void withdraw(int ammount){
        if(ammount>account_balance){
            System.out.println("Insufficient balance");
        }
        else{
        account_balance=account_balance-ammount;
       System.out.println("The  ammount left is: "+account_balance);
       System.out.println("Withdrawl done successfully");
        }
    }
    public void deposite(int ammount){
        account_balance=account_balance+ammount;
       System.out.println("The new ammount is: "+account_balance);
       System.out.println("Withdrawl done successfully");
    }
    public void check_balance(){
        System.out.println("Your accont balance is : "+account_balance);
    }void start(){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("1.Deposite\n2.Withdraw\n3.Show Account balance");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the ammount for deposite");
                int x=sc.nextInt();
                deposite(x);
                break;
            case 2:
                System.out.println("Enter the ammount for Withdraw");
                int y=sc.nextInt();
                withdraw(y);
                break;
            case 3:
                check_balance();
                break;    
            default:
            System.out.println("You have entered a wrong choice");
                break;
        }
           System.out.println("Thank you for using our ATM");
           System.out.println("Please Visit Again");
    }
}
class bank_account{
    int account_balance;
    bank_account(int account_balance)
    {
        this.account_balance=account_balance;
    }
    
}
class main{
    public static void main(String [] args) {
        bank_account b1 = new bank_account(250000);
        ATM a1 = new ATM(b1);
        a1.start();
    }
}

