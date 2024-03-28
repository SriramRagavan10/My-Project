package for3;

public class ForLogicPrime {
	public static void main(String[]args) {
		for(int i=10; i<=100; i++) {
			boolean isPrime=true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					isPrime=false;
				}
			}
			if(isPrime==true) {
				System.out.println(i+" Prime");
			}
		}
	}

}
