import java.util.Scanner;


public class Assignment2 {

	public static void main(String[] args) {
		task1.methodOne();
		task2.methodOne();
		task4.methodOne();
		task5.methodOne();
		task3.methodOne();
		
		task6.methodOne();
		task7.methodOne();
		task8.methodOne();
		task9.methodOne();
		task10.methodOne();
		task11.methodOne();
		task12.methodOne();
		task13.methodOne();
		task14.methodOne();
		
		
	}
}

class task1{
	static void methodOne(){
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the 1st num");
		int num1=scr.nextInt();
		System.out.println("enter the 2nd num");
		int num2=scr.nextInt();
		System.out.println("the first number is " +num1);

		System.out.println("the Second number is " +num2);
	}
}
class task2{
	static void methodOne(){
		float p, r, t, siminterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        scan.close();
        siminterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +siminterest);
        return;
		}
	}

class task3{
	static void methodOne(){
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the co-ordinates of first point");
		System.out.println("enter the X co-ordinates of first point");
		int X1=scr.nextInt();
		System.out.println("enter the Y co-ordinates of first point");
		int Y1=scr.nextInt();
		System.out.println("enter the co-ordinates of 2nd point");
		System.out.println("enter the X co-ordinates of 2nd point");
		int X2=scr.nextInt();
		System.out.println("enter the Y co-ordinates of 2nd point");
		int Y2=scr.nextInt();
		float slope=(Y2-Y1)/(X2-X1);
		System.out.println("the slope number is " +slope);
	}
	}

class task4{
static void methodOne(){
	double radius, circumference, area; 
	Scanner scr = new Scanner(System.in);
	System.out.println("enter the Radius");
	radius= scr.nextFloat();
	area=3.14*radius*radius;
	circumference=2*3.14*radius;
	System.out.println(area);
	System.out.println(circumference);
}
}

class task5{
static void methodOne(){
	double radius, circumference, area; 
	Scanner scr = new Scanner(System.in);
	System.out.println("enter the Radius");
	radius= scr.nextFloat();
	area=Math.PI*radius*radius;
	circumference=2*Math.PI*radius;
	System.out.println(area);
	System.out.println(circumference);
	
}

}

class task6{
	static void methodOne(){
		float p, r, t;
		int siminterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        scan.close();
        siminterest = (int) ((p * r * t) / 100);
        System.out.print("Simple Interest is: " +siminterest);
		
		}	
	}


class task7{
	static void methodOne(){
		int i;
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the integer");
		i= scr.nextInt();
		if(i%2==0)
			System.out.println("its even");
			
		
		else
		System.out.println("its odd");
		
		
	}
}

class task8{
	static void methodOne(){
		int i;
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the integer");
		i= scr.nextInt();
		if(i==0){
			System.out.println("its even");
		}
		else if(i>0)System.out.println("its even");
		else
		System.out.println("its odd");
		
	}
}

class task9{
	
	static void methodOne(){
		 int a, b, c, d;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter all 1st numbers:");
	        a = s.nextInt();
	        System.out.println("Enter all 2nd numbers:");
	        b = s.nextInt();
	        System.out.println("Enter all 3rd numbers:");
	        c = s.nextInt();
	        d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
	        System.out.println("greatest Number:"+d);
	}
}

class task10{
	static void methodOne(){
		int internal1, internal2, internal3, external, average ;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the marks for interanl 1st subject");
		internal1=scr.nextInt();
		System.out.println("enter the  marks for 2nd interanl subject");
		internal2=scr.nextInt();
		System.out.println("enter the  marks for 3rd interanl subject");
		internal3=scr.nextInt();
		System.out.println("enter the marks of external subject");
		external=scr.nextInt();
		if(internal1<internal2 && internal1<internal3) 
		average=(internal2+internal3+external)/3;
		else if(internal2<internal3 && internal2>internal1)
			average=(internal1+internal3+external)/3;
		else average=(internal1+internal2+external)/3;
		System.out.println(average);
		if(average>0 && average<=49)System.out.println("your grade is F");
		else if (average>49&& average<=65)System.out.println("your grade is D");
		else if (average>65&&average<=75)System.out.println("your grade is C");
		else if (average>75 && average<=90)System.out.println("your grade is B");
		else System.out.println("your grade is A");
	}
}

class task11{
	static void methodOne(){
		double a, b;
		char operator;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the first number");
		a = scr.nextInt();
		System.out.println("Enter the second number");
		b = scr.nextInt();
		System.out.println("Enter the operator +,-,*,/");
		operator = scr.next().charAt(0);
		switch (operator) {
		default:
			System.out.println("Error!! Please enter valid operator");
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println( a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
	}
}
}

class task12{
	static void methodOne(){
		int n;
		System.out.println("Enter the number ");
		Scanner scr = new Scanner(System.in);
		n = scr.nextInt();
		if ((n == -10 || n == -3 || n == 7 || n == 12 || n == 22))
			System.out.println("RED");
		 else if ((n == 11 || n == 15 || n == 19 || n == 25 || n == 32))
			System.out.println("YELLOW");
		 else if ((n == 50 || n == 51 || n == 60 || n == 63)) 
			System.out.println("BLUE");
		 else if ((n == 60 || n == 200 || n == 100 || n == 210)) 
			System.out.println("GREEN");
		 else 
			System.out.println("BLACK");
	
}
	}

class task13{
	static void methodOne(){
		int i;
		Scanner scr= new Scanner(System.in);
		System.out.println("enter the no");
		i= scr.nextInt();
		if (i<50 && i>100) System.out.println("Hello");// if there is only 1 statement is required there is no need of braces 
	}
}

class task14{
	static void methodOne(){
		int x, y, z;

		  x = 10;
		  y = 20;
		  z = 30;

		  long startTime = System.nanoTime();
		  boolean a = (x < z) && (x == x);
		  boolean b = (x < z) && (x == z);
		  boolean c = (x == z) && (x < z);
		  boolean d = (x == z) && (x > z);
		  long elapsedTime1 = System.nanoTime() - startTime; 
		  System.out.println("time for short circuit"+elapsedTime1);
		  boolean aa = (x < z) & (x == x);
		  boolean bb = (x < z) & (x == z);
		  boolean cc = (x == z) & (x < z);
		  boolean dd = (x == z) & (x > z);
		  long elapsedTime2 = System.nanoTime() - elapsedTime1; 
		  System.out.println("time for short circuit"+elapsedTime2);
		}
	}
