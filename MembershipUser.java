import java.util.List;
import java.awt.Image;

public class MembershipUser extends RegisteredUser {
    private String membershipType;
    private int remainingMembershipPlan;

    public MembershipUser(String membershipType, int remainingMembershipPlan, String profile, Image profilepic, List<Post> existingQuestions, List<Post> existingAnswers, List<String> existingComments, Boolean profileType, String sessionID, int sessionTime) {
        super(profile, profilepic, existingQuestions, existingAnswers, existingComments, profileType, sessionID, sessionTime);
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

    public void requestExpertResponse(Post post) {
        ExpertRequestUser expertRequestUser = new ExpertRequestUser();
        expertRequestUser.addRequest(post);
    }
}
