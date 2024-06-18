import java.util.Scanner;

class account_details {
    private double balance;
    
    public account_details(double initial_balance){
        this.balance = initial_balance;
    }

    public double get_balance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public boolean withdraw(double amount){
        if(balance >= amount){
            balance = balance - amount;
            return true;
        }
        else{
            return false;
        }
    }
}

public class task3{
    private account_details account;

    public task3(account_details account){
        this.account = account;
    }

    public void menu(){
        System.out.println("ATM Menu : ");
        System.out.println("1. Check your current balance : ");
        System.out.println("2. Deposit Money : ");
        System.out.println("3. Withdraw Money : ");
        System.out.println("4. EXIT: ");
    }

    public void check_balance(){
        System.out.println("Your current balance is " + account.get_balance());
    }

    public void deposit(double amount){
        account.deposit (amount);
        System.out.println("$ " + amount + "has been deposited into your account. ");
    }

    public void withdraw(double amount){
        if (account.withdraw(amount)){
            System.out.println("$ " + amount + " has been withdrawn from your account .");
        }
        else{
            System.out.println("Insufficient funds . ");
        }
    }
    public static void main(String[] args){
        account_details account = new account_details(1000);
        task3 atm = new task3(account);
        Scanner scanner = new Scanner(System.in);

        while (true){
            atm.menu();
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();

            switch (choice) { 
                case 1:
                    atm.check_balance();
                    break;
                case 2 :
                    System.out.println("Enter deposit amount : ");
                    double deposit_amount = scanner.nextDouble();
                    atm.deposit(deposit_amount);
                    break;
                case 3 :
                    System.out.println("Enter the withdrawal amount :");
                    double withdrawal_amount = scanner.nextDouble();
                    atm.withdraw(withdrawal_amount);
                    break;
                case 4 :
                    System.out.println("Thank You for using our ATM .");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice . Please enter valid Choice . ");
                    
            }
            
        }
        
    }
}
