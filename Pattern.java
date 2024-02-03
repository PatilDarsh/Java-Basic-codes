import java.util.*;
class Star
{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the Last Value:");

		int num = input.nextInt();

		for(int i=0; i < num; i++){
			for(int j=0; j<i;j++){
					System.out.print("*");
			}
		System.out.println("");
		}
		System.out.println("Next Pattern");
		for(int x=0;x<num;x++){
			for(int y=0; y < num ; y++){
				System.out.print("*");
			}
		System.out.println("");
		}
	}
}

























