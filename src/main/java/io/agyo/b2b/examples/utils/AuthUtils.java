package io.agyo.b2b.examples.utils;

import com.teamsystem.hub.auth.soap.v1.*;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AuthUtils {
	public static final String authServiceLocation = "https://soap-b2b-auth-service-test.agyo.io/AuthApi_v1/AuthApi.ws?wsdl";
	public static final String authServiceName = "AuthApi_v1";
	public static final String nameSpaceAuthV1 = "http://auth.hub.teamsystem.com/v1";


	public AuthUtils(String type) {
	}

	private static GetNonce getNonceInstance(String id) {
		GetNonce instance = new GetNonce();
		instance.setId(id);
		return instance;
	}

	private static VerifyDigest getVerifyDigestInstance(String id, String digest) {
		VerifyDigest instance = new VerifyDigest();
		instance.setId(id);
		instance.setDigest(digest);
		return instance;
	}

	private static String generateDigest(byte[] content) {
		MessageDigest messageDigest = null;
		try {
			if (messageDigest == null) {
				messageDigest = MessageDigest.getInstance("SHA-256");
			}
			byte[] hash = messageDigest.digest(content);
			return String.format("%064x", new java.math.BigInteger(1, hash));
		} catch (NoSuchAlgorithmException ignored) {
		}
		return null;
	}
	
	private static AuthApiPortTypeV1 getAuthApiService() throws Exception {
		Service service = Service.create(new URL(authServiceLocation), new QName(nameSpaceAuthV1, authServiceName));
		service.setHandlerResolver(new AgyoWSHandlerResolver());
		AuthApiPortTypeV1 auth = service.getPort(AuthApiPortTypeV1.class);
		return auth;
	}
	

	public static String getToken(String username, String password) throws Exception {
		String token = "";
		AuthApiPortTypeV1 auth = getAuthApiService();
		
		GetNonceResponse nonceResponse = auth.getNonce(AuthUtils.getNonceInstance(username));
		String hash = AuthUtils.generateDigest((username + password).getBytes());
		System.out.println("hash="+hash);
		String digest = AuthUtils.generateDigest((hash + nonceResponse.getNonce()).getBytes());
		System.out.println("digest="+digest);
		VerifyDigestResponse verifyRequestResponse = auth.verifyDigest(AuthUtils.getVerifyDigestInstance(username, digest));
		token = verifyRequestResponse.getToken();

		return token;
	}

}
