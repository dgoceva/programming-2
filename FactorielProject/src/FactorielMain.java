import java.util.Scanner;

public class FactorielMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input N: ");
		int n = sc.nextInt();
		if (n<0) {
			System.out.println("N should be possitive!");
			return;
		}
		System.out.println(n+"!="+nFactoriel(n));
	}

	public static long NFactoriel(int N) {
		long result=1;
		
		for(int i=2;i<=N;i++) {
			result *= i;
		}
		
		return result;
	}
	
	public static double nFactoriel(int N) {
		if (N==0) {
			return 1;
		} else {
			return N*nFactoriel(N-1);
		}
	}
}
