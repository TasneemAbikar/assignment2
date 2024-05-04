import java.util.List;
import java.util.Random;

public class GuestUser {
    protected String sessionID;
    protected int sessionTime;

    public GuestUser(String sessionID, int sessionTime) {
        this.sessionID = sessionID;
        this.sessionTime = sessionTime;
    }

    public Account createAccount(String firstName, String lastName, String email, String password) {
        Random rand = new Random();
        int accountID = rand.nextInt(10000);

        return new Account(accountID, firstName, lastName, email, password);
    }

    public List<Post> searchForQuestions(String query, boolean filters) {
        Search search = new Search(query, filters);
        return search.returnResults();
    }
}
