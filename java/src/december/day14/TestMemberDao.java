package december.day14;

import java.util.ArrayList;

//Data Access Object = Dao
public class TestMemberDao {
	public static void main(String[] args) {
//		test_Insert();
//		test_SelectAll();
//		test_findByNo(11);
//		test_delete(11);
//		test_count();
//		tset_find();
//		test_update(2);
		test_SelectAll();
	}
	
	private static void test_update(int no) {
		try {
			MemberDao memDao = new MemberDao();
			MemberVo vo = memDao.findByNo(no);	//findByNo占쏙옙占쏙옙 占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쌀뤄옙占싶쇽옙 vo占쏙옙 占쏙옙占쏙옙占쏙옙
			if(vo == null) {
				return;
			}
			System.out.println("������ : " + vo);
			vo.setTel("010-332");
			vo.setIntro("������");
			memDao.update(vo);
			
		} catch(Exception e) {
			
		}
	
		
	}

	private static void tset_find() {
		try {
			MemberDao memDao = new MemberDao();
			ArrayList<MemberVo> memList = memDao.findBy("name", "%占썸동");		//EJB TECH
	 		System.out.println("*** 占싯삼옙 占쏙옙占� ***");
			for(MemberVo vo : memList) {
	 			System.out.println(vo);
	 		}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void test_count() {
		try {
		MemberDao memDao = new MemberDao();
		int count = memDao.count();
		System.out.println("占쏙옙占쏙옙 占쏙옙溝占� 회占쏙옙占쏙옙占쏙옙 : " + count + " 占쏙옙 占쌉니댐옙.");
		}catch(Exception e){
			System.out.println("error");
			e.printStackTrace();
		}
	}



	private static void test_delete(int no) {
		try {
			MemberDao memDao = new MemberDao();
			memDao.delete(no);
			System.out.println("complete");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("fail");
		}
		
	}

	private static void test_Insert() {
		MemberVo vo = new MemberVo(11, "홍占썸동2", "010-443", "홍占썸동占썸동 占쌉니댐옙." , "占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙");
		try {
			MemberDao memDao = new MemberDao();
			memDao.insert(vo);
			System.out.println("complete");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("fail");
		}
	} 
	
	private static void test_SelectAll() {
		MemberDao memDao = new MemberDao();
		try {
			ArrayList<MemberVo> memList = memDao.selectAll();
			System.out.println("**占쏙옙체 占쏙옙占�**");
			for(MemberVo vo : memList) {
				System.out.println(vo);
			}
		} catch	(Exception e) {
			System.out.println("占쏙옙체 占쏙옙占� 占쏙옙占쏙옙");
		}
	}
	
	private static void test_findByNo(int i) {
		MemberDao memDao = new MemberDao();
		MemberVo vo = null;
		try {
			vo = memDao.findByNo(i);
			if(vo == null) {
				System.out.println("占쏙옙占신놂옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌉니댐옙.");
			} else {
				System.out.println("占싯삼옙占쏙옙 占쏙옙占쏙옙 : " + vo.toString());
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
