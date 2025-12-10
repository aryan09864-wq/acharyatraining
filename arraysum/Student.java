package oopsconcept;

public class Student {

			
			int id;
			String name;
			double fees;
			
			public Student(int id, String name, double fees) {
				this.id = id;
				this.name = name;
				this.fees = fees;
			}
			
			public void getfees() {
				System.out.println("The Student fees is : "+fees);
			}
			
			public void getName() {
				System.out.println("The Student name is : "+name);
			}
				
			public static void main(String args[]) {
				
				Student stu = new Student(1532, "Aryan", 400000.00);
				System.out.println("Student id is :"+stu.id);
				stu.getName();
				stu.getfees();
				
				Student stu1 = new Student(1894, "Raj", 840000.00);
				System.out.println("Student id is :"+stu1.id);
				stu1.getName();
				stu1.getfees();
				
				Student stu2 = new Student(1234, "Mohan", 720000.00);
				System.out.println("Student id is :"+stu2.id);
				stu2.getName();
				stu2.getfees();
				
			}

	

}
