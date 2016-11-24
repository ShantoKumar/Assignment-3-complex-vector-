package complex_vector;

import java.util.Scanner;

public class Main_Vector {


	public static int key;
	public static int i;
	public static int size;
	public static double out1;
	public static double out2;
	public static double res;
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		
	   
		VectorInfo z1= new VectorInfo();
		VectorInfo z2= new VectorInfo();
		VectorInfo z3=new VectorInfo();
		
		System.out.println("Enter the size of Complex_vector1 ");
		size=input.nextInt();
		System.out.println("Enter the Complex elements of Complex_vectors1 ");
		out1=z1.Add_Element(size);
		System.out.println("Enter the complex elements of complex_vector 2 ");
		out2=z2.Add_Element(size);
		
		System.out.println("MANU:"
				+ "1.Addition"
				+ "2.Subtruction"
				+ "3.Multiplication"
				+ "4.Divition"
				+ "5.Exit");
	key=input.nextInt();
	i=1;
	while(i<6)
	{
		switch(key)
		{
		case 1:
			z1.AddVector(out1,out2);
			break;
			
		case 2:
			z1.SubVector(out1,out2);
			break;
			
		case 3:
			z1.MultVector(out1,out2);
			break;
		case 4:
			z1.DivVector(out1, out2);
			break;
		case 5:
			System.out.println("Exit");
			break;
			default:
				break;
			
		}
		key=input.nextInt();
		i++;
	}
	System.out.println("The program is finished");

	}

}
