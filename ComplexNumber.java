package problemOnOops;

public class ComplexNumber {
	private int real;
	private int imaginary;
	public ComplexNumber(int real,int imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void print()
	{
		if(this.imaginary>0)
			System.out.println(this.real+"+"+this.imaginary+"j");
		else
			System.out.println(this.real+""+this.imaginary+"j");
	}
	public ComplexNumber add(ComplexNumber r2)
	{
		this.real=this.real + r2.real;
		this.imaginary=this.imaginary + r2.imaginary;
		ComplexNumber r3=new ComplexNumber(this.real,this.imaginary);
		return r3;
	}
	public ComplexNumber sub(ComplexNumber r2)
	{
		this.real=this.real - r2.real;
		this.imaginary=this.imaginary - r2.imaginary;
		ComplexNumber r3=new ComplexNumber(this.real,this.imaginary);
		return r3;
	}
	public ComplexNumber mul(ComplexNumber r2)
	{
		int a=(this.real * r2.real) + (this.imaginary * r2.imaginary * -1) ;
		this.imaginary=(this.real * r2.imaginary) + (this.imaginary * r2.real);
		this.real=a;
		ComplexNumber r3=new ComplexNumber(this.real,this.imaginary);
		return r3;
	}
	
	public static void main(String[] args) {
		ComplexNumber arr=new ComplexNumber(4,5);
		ComplexNumber arr1=new ComplexNumber(6,-7);
		ComplexNumber arr2=arr.mul(arr1);
		arr2.print();

	}

}
