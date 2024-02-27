import java.util.Scanner;

public class UserInterface {
    private Bank bank;
    private User currentUser;

    public UserInterface(Bank bank) {
        this.bank = bank;
        this.currentUser = null;
    }

    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        System.out.print("Enter account type (Savings/Current): ");
        String accountType = scanner.nextLine().toUpperCase();

        User user = bank.createAccount(name, email, address, accountType);
        System.out.println("Account created successfully! Your account number is: " + user.getAccountNumber());
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();
        User user = bank.getUserByAccountNumber(accountNumber);
        if (user != null) {
            System.out.println("Welcome back, " + user.getName() + "!");
            currentUser = user;
        } else {
            System.out.println("Invalid account number. Please try again.");
        }
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        if (currentUser != null) {
            System.out.print("Enter the amount to deposit: ");
            double amount = scanner.nextDouble();
            bank.deposit(currentUser, amount);
            System.out.println("Deposited $" + amount + " successfully.");
        } else {
            System.out.println("Please login first.");
        }
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        if (currentUser != null) {
            System.out.print("Enter the amount to withdraw: ");
            double amount = scanner.nextDouble();
            bank.withdraw(currentUser, amount);
            System.out.println("Withdrew $" + amount + " successfully.");
        } else {
            System.out.println("Please login first.");
        }
    }

    public void checkBalance() {
        if (currentUser != null) {
            System.out.println("Available balance: $" + bank.checkBalance(currentUser));
        } else {
            System.out.println("Please login first.");
        }
    }

    public void viewTransactionHistory() {
        if (currentUser != null) {
            System.out.println("Transaction History:");
            for (String transaction : bank.transactionHistory(currentUser)) {
                System.out.println(transaction);
            }
        } else {
            System.out.println("Please login first.");
        }
    }

    public void takeLoan() {
        Scanner scanner = new Scanner(System.in);
        if (currentUser != null) {
            System.out.print("Enter the loan amount: ");
            double amount = scanner.nextDouble();
            bank.takeLoan(currentUser, amount);
            System.out.println("Loan of $" + amount + " taken successfully.");
        } else {
            System.out.println("Please login first.");
        }
    }

    public void transferAmount() {
        Scanner scanner = new Scanner(System.in);
        if (currentUser != null) {
            System.out.print("Enter the receiver's account number: ");
            int receiverAccountNumber = scanner.nextInt();
            System.out.print("Enter the amount to transfer: ");
            double amount = scanner.nextDouble();
            bank.transferAmount(currentUser, receiverAccountNumber, amount);
        } else {
            System.out.println("Please login first.");
        }
    }
}
