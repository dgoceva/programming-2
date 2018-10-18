import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		File inFile = new File("data.txt");
		Scanner sc = new Scanner(inFile);
		int [] a = new int [10];
		int sum =0;
		int k=0;
		while (sc.hasNextLine() && k<10){
		a [k++]  = Integer.parseInt(sc.nextLine());
	}
	sc.close();
    for (int i= 0; i < k ; i++) {
    	sum += a[i] ;
    }
    for (int i =0; i < k ; i++) {
    	System.out.printf("Partiq %.2f\n", (double)a[i]/sum*100);
    }
	}

}
