/adding this to new branch1 /

import java.util.Scanner;

public class calculator{

	public static void main(Strig args[]){
	float a, b
	Scanner scan = new Scanner(System.in);

	do{
		System.out.println("Enter The two values:" );
		a = scan.nextfloat();
		b = scan.nextfloat();
		res = a + b;
		choice = scan.next().charAt(0);
		switch(choice){
			case "1":
				System.out.println("Enter The two values:" );
                		a = scan.nextfloat();
                		b = scan.nextfloat();
				res = a + b;
				System.out.println("Result:"+"\t" + res);
				break;
			case "2":
				System.exit(0);
			default:
				System.out.println("Invalid choice");
				break;


		}

		System.out.println("\n---------------------------------\n");
		}while(choice != 2);
	}

}
