import java.util.List;
import java.util.Random;
import java.awt.Image;

public class Moderator {

    private int accountID;
    private String password;
    private String permissionsType;

    // Constructor
    public Moderator(int accountID, String password, String permissionsType) {
        this.accountID = accountID;
        this.password = password;
        this.permissionsType = permissionsType;
    }

    // Operations
    public void moderatePosts() {
        // Implement post moderation functionality
        List<Post> flaggedPosts = Database.getFlaggedPosts();
        for (Post post : flaggedPosts) {
            post.moderate();
        }
    }

    public void manageUserAccount(int accountID) {
        // Implement functionality to manage user account

        UserAccount user = Database.getUser(accountID);
        user.manage();

    }

}
