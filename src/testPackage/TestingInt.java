package testPackage;

public class TestingInt {

	private int num;
	private int pow;

	public void numberpower(){
		num = 4;
		pow = 5;

		int mul = num*num;
		int tmp = mul;
		int tmp1; 
		
		for (int i = 1; i <= pow; i++){
			
			tmp = tmp*num;
			tmp1 = tmp;
			System.out.println(tmp1);
		}

	}

	public static void main(String[] args) {

		TestingInt ti = new TestingInt();
		ti.numberpower();
	}

}
