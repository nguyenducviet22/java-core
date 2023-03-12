package STATIC_KEYWORD;

public class MainStaticKeyword {

	public static void main(String[] args) {
		Friend friend1 = new Friend("Viet");
		Friend friend2 = new Friend("Son");
		Friend friend3 = new Friend("Harry");
		Friend friend4 = new Friend("John");
		
		Friend.displayFriends();
	}

}
