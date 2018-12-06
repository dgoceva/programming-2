import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());
		
		Student student = new Student();
		System.out.println(student);
		student.setNumber((short) 15122);
		student.setName("Zara Emilova");
		student.setAvMark((float) 5.65);
		System.out.println(student);
		Student st = new Student((short)15222,"Sofia Ivanova",4.33f);
		System.out.println(st);
//		
//		Student[] data = new Student[2];
//		System.out.println(data);
//		System.out.println(Arrays.toString(data));
//		for(int i=0; i<data.length;i++) {
//			data[i] = new Student();
//			System.out.printf("Input number for %d student: ",i+1);
//			data[i].setNumber(sc.nextShort());
//			sc.nextLine();
//			System.out.printf("Input name for %d student: ",i+1);
//			data[i].setName(sc.nextLine());
//			System.out.printf("Input average mark for %d student: ",i+1);
//			data[i].setAvMark(sc.nextFloat());
//		}
//		System.out.println(Arrays.toString(data));
		
		List<Student> list = new ArrayList<>();
		System.out.println(list);
		Student s = new Student();
		s.setNumber((short)12122);
		s.setName("Ivan Ivanov");
		s.setAvMark(5.65f);
		list.add(s);
		list.add(0, st);
		list.add(0,s);
		System.out.println(list);
		System.out.println(list.contains(student));
		System.out.println(list.indexOf(s));
		System.out.println(list.lastIndexOf(s));
		list.remove(list.lastIndexOf(s));
		System.out.println(list);
		list.remove(s);
//		list.remove(list.indexOf(s));
		list.remove(student);
		System.out.println(list);
	}

}
