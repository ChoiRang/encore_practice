package december.day14;

public class MemberVo {
	private int no;
	private String name, tel, intro, addr;

	public MemberVo() {}
	public MemberVo(int no, String name, String tel, String intro, String addr) {
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.intro = intro;
		this.addr = addr;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "no = " + no + ", name + " + name + ", tel = " + tel + ", intro = " + intro + ", addr = " + addr;
	}
	
}
