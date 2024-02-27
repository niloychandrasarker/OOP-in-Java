import java.util.List;
import java.util.Scanner;

public class AdminInterface {
    private Bank bank;

    public AdminInterface(Bank bank) {
        this.bank = bank;
    }

    public void createUserAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter user's email: ");
        String email = scanner.nextLine();
        System.out.print("Enter user's address: ");
        String address = scanner.nextLine();
        System.out.print("Enter account type (Savings/Current): ");
        String accountType = scanner.nextLine().toUpperCase();

        bank.createAccount(name, email, address, accountType);
    }

    public void deleteUserAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the account number to delete: ");
        int accountNumber = scanner.nextInt();
        User user = bank.getUserByAccountNumber(accountNumber);
        if (user != null) {
            bank.getUsers().remove(user);
            System.out.println("Account " + accountNumber + " deleted.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void allUserAccounts() {
        System.out.println("All User Accounts:");
        for (User user : bank.getUsers()) {
            System.out.println(user);
        }
    }

    public void totalAvailableBalance() {
        double totalBalance = bank.getUsers().stream().mapToDouble(User::getBalance).sum();
        System.out.println("Total Available Balance: $" + totalBalance);
    }

    public void totalLoanAmount() {
        int totalLoan = bank.getUsers().stream().mapToInt(User::getLoanTaken).sum();
        System.out.println("Total Loan Amount: $" + totalLoan);
    }

    public void toggleLoanFeature() {
        bank.toggleLoanFeature();
    }
}
