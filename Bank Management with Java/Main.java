import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        UserInterface userInterface = new UserInterface(bank);
        AdminInterface adminInterface = new AdminInterface(bank);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Create Account\n2. Login\n3. Deposit\n4. Withdraw\n5. Check Balance\n6. View Transaction History\n"
                    + "7. Take Loan\n8. Transfer Amount\n9. Admin Operations\n10. Exit");
            System.out.print("Enter your choice (1-10): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    userInterface.createAccount();
                    break;
                case "2":
                    userInterface.login();
                    break;
                case "3":
                    userInterface.deposit();
                    break;
                case "4":
                    userInterface.withdraw();
                    break;
                case "5":
                    userInterface.checkBalance();
                    break;
                case "6":
                    userInterface.viewTransactionHistory();
                    break;
                case "7":
                    userInterface.takeLoan();
                    break;
                case "8":
                    userInterface.transferAmount();
                    break;
                case "9":
                    System.out.print("Enter admin username: "); // You can implement more secure admin access
                    String adminUsername = scanner.nextLine();
                    System.out.print("Enter admin password: ");
                    String adminPassword = scanner.nextLine(); // mechanisms as needed
                    if (adminUsername.equals("admin") && adminPassword.equals("admin")) {
                        System.out.println("\n1. Create User Account\n2. Delete User Account\n3. All User Accounts\n"
                                + "4. Total Available Balance\n5. Total Loan Amount\n6. Toggle Loan Feature\n7. Back");
                        System.out.print("Enter your admin choice (1-7): ");
                        String adminChoice = scanner.nextLine();
                        switch (adminChoice) {
                            case "1":
                                adminInterface.createUserAccount();
                                break;
                            case "2":
                                adminInterface.deleteUserAccount();
                                break;
                            case "3":
                                adminInterface.allUserAccounts();
                                break;
                            case "4":
                                adminInterface.totalAvailableBalance();
                                break;
                            case "5":
                                adminInterface.totalLoanAmount();
                                break;
                            case "6":
                                adminInterface.toggleLoanFeature();
                                break;
                            case "7":
                                continue;
                            default:
                                System.out.println("Invalid admin choice. Please try again.");
                                break;
                        }
                    } else {
                        System.out.println("Invalid admin credentials. Access denied.");
                    }
                    break;
                case "10":
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
