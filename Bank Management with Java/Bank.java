import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {
    private List<User> users = new ArrayList<>();
    private boolean isLoanEnabled = true;

    public int generateAccountNumber() {
        return new Random().nextInt(900000) + 100000;
    }

    public User createAccount(String name, String email, String address, String accountType) {
        int accountNumber = generateAccountNumber();
        User user = new User(name, email, address, accountType, accountNumber);
        users.add(user);
        return user;
    }

    public User getUserByAccountNumber(int accountNumber) {
        for (User user : users) {
            if (user.getAccountNumber() == accountNumber) {
                return user;
            }
        }
        return null;
    }

    public void deposit(User user, double amount) {
        user.setBalance(user.getBalance() + amount);
        user.getTransactionHistory().add("Deposited $" + amount);
    }

    public void withdraw(User user, double amount) {
        if (amount > user.getBalance()) {
            System.out.println("Withdrawal amount exceeded");
        } else {
            user.setBalance(user.getBalance() - amount);
            user.getTransactionHistory().add("Withdrew $" + amount);
        }
    }

    public double checkBalance(User user) {
        return user.getBalance();
    }

    public List<String> transactionHistory(User user) {
        return user.getTransactionHistory();
    }

    public void takeLoan(User user, double amount) {
        if (user.getLoanTaken() < 2) {
            user.setBalance(user.getBalance() + amount);
            user.setLoanTaken(user.getLoanTaken() + 1);
            user.getTransactionHistory().add("Loan taken: $" + amount);
        } else {
            System.out.println("Cannot take more than two loans.");
        }
    }

    public void transferAmount(User sender, int receiverAccountNumber, double amount) {
        User receiver = getUserByAccountNumber(receiverAccountNumber);
        if (receiver != null) {
            if (amount > sender.getBalance()) {
                System.out.println("Insufficient funds for transfer.");
            } else {
                sender.setBalance(sender.getBalance() - amount);
                receiver.setBalance(receiver.getBalance() + amount);
                sender.getTransactionHistory().add("Transferred $" + amount + " to " + receiver.getName());
                receiver.getTransactionHistory().add("Received $" + amount + " from " + sender.getName());
            }
        } else {
            System.out.println("Account does not exist.");
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public boolean isLoanEnabled() {
        return isLoanEnabled;
    }

    public void toggleLoanFeature() {
        isLoanEnabled = !isLoanEnabled;
        String status = isLoanEnabled ? "enabled" : "disabled";
        System.out.println("Loan feature is now " + status + ".");
    }
}
