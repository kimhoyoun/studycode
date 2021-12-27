package day1227.org.saram;

import day1227.org.saram.model.SaramDao;
import day1227.org.saram.model.SaramVo;

public class SaramDaoTest {
	public static SaramDao dao = new SaramDao();
	
	
	
	// DAO 테스트 delete
	public static void test_delete(String[] args) {
		// 번호로 검색해서 삭제하므로 번호 값만 갖고있는 SaramVo객체를 생성해서 delete() 메소드에 바로 넣어준다.
		dao.delete(new SaramVo(3,null,null,null));
		// 전체 요소 출력
		test_selectAll(null);
	}
	
	// DAO Test update
	public static void test_update(String[] args) {
		// 번호로 이미 있는 값을 가져옴
		SaramVo vo = dao.selectByNo(3);
		// 값 수정, no는 주키이므로 변경하지 않는다.
		// 이미 받은 객체의 멤버값을 수정할 값으로 새로 저장(수정)
		vo.setName("PARK2");
		vo.setPhone("010-3333-3300");
		vo.setEmail("park2@comstudy.org");
		// 수정된값 저장
		dao.update(vo);
		// 이름으로 검색하고 SaramVo타입 saram 객체에 저장
		SaramVo saram =  dao.selectOne(new SaramVo(0,"PARK2",null,null));
		System.out.println(saram);
	}
	
	// DAO Test selectByNo
	public static void test_selectByNo(String[] args) {
		SaramVo saram = dao.selectByNo(3);
		System.out.println(saram);
	}
	
	// DAO Test selectOne
	public static void test_selectOne(String[] args) {
		// 이름만 검색할것이므로 이름값만 넣어준 SaraVo타입 vo객체를 생성
		SaramVo vo = new SaramVo(0,"LEE",null,null);
		// 이름으로 검색후 그 값을 saram객체에 저장
		SaramVo saram = dao.selectOne(vo);
//		saram 객체 정보 출력
		System.out.println(saram);
	}
	
	// DAO Test selectAll
	public static void test_selectAll(String[] args) {
		// SaraVo배열타입 saramArr 객체 생성후 selectAll()을 수행하여 모든 정보를 갖고있는 배열의 참조값 저장
		SaramVo[] saramArr = dao.selectAll();
		for(SaramVo saram: saramArr) {
			System.out.println(saram);
		}
	}

}
