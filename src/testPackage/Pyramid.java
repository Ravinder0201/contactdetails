package testPackage;

public class Pyramid {

	public void rightPyramid(){
		for (int i = 6; i >= 1; i--){
			for (int j = 1; j <= i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Pyramid p = new Pyramid();
		p.rightPyramid();

	}

}
