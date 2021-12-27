package day03;
/** 로또번호 저장객체 */
public class LottoNumbers {
	int[] nums = new int[6];				//멤버변수 = 필드 라고도 불림
	
	/**6개의 로또번호를 난수로 채우기   
	 * 
	 *  
	 *  */
	public void makeNumbers() {											//멤버메서드
		for(int i = 0; i <nums.length; i++) {
			nums[i] = (int)(Math.random()*45 +1);
		}
	}//End of makeNumbers()

	public void printInfo() {											//멤버메서드
		for(int n: nums) {
			System.out.print(n + " ");
		}//End of for
		System.out.println(); //print blank line
	}//End of printInfo()
}
