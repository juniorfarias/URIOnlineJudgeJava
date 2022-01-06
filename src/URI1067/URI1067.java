package URI1067;

import java.util.Scanner;

public class URI1067 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		for(int i = 1; i <= num; i++) {
			if(!(i%2==0)) {
				System.out.println(i);
			}
		}
		input.close();
	}

}
