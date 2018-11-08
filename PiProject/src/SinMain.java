import java.util.Scanner;

public class SinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input x: ");
		double x = sc.nextDouble();
		System.out.println("sin("+x+")= "+sinX(x*Math.PI/180));
		System.out.println("Original sin("+x+")= "+Math.sin(x*Math.PI/180));
	}

	public static double sinX(double x) {
		double sin=x;
		double ch=x;
		int n=2;
		
		for(int i=2;i<15;i++,n+=2) {
			ch *= x*x*(-1)/(n*(n+1));
			sin += ch;
		}
		
		return sin;
	}
}
