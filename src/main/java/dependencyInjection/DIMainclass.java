package dependencyInjection;

//using constructor injection
//	class Pen{
//		void write() {
//			System.out.println("writing");
//		}
//	}
//	class Student{
//		Pen pen;
//		Student(Pen pen){
//			this.pen=pen;
//		}
//		void study() {
//			pen.write();
//		}
//	}
//public class DIMainclass {
//	public static void main(String[] args) {
//	Pen p=new Pen();
//	Student s=new Student(p);
//	s.study();
//}}
//------------------------------------------------
//using setter injection
//class Pen{
//	void write() {
//		System.out.println("writing");
//	}
//}
//class Student{
//	Pen pen;
//	void setPen(Pen pen){
//		this.pen=pen;
//	}
//	void study() {
//		pen.write();
////		System.out.println("wr1");
//	}
//}
//public class DIMainclass {
//public static void main(String[] args) {
//Pen p=new Pen();
//Student s=new Student();
//s.setPen(p);
//s.study();
//}}

//------------------------------------------------------------
//using manual field injection
class Pen{
void write() {
	System.out.println("writing");
}
}
class Student{
   Pen pen;
    
   void study() {
	pen.write();
	System.out.println("studying");
}
}
public class DIMainclass {
public static void main(String[] args) {
Student s=new Student();
s.pen=new Pen();
s.study();

}}
