import java.io.*;
import java.util.Scanner;

public class TextMerge
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String str,str1,str2,str3;
		int count=0;
		try
		{
			str1 = input.next();
			str2 = input.next();
			str3 = input.next();
			FileReader fr = new FileReader(str1);
			BufferedReader bfr = new BufferedReader(fr);
			FileReader fr1 = new FileReader(str2);
			BufferedReader bfr1 = new BufferedReader(fr1);
			FileWriter fw = new FileWriter(str3);
			BufferedWriter bfw = new BufferedWriter(fw);
			FileReader frfin = new FileReader(str3);
			BufferedReader bfrfin = new BufferedReader(frfin);
			
			while((str=bfr.readLine()) != null)
			{
				count++;
				bfw.write(str);
				bfw.newLine();
			}
			while((str=bfr1.readLine()) != null)
			{
				count++;
				bfw.write(str);
				bfw.newLine();
			}
			
			bfw.write(String.format("多遙遠 多糾結 多想念 多無法描寫 疼痛 和瘋癲 你都看不見\n想穿越 想飛天 想變成 造字的倉頡 寫出 能讓你快回來 的詩篇"));
			bfw.flush();
			while((str=bfrfin.readLine()) != null)
			{
				count++;
				System.out.println(str);
			}
			fr.close();
			fr1.close();
			frfin.close();
			fw.close();
		}
		catch(FileNotFoundException e1)
		{
		}
		catch(IOException e2)
		{
		}
	}
}