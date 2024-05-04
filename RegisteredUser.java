import java.util.List;
import java.awt.Image;

public class RegisteredUser extends GuestUser {
    protected String profile;
    protected Image profilepic;
    protected List<Post> existingQuestions;
    protected List<Post> existingAnswers;
    protected List<String> existingComments;
    protected boolean profileType;

    public RegisteredUser(String profile, Image profilepic, List<Post> existingQuestions, List<Post> existingAnswers, List<String> existingComments, boolean profileType, String sessionID, int sessionTime) {
        super(sessionID, sessionTime);
        this.profile = profile;
        this.profilepic = profilepic;
        this.existingQuestions = existingQuestions;
        this.existingAnswers = existingAnswers;
        this.existingComments = existingComments;
        this.profileType = profileType;
    }

    public void postQuestion(String title, String question, String author) {
        Post newPost = new Post(title, question, author);
        existingQuestions.add(newPost);
    }

    public MembershipUser registerForMembership(String membershipType, Double discount) {
        Payment newPayment = new Payment(membershipType, discount);
        newPayment.processPayment();
        String membershipDetails = newPayment.getPaymentDetails();

        return new MembershipUser(membershipType, membershipDetails);
    }
}
