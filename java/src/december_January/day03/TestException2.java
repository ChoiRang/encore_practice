package december_January.day03;

public class TestException2 {
	public static void main(String[] args) {
		try {
			String s ="";
			System.out.println(s.length()); // NullPointException
			int[] arr = new int[100];
			arr[100] = 100;	//ArrayOutOfBoundsException
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("오류가 났내 났어~");
		}
	}
}
