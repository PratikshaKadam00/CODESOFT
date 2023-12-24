import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter no of sub");
		int noOfSub=sc.nextInt();
		System.out.println("Enter marks in each subject out of 100");
		double totalMarks=0;
		for(int i=1; i<=noOfSub; i++)
		{
			System.out.println(i+"=");
			double mark=sc.nextInt();
			totalMarks+=mark;
		}
		
		
		
		System.out.println("Total marks in all subjects= "+totalMarks);
		double percent = Math.round((totalMarks/noOfSub) * 100.0) / 100.0;
		

		System.out.println("Average percentage obtained is "+percent+ "%");
		String grade="";
		if(percent<=30)
		{
			grade="C";
			System.out.println("The Grade obtained is "+grade);
		}else if(percent >30 && percent <=40)
		{
			grade="C+";
			System.out.println("The Grade obtained is C+");
		}else if(percent >40 && percent <=50)
		{
			grade="B";
			System.out.println("The Grade obtained is B");
		}else if(percent >50 && percent <=60)
		{
			grade="B+";
			System.out.println("The Grade obtained is B+");
		}else if(percent >60 && percent <=75)
		{
			grade="A";
			System.out.println("The Grade obtained is A");
		}else if(percent >75 && percent <=85)
		{
			grade="A+";
			System.out.println("The Grade obtained is A+");
		}else if(percent >85 && percent <=100)
		{
			grade="A++";
			System.out.println("The Grade obtained is A++");
		}
		
		System.out.println("Your Performance ... ");
		System.out.println("Total Marks= "+totalMarks+ " out of "+noOfSub*100);
		System.out.println("Average percentage= "+percent+ "%");
		System.out.println("Grade= "+grade);

	}

}
