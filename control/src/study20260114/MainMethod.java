package study20260114;

public class MainMethod {

	public static void main(String[] args) {
		
		DBCconnect connect = new DBCconnect();
		
		GameMember[] gameMembers = connect.findAll();
		
		System.out.println(gameMembers[0]);

	}

}
