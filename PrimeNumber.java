import java.util.Scanner;

class PrimeNumber
{
	public static void main(String args[]){
		int i,val=0,flag=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value :");
		val = s.nextInt();
		if(val == 0 || val == 1){
			flag = 1;
		
		}
		else{
			for(i =2;i < val;i++){
				if(val%i == 0){
					flag = 1;
					break;
				}
			}
		}
		
		if(flag == 1){
			System.out.println(" Not a Prime Number ");
		}
		else{
			System.out.println(" Prime Number ");
		}
	}
}
