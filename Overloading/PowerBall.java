public class PowerBall{
	
	private int num2;
	private int a;
	private int[] num1;
	
    public PowerBall()
	{
		num1 = new int[6];
		clear();
	}
	public void Creat1()
	{
		for(int i = 0;i<6;i++)
		{
			while(true)
			{
				 a =(int)Math.ceil(Math.random()*38);
				if(a!=num1[0]||a!=num1[1]||a!=num1[2]||a!=num1[3]||a!=num1[4]||a!=num1[5])
				{
					num1[i] = a;
					break;
				}
			}
		}
	}
	public void Creat2()
	{
		num2 = (int)Math.ceil(Math.random()*8);
	}
	public String toString()
	{
		return ("第一區:"+num1[0]+" "+num1[1]+" "+num1[2]+" "+num1[3]+" "+num1[4]+" "+num1[5]+" 第二區:"+num2);
	}
	public void clear()
	{
		num1[0] = 0;
		num1[1] = 0;
		num1[2] = 0;
		num1[3] = 0;
		num1[4] = 0;
		num1[5] = 0;
	}
}