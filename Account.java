import java.util.List;
import java.util.Random;
import java.awt.Image;

public class Account {
    private int accountID;
    public String firstName;
    public String lastName;
    private String email;
    private String password;

    // attributes
    public Account(int accountID, String firstName, String lastName, String email, String password) {
        this.accountID = accountID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    // Operations
    public void deleteAccount() {
        // implement delete account functionality
        Database.deleteAccount(accountID);
    }

    public void changePassword(String newPassword) {
        // implement password change functionality
        this.password = newPassword;
        Database.updatePassword(accountID,newPassword);
    }

    public void updateDetails(String newFirstName, String newLastName, String newEmail) {
        // impmentt update account details functionality
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.email = newEmail;

        Database.updateAccountDetails(accountID, newFirstName, newLastName, newEmail);
    }
}



