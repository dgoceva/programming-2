
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setNumber((short) 15122);
		student.setName("Zara Emilova");
		student.setAvMark((float) 5.65);
		System.out.println(student);
		Student st = new Student((short)15222,"Sofia Ivanova",4.33f);
		System.out.println(st);
	}

}
