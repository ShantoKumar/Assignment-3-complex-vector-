package complex_vector;


public class Complex_Number {


	double real;
	double img;
	double magni;
	double arg;
	public Complex_Number() {
		real=0.0;
		img=0.0;
	}
	public Complex_Number(double r1,double img1)
	{
		real=r1;
		img=img1;
		magni=Math.sqrt(real*real+img*img);
		arg=Math.toDegrees(Math.atan((img/real)));	
	}
}
