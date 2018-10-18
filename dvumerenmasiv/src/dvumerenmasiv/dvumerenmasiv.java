package dvumerenmasiv;

import java.util.Random;

public class dvumerenmasiv {

	public static void main(String[] args) {
		int[][] array=new int [12][];
		Random rand=new Random();
		for (int i=0;i<12;i++) {
			array[i]=new int[31];
		}
		for (int i=0;i<12;i++) {
			int n=31;
			switch (i){
			case 1: n=28;break;
			case 3:
			case 5:
			case 8:
			case 10:
				n=30;break;
			}
			for (int g=0;g<n;g++) {
				array[i][g]= rand.nextInt(30);
				System.out.format("%d\t",array [i][g]);
				
			}
			System.out.println();
		}
		

	}

}
