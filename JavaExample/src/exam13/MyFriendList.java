package exam13;


public class MyFriendList {
	Friend head;
	
	public void add(String name) {
		Friend newnode = new Friend(name);
		if(head == null) {
			head = newnode;
			return;
		}
		}
	}
