import java.util.*;
public class ArrayUtils{
	int size;
	int a[];
	public ArrayUtils(int n){
		this.size = n;
		this.a[] = new int[n];
	}
	void EnterArr(){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE ELEMENTS : ");
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
	}
	
	void String tostring(){
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NO.OF ELEMENT : ");
		int n = sc.nextInt();
		ArrayUtils obj1 = new ArrayUtils(n);
		obj1.EnterArr();
		obj1.DisplayArr();
	}
}
