import java.util.List;
import java.util.Random;

public class GuestUser {
    protected String sessionID;
    protected int sessionTime;

    private Account createAccount(String firstName, String lastName, String email, String password) {
        // Generate a random account ID
        Random rand = new Random();
        int accountID = rand.nextInt(1000000); // Adjust the range as needed
        
        // Create and return an account with the generated ID
        return new Account(accountID, firstName, lastName, email, password);
    }

    public List<Post> searchForQuestions(String query, boolean filters) {
        // Create a new search instance and return results
        Search search = new Search(query, filters);
        return search.returnResults();
    }
}
