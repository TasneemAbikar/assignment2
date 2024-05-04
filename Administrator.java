import java.util.List;
import java.util.Random;
import java.awt.Image;

public class Administrator extends Moderator{
    private boolean databasePermissions;
    private boolean websiteUpdatePermissions;

    // Constructor
    public Administrator(boolean databasePermissions, boolean websiteUpdatePermissions) {
        this.databasePermissions = databasePermissions;
        this.websiteUpdatePermissions = websiteUpdatePermissions;
    }

    // Operations
    public void retrieveFlaggedAccount() {
        // implementi functionality to retrieve flagged accounts
        List<Account> flaggedAccounts = Database.getFlaggedAccounts();
    }

    public void deleteAccountFromDatabase(int accountID) {
        // implement functionality to delete account from database
        Database.deleteAccount(accountID);
    }

    public void postWebsiteUpdates(String updateMessage) {
        // mplement functionality to post website updates
        Website.update(updateMessage);
    }
    
}
