package assignments.Lab1_Methods;

public class Question1 {

	public static void main(String[] args) {
		
//	Question-1
//	Write a method that accepts a string and a non-negative number,
//	and prints a larger string that is number copies of the original String
//	stringTimes("Hi", 2); = > HiHi
//	stringTimes("Hi", 3); = > HiHiHi
//	stringTimes("Hi", 1); = > Hi		
		
		
	
	stringTimes("Hi",4);


	
	}
	
	public static void stringTimes (String string, int number ) {
		
		String str="";
		
		for (int i=1;i<=number; i++ ) {
			
		str=str+string;// ""+hi=hi+hi=hihi+hi=hihihi
		
		}
		
		System.out.println(str); 
	

// This is how Ozzy did. 
// It collect data like to adding numbers like sum=sum+i		
	
	}
	
	
}
   