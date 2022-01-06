package URI1070;

import java.util.Scanner;

public class URI1070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count = 0;
		do{
			if(!(num%2==0)) {
				System.out.println(num);
				count++;
			}
			num++;
			
		}while(count>=0 && count<6);
		input.close();
	}

}
