package com.info.main;
class Student
{
	static int roll;
static	String name;
	
	Student(int roll, String name)
	{
		this.roll=roll;
		this.name=name;
		System.out.println("Check 1: The value of this is:"+this); // print id of this 
	}
	
	
	Student(int rollno)   ////////   // Constructor overloading occurs as method overloading 
	{
		System.out.println("               check 2: The value of this is:"+this);
		//this.Student(rollno);  error due to argument mismatch. thats why one constructor can not be called inside another constructor 
		roll=rollno;
	}
	
	public static void show()
	{
		System.out.println(" Roll: "+roll+"   Name: "+name);
	}
	
}
public class Cons
{

		public static void main(String[] args)
		{
			Student.show();
		   Student st=new Student(53,"koushi");
		   System.out.println("The value of st reference variable:"+st);
		//	Student st=new Student();
			 // st.roll=4324;
		//	  Student.roll=342;  error due to non-static
			 // Student.name="koushindra";
			//  st.show();
			
		  Student st2=new Student(3453);
		  System.out.println("                The value of st2 reference variable:"+st2);
		   st.show();
		  st2.show();
		   
		//   new Student(43,"gujjar").show();;;;;;;;;;;;;;;;;;;;;;//Annonyms object: can be used only once
		   
		}
}
