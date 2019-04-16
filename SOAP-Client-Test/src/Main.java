import services.UserProfile;
import services.UserProfileService;
import services.UserProfileServiceImplService;

public class Main {

	public static void main(String[] args) {
		
		UserProfileService service = new UserProfileServiceImplService().getUserProfileServiceImplPort();
		
		UserProfile profile = service.getUserProfilebyId("1");
		
		System.out.println(profile.getFirstName() + profile.getLastName());
		

	}

}
