import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Student 
 {
	int ID;
	String name;
	int Marks;
	
	static Scanner sc=new Scanner(System.in);
    static List<Student> StudentList=new ArrayList<>();
    
   	Student(int ID,String name,int marks)
   	{
   		this.ID=ID;
   		this.name=name;
   		this.Marks=marks;
   	}
   	
   	public  void display()
   	{
   		System.out.println(" ID: "+ ID + ",Name: "+ name +",marks: ");
   	}
   	
   public static void addStudent()
 	{
 		System.out.println("Enter ID: ");
 		int ID=sc.nextInt();
 		sc.nextLine();
 		System.out.println("Enter Name: ");
 		String name=sc.nextLine();
 		System.out.println("Enter marks: ");
 		int marks=sc.nextInt();
 		
 		StudentList.add(new Student(ID,name,marks));
 		System.out.println("Student added successfully!");
 	}
  
   public static void viewStudents()
    {
	  if(StudentList.isEmpty())
	  {
		  System.out.println("No student record found");
		  return;
	  }
	  System.out.println("---Student List---");
	  for(Student s: StudentList)
	  {
		  s.display();
	  }
    }
   
   public static void updateStudent()
    {
	  System.out.println("Enter student ID to update: ");
	  int ID=sc.nextInt();
	  boolean found=false;
	  
	  for(Student s: StudentList)
	  {
		  if(s.ID==ID)
		  {
			  sc.nextLine();
			  System.out.println("Enter New Name: ");
			  s.name=sc.nextLine();
			  System.out.println("Enter New Marks: ");
			  s.Marks=sc.nextInt();
			  System.out.println("Student updated successfully!");
			  found=true;
			  break;
		  }  
	  }
	  if(!found)
		  System.out.println("Student not found.");
    }
   
   public static void deleteStudent()
   {
	  System.out.println("Enter student ID to Delete: ");
	  int ID=sc.nextInt();
	  Iterator<Student> itr=StudentList.iterator();
	  boolean found=false;
	  
	  while(itr.hasNext())
	  {
		  Student s=itr.next();
		  if(s.ID==ID)
		  {
			  itr.remove();
			  System.out.println("Student deleted successfully!");
			  found=true;
			  break;
		  }
	}
	 if(!found)
	 {
		 System.out.println("Student not found.");
	 }
   }
  
 }
