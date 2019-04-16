package services;

import javax.jws.WebService;

import domain.UserProfile;

/**
 * 
 */

/**
 * @author sgulam
 *
 */
@WebService
public interface UserProfileService {
	
	public UserProfile getUserProfilebyId(String id);

}
