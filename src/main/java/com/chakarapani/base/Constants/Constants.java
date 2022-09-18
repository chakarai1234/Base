package com.chakarapani.base.Constants;

@SuppressWarnings("unused")
public class Constants {
	public static final String GATEWAYURL = "http://localhost:9090";
	public static final String USERSPATH = "/api/users";
	public static final String ENTITLEMENTPATH = "/api/entitlement";
	public static final String CONTENTTYPE = "application/json";
	public static final String HEADERCORRELEATIONTITLE = "x-correlation-id";
	public static final String HEADERCOUNTRYTITLE = "country";
	public static final String HEADERCORRELATIONEXAMPLE = "c4690ee8-f3f5-4a68-b08d-a7ecdf8fb851";
	public static final String HEADERCOUNTRYEXAMPLE = "SG";
	public static final String SUCCESSMESSAGE = "Success";
	public static final String RESPONSE200 = "200";
	public static final String HEADERSMISSINGVALUE = "Required Headers are missing " + "(x-correleation-id & Country)";
	public static final String USERNOTEXISTS = "User doesn't exist in Users Microservice";
}
