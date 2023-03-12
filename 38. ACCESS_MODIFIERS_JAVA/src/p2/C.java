package p2;

import p1.*;

public class C {

	String defaultMessage = "This is the default";// can access in the same class and package
	public String publicMessage = "This is public";// can access in all package
	protected String protectedMessage = "This is protected";// can access in the same (sub)class and package
	private String privateMessage = "This is private";// can access in the same class
}
