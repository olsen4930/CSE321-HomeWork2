import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.NullString;

// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See CalcTest.java, DataDrivenCalcTest.java for JUnit tests

public class Calc
{
	 double a,b;
	
	 Calc(double a, double b) {
		this.a = a;
		this.b =b;
	}
   static public double add (double a, double b)
   {
      return a + b;
   }
   
   static public double subtract(double a, double b){
	   
      return a-b;
   }
   static public double mutiply(double a, double b){
	   
	      return a*b;
	   }
   static public double divide(double a, double b) {
	   
	   return a/b;
   }
   
   
   
//   public static boolean equal(double compare) {
//	   if()
//	   
//	   return false;
//   }
}




/*
double result =0 ;
try{
	   result = a-b ;
}
catch (NullPointerException e) {
	System.out.println("number was not in the function");
}
*/