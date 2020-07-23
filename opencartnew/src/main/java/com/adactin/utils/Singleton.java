

package com.adactin.utils;
import com.adactin.pom.Login;


public class Singleton {


	private Login lo;

	public Login getLo() {
		
		if(lo==null) {
			
			lo=new Login();
		}
		
		return lo;
	}
}
