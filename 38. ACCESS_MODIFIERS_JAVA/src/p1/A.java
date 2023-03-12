package p1;

import p2.*;

public class A {
	public static void main(String[] args) {
		C c = new C();
//		System.out.println(c.defaultMessage); Can not access to class C
		System.out.println(c.publicMessage);
	}

	protected String protectedMessage = "This is protected";
}
