package com.app.apportment.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
	ROLE_EMPLOYEE, ROLE_ADMIN;

	@Override
	public String getAuthority() {
		return name();
	}
	
	public class Code {
		public static final String SUPER_ADMIN = "ROLE_SUPER_ADMIN";
        public static final String ADMIN = "ROLE_ADMIN";
        public static final String EMPLOYEE = "ROLE_MEMBER";
    }
}
