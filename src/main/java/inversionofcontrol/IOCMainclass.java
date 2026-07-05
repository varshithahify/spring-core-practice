package inversionofcontrol;


interface Pen{
	void write();
}
class Bluepen implements Pen{
	public void write() {
		System.out.println("this is bluepen");
	}
}
class Redpen implements Pen{
	public void write() {
		System.out.println("this is Redpen");
	}
}
class Student{
	Pen pen;
	Student(Pen pen){
		this.pen=pen;
	}
	
	void study() {
		pen.write();
	}
}
public class IOCMainclass {
public static void main(String[] args) {
	Pen p=new Bluepen();
	Student s=new Student(p);
	s.study();
}
}
