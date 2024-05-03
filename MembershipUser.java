import java.util.List;
import java.util.Random;
import java.awt.Image;

public class MembershipUser extends RegisteredUser{
    private String membershipType;
    private int remainingMembershipPlan;

    public MembershipUser(String membershipType, int remainingMembershipPlan, String profile, Image profilepic, List existingQuestions, List existingAnswers, List existingComments, Boolean profileType, String sessionID, int sessionTime) {
        super(profile,profilepic,existingQuestions,existingAnswers,existingComments,profileType,sessionID,sessionTime);
        this.membershipType = membershipType;
        this.remainingMembershipPlan = remainingMembershipPlan;
    }

    public void boostSearchQueries(Post post) {
        post.addBoost();
    }
    public void cancelMembership() {
        membershipType = "None";
        remainingMembershipPlan = 0;
    }
    public void requestExpertResponse(Post post) { //needs to request a response from any expert request user.
        
    }
}
