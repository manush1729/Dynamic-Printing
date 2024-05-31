import java.util.*;
import java.io.*;
public class dynaprint
{
	public static void main(String args[])
	{
		System.out.println("Enter the string that is to be done in dynamic printing. Give it in lowercase");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String dyn="";
		Random rand=new Random();
		for(int i=0;i<str.length();i++)
		{
			char ch=(char)(rand.nextInt((123-97)+1)+97);
			while(ch!=str.charAt(i))
			{
			ch=(char)(rand.nextInt((123-97)+1)+97);
				try {
			Thread.sleep(100);
			} 
			catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println(dyn+ch);
			}
			dyn+=ch;
		}
	}
}