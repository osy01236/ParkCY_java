package dto;

public class TeaOrder extends BaseOrder {

	public TeaOrder(String cafeName, String menuName) {
		super(cafeName, menuName);
		
	}

	@Override
	public void make() {
		System.out.println("["+cafeName+"] 물을 끓이기 ->티를 우려 내는중~");
		
	}

	@Override
	public void serve() {
		System.out.println("["+cafeName+"] 티 제공 완료");
		
		
	}

}
