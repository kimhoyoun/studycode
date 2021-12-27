package day1227.org.saram.model;

// Data Access Object DAO
// 데이터를 갖고와서 어떻게 처리하는지에 대한 부분
// 루즈 커플링
// 결합도 낮추고 응집력 높여라

public class SaramDao {
	// 임시로 배열에 저장하도록 구현한 후 DB연동 또는 FileIO로 처리
	private static final int MAX = 100;
	private static final SaramVo[] saramArr = new SaramVo[MAX];
	
	// 외부에서 top의 수를 알기위해 접근할 수 있도록 pulbic으로 설정
	public static int top = 0;
	public static int sequenceNo = 1; // 절대로 감소 되지 않는다. 무조건 증가만
	
	static {
		saramArr[top++] = new SaramVo(sequenceNo++, "KIM", "010-1111-1111", "kim@comstudy.org");
		saramArr[top++] = new SaramVo(sequenceNo++, "LEE", "010-2222-2222", "lee@comstudy.org");
		saramArr[top++] = new SaramVo(sequenceNo++, "PARK", "010-3333-3333", "park@comstudy.org");
		
	}
	// 전체 출력
	public SaramVo[] selectAll() {
		// saramArr와 참조 끊기 - 새 배열과 새 객체가 필요하다.
		// 기존 배열의 참조를 옮기면 끊어진 것이 아니므로 기존배열의 값을 새 배열에 옮겨 담는다.
		SaramVo[] newArr = new SaramVo[top];
		for(int i =0; i<newArr.length; i++) {
			// 새로 만든 객체에 값만 옮겨 담기. 참조가 끊어지도록
			SaramVo newSaram = new SaramVo();
			newSaram.setNo(saramArr[i].getNo());
			newSaram.setName(saramArr[i].getName());
			newSaram.setPhone(saramArr[i].getPhone());
			newSaram.setEmail(saramArr[i].getEmail());
			newArr[i] = newSaram;
		}
		return newArr;
	}
	// 상세보기
	// 1. 이름으로 비교
	public SaramVo selectOne(SaramVo vo) {
		// 1. 검색하기
		// 2. 같은 요소가 존재 하면 복재하기 반환(return)
		for(int i =0; i<top; i++) {
			// 찾으면 새로만든 saramVo객체에 값을 저장(복재)하고 반환
			if(vo.getName().equals(saramArr[i].getName())) {
				SaramVo newSaram = new SaramVo();
				newSaram.setNo(saramArr[i].getNo());
				newSaram.setName(saramArr[i].getName());
				newSaram.setPhone(saramArr[i].getPhone());
				newSaram.setEmail(saramArr[i].getEmail());
				return newSaram;
			}
		}
		return null;
	}
	// 2. no로 비교하기
	public SaramVo selectByNo(int no) {
		// 1. 검색하기
		// 2. 같은 요소가 존재 하면 복재하기 반환(return)
		for(int i =0; i<top; i++) {
			// 찾으면 새로만든 saramVo객체에 값을 저장(복재)하고 반환
			if(no == saramArr[i].getNo()) {
				SaramVo newSaram = new SaramVo();
				newSaram.setNo(saramArr[i].getNo());
				newSaram.setName(saramArr[i].getName());
				newSaram.setPhone(saramArr[i].getPhone());
				newSaram.setEmail(saramArr[i].getEmail());
				return newSaram;
			}
		}
		return null;
	}
	// 입력
	public void insert(SaramVo vo) {
		// top이 MAX보다 클경우 용량초과이므로 더이상 입력 불가하도록 함.
		if(top >= MAX) {
			System.out.println("더이상 입력이 불가능합니다!");
			return;
		}
		vo.setNo(sequenceNo++);
		saramArr[top++] = vo;
	}
	// 수정
	public void update(SaramVo vo) {
		// 검색해서 같은 요소가 있다면 수정하기, no로 검색해서 index를 찾기
		// 이미 no가 뭔지 알고있다로 판단.
		// 
		if(vo == null) {
			return;
		}
		for(int i =0; i<top; i++) {
			if(saramArr[i].getNo() == vo.getNo()) {
				// 매개변수로 입력된 vo의 값으로 기존에 있던 saraArr[i]번째 값을 변경
				// no가 같고 그외 값들이 변경된 vo객체가 들어옴.
				saramArr[i] = vo;
			}
		}
		
	}
	// 삭제
	public void delete(SaramVo vo) {
		if(vo == null) {
			return;
		}
		// 1. no로 검색하기
		// 2. 같은 요소가 있다면 한칸씩 땡기기
		// 3. 마지막 요소는 null로 변경하고 top감소
		for(int i =0; i<top; i++) {
			// 같은게 있다면 수행, 없다면 수행 안함
			if(saramArr[i].getNo() == vo.getNo()) {
				for(int j =i; j<top-1; j++) {
					saramArr[j] = saramArr[j+1];
				}
				saramArr[top-1] = null;
				top--;
			}
		}
	}
}
