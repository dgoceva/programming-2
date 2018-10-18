import java.util.Random;

public class malkibukvi {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		double []array=new double[30];
		System.out.println("Enter data");
		Random rand = new Random();
		for (int a=0;a<array.length;a++) {
			array[a] = rand.nextDouble()*30+5;
			System.out.format("%.2f\t",array[a]);
			sum+=array[a];
			
		}
		System.out.println();
		 double average=sum/30;
		 System.out.format("Average=%.2f%n",average);
			}
}
	