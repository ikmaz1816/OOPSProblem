package problemOnOops;

public class AddSubMulDivRationalNumber {
	
	private int numerator;
	private int denominator;
	
	public AddSubMulDivRationalNumber(int numerator,int denominator)
	{
		this.numerator=numerator;
		this.denominator=denominator;
	}
	public int gcd(int a,int b)
	{
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
	public void simplify()
	{
		int a=gcd(numerator,denominator);
		this.numerator=this.numerator/a;
		this.denominator=this.denominator/a;
	}
	public void print()
	{
		System.out.println(this.numerator+"/"+this.denominator);
	}
	public AddSubMulDivRationalNumber add(AddSubMulDivRationalNumber r2)
	{
		this.numerator=this.numerator * r2.denominator;
		r2.numerator=this.denominator * r2.numerator;
		this.numerator=this.numerator+r2.numerator;
		this.denominator=this.denominator*r2.denominator;
		simplify();
		AddSubMulDivRationalNumber r3=new AddSubMulDivRationalNumber(this.numerator,this.denominator);
		return r3;
	}
	public AddSubMulDivRationalNumber sub(AddSubMulDivRationalNumber r2)
	{
		this.numerator=this.numerator * r2.denominator;
		r2.numerator=this.denominator * r2.numerator;
		this.numerator=this.numerator-r2.numerator;
		this.denominator=this.denominator*r2.denominator;
		simplify();
		AddSubMulDivRationalNumber r3=new AddSubMulDivRationalNumber(this.numerator,this.denominator);
		return r3;
	}
	public AddSubMulDivRationalNumber mul(AddSubMulDivRationalNumber r2)
	{
		this.numerator=this.numerator * r2.numerator;
		this.denominator=this.denominator * r2.denominator;
		simplify();
		AddSubMulDivRationalNumber r3=new AddSubMulDivRationalNumber(this.numerator,this.denominator);
		return r3;
	}
	public AddSubMulDivRationalNumber div(AddSubMulDivRationalNumber r2)
	{
		this.numerator=this.numerator * r2.denominator;
		this.denominator=this.denominator * r2.numerator;
		simplify();
		AddSubMulDivRationalNumber r3=new AddSubMulDivRationalNumber(this.numerator,this.denominator);
		return r3;
	}
	public static void main(String[] args) {
		AddSubMulDivRationalNumber arr=new AddSubMulDivRationalNumber(8,3);
		AddSubMulDivRationalNumber arr1=new AddSubMulDivRationalNumber(4,6);
		AddSubMulDivRationalNumber arr2=arr.div(arr1);
		arr2.print();
		}

}
