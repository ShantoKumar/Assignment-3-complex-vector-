package complex_vector;

import java.util.Scanner;

class VectorInfo {

	Complex_Number[] vector;
	public static double[] mag;
	public static int size;
	private double magni;
	private double arg;
	private double sum=0.0;
	
	Complex_Number result=new Complex_Number();
	
	public VectorInfo() {
		
		vector=new Complex_Number[100];
	}
	
	public double Add_Element(int size)
	{
		Complex_Number temp=new Complex_Number();
		Scanner input=new Scanner(System.in);
		mag=new double[size];
		for(int i=0; i<size; i++)
		{
			
			temp.real=input.nextDouble();
			temp.img=input.nextDouble();
			vector[i]=temp;
			mag[i]=(temp.real*temp.real+temp.img*temp.img);
			
		}
		for(int i=0; i<size; i++)
		{
			sum+=mag[i];
			
		}
		magni=Math.sqrt(sum);
		System.out.println("The magnitude of the vector is: "+magni);

		return magni;
	}
	public void AddVector (double part1,double part2)
	{
		double res;
		res=(part1+part2);
		System.out.println("the sumation of two vector is: " +res);
	}
	public void SubVector (double part1,double part2)
	{
		double res;
		res=(part1-part2);
		System.out.println("the sub of two vector is: " +res);
	}
	public void MultVector (double part1,double part2)
	{
		double res;
		res=(part1*part2);
		System.out.println("the Multiplication of two vector is: " +res);
	}
	public void DivVector (double part1,double part2)
	{
		double res;
		res=(part1/part2);
		System.out.println("the divition of two vector is: " +res);
	}
}
