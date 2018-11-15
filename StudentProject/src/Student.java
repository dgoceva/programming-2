
public class Student {
	private short number;
	private String name;
	private float avMark;
	
	public short getNumber() {
		return number;
	}
	public void setNumber(short number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAvMark() {
		return avMark;
	}
	public void setAvMark(float avMark) {
		this.avMark = avMark;
	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", avMark=" + avMark + "]";
	}
	public Student(short number, String name, float avMark) {
		super();
		this.number = number;
		this.name = name;
		this.avMark = avMark;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
