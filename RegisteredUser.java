import java.util.List;
import java.util.Random;
import java.awt.Image;

public class RegisteredUser extends GuestUser{
    protected String profile;
    protected Image profilepic;
    protected List existingQuestions;
    protected List existingAnswers;
    protected List existingComments;
    protected Boolean profileType;

    public RegisteredUser(String profile, Image profilepic, List existingQuestions, List existingAnswers, List existingComments, Boolean profileType, String sessionID, int sessionTime){ 
        super(sessionID,sessionTime);
        this.profile = profile;
        this.profilepic = profilepic;
        this.existingQuestions = existingQuestions;
        this.existingAnswers = existingAnswers;
        this.existingComments = existingComments;
        this.profileType = profileType;
    }
    
    public void postQuestion(String title, String question, String author) { 
        Post newPost = new Post(title, question, author); //the post class/needs to have the title,question and author fields.
        DiscussionForum forum = new DiscussionForum(newPost);//a forum is also created for a new question
    }
    public void postAnswer(DiscussionForum forum, String answer, String author) {
        forum.addAnswer(answer,author); //it will have an add answer method
    }
    public void postComment(DiscussionForum forum, String comment, String author) {
        forum.addComment(comment,author); //it will have an add comment method
    }
    public void registerForMembership(String membershipType, String discount) {
        Payment newpayment = new Payment(membershipType, discount);
        newpayment.getPaymentDetails();
    }
}
