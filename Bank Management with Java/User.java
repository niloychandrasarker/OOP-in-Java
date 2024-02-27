import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private String address;
    private String accountType;
    private int accountNumber;
    private double balance;
    private List<String> transactionHistory = new ArrayList<>();
    private int loanTaken;

    public User(String name, String email, String address, String accountType, int accountNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public int getLoanTaken() {
        return loanTaken;
    }

    public void setLoanTaken(int loanTaken) {
        this.loanTaken = loanTaken;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", transactionHistory=" + transactionHistory +
                ", loanTaken=" + loanTaken +
                '}';
    }
}
