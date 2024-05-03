import java.util.List;
import java.util.Random;
import java.awt.Image;

public class ExpertRequestUser extends RegisteredUser {
    public List membershipRequests;

    public ExpertRequestUser(List membershipRequests, String profile, Image profilepic, List existingQuestions, List existingAnswers, List existingComments, Boolean profileType, String sessionID, int sessionTime) {
        super(profile,profilepic,existingQuestions,existingAnswers,existingComments,profileType,sessionID,sessionTime);
        this.membershipRequests = membershipRequests;
    }
    public void addRequest(Post post) {
        membershipRequests.add(post);
    }
    public String answerRequest(int requestIndex, String expertResponse){
        String response = "Answer for post: ";
        return expertResponse;
    }
}
