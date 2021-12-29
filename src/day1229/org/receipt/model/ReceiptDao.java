package day1229.org.receipt.model;

public class ReceiptDao {
	public static final int MAX = 100;
	private static final ReceiptVo[] rArr = new ReceiptVo[MAX];
	private static int top = 0;
	private static int receiptSeq = 1;
	private static int total = 0;
	private static final String[] menuList = {"에스프레소", "아메리카노", "카페라떼", "아포카토", "아인슈페너"};
	private static final int[] moneyList = {3000, 4000, 5000, 5500, 5500};
	
	
	static {
		rArr[top++] = new ReceiptVo(receiptSeq++, menuList[1], moneyList[1]); 
		rArr[top++] = new ReceiptVo(receiptSeq++, menuList[3], moneyList[3] ); 
		rArr[top++] = new ReceiptVo(receiptSeq++, menuList[4], moneyList[4] ); 
		total();
	}
	
	// 입력
	public void insert(ReceiptVo vo) {
		if(top >=MAX) {
			System.out.println("더이상 주문을 받을 수 없습니다!");
			return;
		}
		vo.setNo(receiptSeq++);
		rArr[top++] = vo;
	}
	
	// 메뉴 추가
	public static void total() {
		total = 0;
		for(int i =0; i<top; i++) {
			total += rArr[i].getMoney();
		}
	}

}
