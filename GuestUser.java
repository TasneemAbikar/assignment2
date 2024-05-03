import java.util.List;
import java.util.Random;

public class GuestUser {
    protected String sessionID;
    protected int sessionTime;

    private Account createAccount(String firstName, String lastName, String email, String password) {
        Random rand = new Random();
        int accountID = rand.nextInt(10000);
        //for the 10000, its the max amount of accounts that can be created in the platform (infinity seemed to be working a bit wrong, so i just chose 10000)
        
        return new Account(accountID, firstName, lastName, email, password);
    }

    public List<Post> searchForQuestions(String query, boolean filters) {
        Search search = new Search(query, filters);
        return search.returnResults();
    }
}
