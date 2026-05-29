package com;

import java.util.regex.Pattern;

public class Validation {
	
	
	    private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
	    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

	    
	    private static final String PHONE_REGEX = "^[0-9]{10}$";
	    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);

	    
	    public static boolean emailCheck(String email) {
	        if (email == null) return false;
	        return EMAIL_PATTERN.matcher(email).matches();
	    }
	    
	    public static boolean phonecheck(String phone)
	    {
	    	 if (phone == null) return false;
	    	 return PHONE_PATTERN.matcher(phone).matches();
	    }
	
}
