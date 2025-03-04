package com.gym;

import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=0,j=0;
		userImplementation ui=new userImplementation();
		 workoutImplemetation wi=new  workoutImplemetation();
System.out.println("welcome to kshatriyta gym");
while(true) {
System.out.println("enter 1 to login");
System.out.println("enter 2 to register");

switch(sc.nextInt()) {
case 1:System.out.println("Welcome to login page!");
	   System.out.println("Enter username");
	   String name=sc.next();
	   System.out.println("Enter password");
	   String pass=sc.next();
	   if(ui.login(name, pass)) {
		   System.out.println("Login was successfull !");
		   while(true) {
	   	System.out.println("enter 1 to enter workouts");
	   	System.out.println("enter 2 to display workouts");
	   	switch(sc.nextInt()) {
	   		case 1:System.out.println("Enter type of workout");
	   			   String out=sc.next();
	   			   System.out.println("Enter the equipment");
	   			   String equip=sc.next();
	   			   System.out.println("Enter the weights");
	   			   int wei=sc.nextInt();
	   			   System.out.println("Enter the number of sets");
	   			   int set=sc.nextInt();
	   			   System.out.println("Enter the reason for workout");
	   			   String rea=sc.next();
	   			   wi.addWorkout(new Workout(out,equip,wei,set,rea),i++);
	   			   System.out.println("your workout ID is : "+(i-1));
	   			   break;
	   		case 2:
	   			System.out.println("Enter your workout ID");
	   			int n=sc.nextInt();
	   			System.out.println(wi.displayWorkout(n));
	}
	   	System.out.println("if u want to logout enter 0");
	   	System.out.println("if u want to continue enter 1");
	   	if(sc.nextInt()==0) {
	   		break;
	   	}
		   }
	   }else {
		   System.out.println("you entered Wrong details!");
	   	}
	   break;
case 2:System.out.println("Enter your firstn name");
	String fname=sc.next();
	System.out.println("Enter last name");
	String lname=sc.next();
	System.out.println("Enter username");
	String us=sc.next();
	System.out.println("Enter the password u want to set");
	String pa=sc.next();
	User u=new User(fname,lname,us,pa);
	System.out.println(ui.register(u,j++));
	}
System.out.println("if u want to continue press 1");
System.out.println("if u want to stop press 0");
if(sc.nextInt()==0) {
	break;
	}
}

	}

}
