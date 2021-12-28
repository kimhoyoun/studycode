package day1228.org.notice;

import day1228.org.notice.model.NoticeDao;
import day1228.org.notice.model.NoticeVo;

public class TestDao {
	public static NoticeDao dao = new NoticeDao();

	public static void main_delete(String[] args) {
		NoticeVo[] nArr = dao.selectAll();
		for(NoticeVo v : nArr) {
			System.out.println(v);
		}
		
		NoticeVo vo = new NoticeVo(0,"LEE","","");
		vo = dao.selectOne(vo);
		dao.delete(vo);
		System.out.println();
		nArr = dao.selectAll();
		for(NoticeVo v : nArr) {
			System.out.println(v);
		}
	}
	
	public static void main_update(String[] args) {
		NoticeVo vo = new NoticeVo(2,"LEE2","저는 LEE2입니다.", "2021-12-28 12:40:20");
		dao.update(vo);
		
		vo = dao.selectByNo(2);
		System.out.println(vo);
	}
	
	public static void main_selectByNo(String[] args) {
		NoticeVo vo = dao.selectByNo(2);
		System.out.println(vo);
	}
	public static void main_selectOne(String[] args) {
		NoticeVo vo = new NoticeVo(0,"KIM","","");
		vo = dao.selectOne(vo);
		System.out.println(vo);
	}
	
	public static void main_selectAll(String[] args) {
		NoticeVo[] vo = dao.selectAll();
		
		for(NoticeVo v : vo) {
			System.out.println(v);
		}
	}

}
