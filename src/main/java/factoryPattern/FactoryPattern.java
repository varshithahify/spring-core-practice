package factoryPattern;

public class FactoryPattern {
	public static void main(String[] args) {
		StudentFactory factory = new StudentFactory();
		Student student = factory.createStudent();
		student.study();
    }
}

                
        
                

        