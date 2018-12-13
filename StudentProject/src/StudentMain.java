import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class StudentMain {

	private final static Logger LOGGER = Logger.getLogger(StudentMain.class.getName());
	private static FileHandler out;
	private static SimpleFormatter formatter = new SimpleFormatter();

	static {
//		formatter = new SimpleFormatter();
		try {
			out = new FileHandler("LOG.txt");
			out.setFormatter(formatter);
			LOGGER.addHandler(out);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			mainStudent();
		}catch (ArithmeticException e) {
			LOGGER.severe(e.getMessage());
		}
//		exceptionMain();
	}

	private static void exceptionMain() {
		try {
			System.out.println(4/0);
		}catch(ArithmeticException e) {
//			System.out.println("Delene na nula\n"+Arrays.toString(e.getStackTrace()));
			LOGGER.severe("Delene na nula");
		}
	}

	private static void mainStudent() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());
		
		Student student = new Student();
		System.out.println(student);
		student.setNumber((short) 15122);
		student.setName("Zara Emilova");
		student.setAvMark((float) 5.65);
		System.out.println(student);
		Student st = new Student((short)15222,"Sofia Ivanova",4.33f);
		System.out.println(st);
		
		Student[] data = new Student[2];
		System.out.println(data);
		System.out.println(Arrays.toString(data));
		for(int i=0; i<data.length;i++) {
			data[i] = new Student();
			System.out.printf("Input number for %d student: ",i+1);
			data[i].setNumber(sc.nextShort());
			sc.nextLine();
			System.out.printf("Input name for %d student: ",i+1);
			data[i].setName(sc.nextLine());
			System.out.printf("Input average mark for %d student: ",i+1);
			data[i].setAvMark(sc.nextFloat());
		}
		System.out.println(Arrays.toString(data));
		
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
