package services;


import javax.jws.WebService;
import domain.UserProfile;


@WebService(endpointInterface = "services.UserProfileService")
public class UserProfileServiceImpl implements UserProfileService {

	/* (non-Javadoc)
	 * @see UserProfileService#getUserProfilebyId(java.lang.String)
	 */
	@Override
	public UserProfile getUserProfilebyId(String id) {
		
		return  new UserProfile("1", "Samdani", "Gulam");
	}

}
