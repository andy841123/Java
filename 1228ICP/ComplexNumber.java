public class ComplexNumber implements TCNumber<ComplexNumber>
{	
	private double imag;
	private double real;
	
	public ComplexNumber(double r,double i)
	{
		real = r;
		imag = i;
	}
	public ComplexNumber(double r)
	{
		real = r;
		imag = 0;
	}
	public ComplexNumber()
	{
		real = 0;
		imag = 0;
	}
	public ComplexNumber add(ComplexNumber c2)
	{
		double rs = real + c2.real;
		double is = imag + c2.imag;
		ComplexNumber cs = new ComplexNumber(rs,is);
		return cs;
	}
	public ComplexNumber division(ComplexNumber c2)
	{
		double rs = (real * c2.real + imag * c2.imag)/(c2.real*c2.real +c2.imag*c2.imag);
		double is = (imag * c2.real-real * c2.imag )/(c2.real*c2.real +c2.imag*c2.imag);
		ComplexNumber cs = new ComplexNumber(rs,is);
		return cs;
	}
	public double getImag()
	{
		return imag;
	}
	public double getReal()
	{
		return real;
	}
	public ComplexNumber minus(ComplexNumber c2)
	{
		double rs = real - c2.real;
		double is = imag - c2.imag;
		ComplexNumber cs = new ComplexNumber(rs,is);
		return cs;
	}
	public ComplexNumber multiplication(ComplexNumber c2)
	{
		double rs = real * c2.real - imag * c2.imag;
		double is = real * c2.imag + imag * c2.real;
		ComplexNumber cs = new ComplexNumber(rs,is);
		return cs;
	}
	public void setImag(double i)
	{
		imag = i;
	}
	public void setReal(double r)
	{
		real = r;
	}
	public String toString()
	{
		if(imag<0)
		{
			imag = imag - 2*imag;
			return "(" + real + "-" + imag + "i" + ")";
		}
		else
			return "(" + real + "+" + imag + "i" + ")";
	}
}
