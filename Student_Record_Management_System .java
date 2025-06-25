public class Student_Record_Management_System 
{
   
      public static void main(String[] args) 
      {
		int choice;
		do 
		{
		  System.out.println("\n--- Student Record Management ---");
		  System.out.println("1. Add Student");
		  System.out.println("2. View All Students");
		  System.out.println("3. Update Student");
		  System.out.println("4. Delete Student");
		  System.out.println("5. Exit");
		 
		  System.out.println("Enter your choice: ");
		  choice=Student.sc.nextInt();
		  
		  switch(choice)
		  {
		  case 1 ->  Student.addStudent();
		  case 2 -> Student.viewStudents();
		  case 3 ->  Student.updateStudent();
		  case 4 ->  Student.deleteStudent();
		  case 5 ->  System.out.println("Existing...");
		  default -> System.out.println("Invalid choice! ");
		  }
		  
		}while(choice!=5);
	  }    
     
}
