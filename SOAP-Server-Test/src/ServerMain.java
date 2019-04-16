import javax.xml.ws.Endpoint;

import services.UserProfileServiceImpl;

/**
 * 
 */

/**
 * @author sgulam
 *
 */

public class ServerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Endpoint.publish("http://localhost:9999/ws/test",  new UserProfileServiceImpl());

	}

}
