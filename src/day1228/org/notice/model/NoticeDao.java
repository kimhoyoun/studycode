package day1228.org.notice.model;

public class NoticeDao {
	public static final int MAX = 100;
	private static final NoticeVo[] noticeArr = new NoticeVo[100];
	private static int top = 0;
	private static int noticeSeq = 1;
	
	static {
		noticeArr[top++] = new NoticeVo(noticeSeq++,"KIM","안녕하세요!","2021-12-28 12:28:30");
		noticeArr[top++] = new NoticeVo(noticeSeq++,"LEE","메리크리스마스","2021-12-28 12:29:30");
		noticeArr[top++] = new NoticeVo(noticeSeq++,"PARK","해피뉴이어","2021-12-28 12:30:30");
	}
	
	// selectAll, selectOne, selectByNo, update, delete, insert
	
	// insert
	public void insert(NoticeVo vo) {
		if(top >= MAX) {
			System.out.println("더이상 생성할 수 없습니다.");
			return;
		}
		vo.setNo(noticeSeq++);
		noticeArr[top++] = vo;
	}
	
	// selectOne 이름으로 검색
	public NoticeVo selectOne(NoticeVo vo) {
		for(int i =0; i<top; i++) {
			if(noticeArr[i].getUser().equals(vo.getUser())) {
				NoticeVo noticeVo = new NoticeVo();
				noticeVo.setNo(noticeArr[i].getNo());
				noticeVo.setUser(noticeArr[i].getUser());
				noticeVo.setMessage(noticeArr[i].getMessage());
				noticeVo.setRegDate(noticeArr[i].getRegDate());
				return noticeVo;
			}
		}
		return null;
	}
	
	
	// selectAll 
	public NoticeVo[] selectAll() {
		NoticeVo[] nArr = new NoticeVo[top];
		for(int i =0; i<top; i++) {
			NoticeVo vo = new NoticeVo();
			vo.setNo(noticeArr[i].getNo());
			vo.setUser(noticeArr[i].getUser());
			vo.setMessage(noticeArr[i].getMessage());
			vo.setRegDate(noticeArr[i].getRegDate());
			nArr[i] = vo;
		}
		return nArr;
	}
	
	// selectByNo
	public NoticeVo selectByNo(int no) {
		for(int i = 0; i<top; i++) {
			if(noticeArr[i].getNo() == no ) {
				NoticeVo vo = new NoticeVo();
				vo.setNo(noticeArr[i].getNo());
				vo.setUser(noticeArr[i].getUser());
				vo.setMessage(noticeArr[i].getMessage());
				vo.setRegDate(noticeArr[i].getRegDate());
				return vo;
			}
		}
		return null;
	}
	
	// search indexof
	public NoticeVo[] selectByWord(String s) {
		int count = 0;
		NoticeVo[] nArr = new NoticeVo[top];
		for(int i =0; i<top; i++) {
			if(noticeArr[i].getMessage().indexOf(s) != -1) {
				NoticeVo newVo = new NoticeVo();
				newVo.setNo(noticeArr[i].getNo());
				newVo.setUser(noticeArr[i].getUser());
				newVo.setMessage(noticeArr[i].getMessage());
				newVo.setRegDate(noticeArr[i].getRegDate());
				nArr[count++] = newVo;
			}
		}
		if(count==0) return null;
		else {
			NoticeVo[] outArr = new NoticeVo[count];
			for(int i = 0; i<count; i++) {
				outArr[i] = nArr[i];
			}
			return nArr;
		}
	}
	
	public void update(NoticeVo vo) {
		if(vo == null) {
			return;
		}
		for(int i =0; i<top; i++) {
			if(noticeArr[i].getNo() == vo.getNo()) {
				noticeArr[i] = vo;
			}
		}
	}
	
	public void delete(NoticeVo vo) {
		if(vo == null) {
			return;
		}
		
		for(int i = 0; i<top; i++) {
			if(noticeArr[i].getNo()==vo.getNo()) {
				for(int j = i; j<top-1; j++) {
					noticeArr[j] = noticeArr[j+1];
				}
				noticeArr[top-1] = null;
				top--;
			}
		}
	}
}
