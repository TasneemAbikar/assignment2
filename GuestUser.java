import java.util.List;
import java.util.Random;
import java.awt.Image;

public class GuestUser {
    protected String sessionID;
    protected int sessionTime;

    public GuestUser(String sessionID, int sessionTime) {
        this.sessionID = sessionID;
        this.sessionTime = sessionTime;
    }

    private void createAccount(String firstName, String lastName, String email, String password) {
        Account account = new Account(firstName, lastName, email, password); // need to randomly generate the accountID in the account class.
        // the user is then redirected to login for the first time
    }   
    public List searchForQuestions(String query, Boolean filters) { 
        SearchClass newQuery = new SearchClass(query, filters);
        List results = newQuery.returnResults(); //searchclass needs to have method that is called to re/turn a list result. 
        return results;
    }
}

