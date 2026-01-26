package exam12;

public class Friend {

		String name; //내이름 (data)
		String nxet; // 내뒤에 있는 친구 (Address)
		public Friend next;
		
		
		 Friend(String name) {
			
			this.name = name;
			this.nxet = null; //처음엔 뒤에 아무도 없음
		}

		
		
	}


