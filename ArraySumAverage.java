import java.util.Scanner;
/*@author(
	name = "Nithin N",
	date = "6/02/2024"
)*/
public class ArraySumAverage{
	public static void main(String args[]){
		System.out.println("Printing comman line args using for loop: \n");
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]+" ");
		}
		System.out.println("\nPrinting comman line args using for each loop: \n");
		for(String s : args){
			System.out.println(s);
		}
		int sum = 0;
		double average;
		System.out.println("Printing comman line args using for loop: \n");
		for(String s : args){
			int i = Integer.parseInt(s);
			sum = sum + i;
		}
		System.out.println(args.length);
		average = (double)sum/args.length;
		System.out.println(" Sum is :"+ sum +" Average is :"+average);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements : \n");
		int n = sc.nextInt();
		int a[] = new int[n];
		int sum1 =0;
		System.out.println("The elements : \n");
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
			sum1 = sum1+a[i];
		}
		
		System.out.println("The Sum is : \n"+sum1);
	}
}
