import java.util.List;
import java.awt.Image;

public class RegisteredUser extends GuestUser {
    protected String profile;
    protected Image profilepic;
    protected List existingQuestions;
    protected List existingAnswers;
    protected List existingComments;
    protected Boolean profileType;

    public RegisteredUser(String profile, Image profilepic, List existingQuestions, List existingAnswers, List existingComments, Boolean profileType, String sessionID, int sessionTime){ 
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
        DiscussionForum forum = new DiscussionForum(newPost);
    }

    public void postAnswer(DiscussionForum forum, String answer, String author) {
        forum.addAnswer(answer, author);
    }

    public void postComment(DiscussionForum forum, String comment, String author) {
        forum.addComment(comment, author);
    }

    public MembershipUser registerForMembership(String membershipType, Double discount) {
        Payment newpayment = new Payment(membershipType, discount);
        newpayment.processPayment();
        String membershipDetails = newpayment.getPaymentDetails();
        
        // Create a new membership user and return
        return new MembershipUser(membershipType, membershipDetails);
    }
}

