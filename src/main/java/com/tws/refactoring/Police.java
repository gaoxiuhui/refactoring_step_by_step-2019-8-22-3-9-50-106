package com.tws.refactoring;

public class Police {
	private static final int AGE_VALID=18;
	
    public boolean checkDriver(Driver driver) {
        if(driver.getAge()>= AGE_VALID) return true;
        else return false;
    }
}
