package test;

/**
 * @Author: Mr.M
 * @Date: 2019-04-11 15:11
 * @Description:
 **/
public class t2 {
	public static void main(String[] args) {
		Integer i01 = 59;
		int i02 = 59;
		Integer i03 =Integer.valueOf(59);
		Integer i04 = new Integer(59);
		System.out.println(i03==i04);
		System.out.println(i02==i04);
	}
}

class Test
{
	public static int aMethod(int i)throws Exception
	{
		try{
			return i / 10;
		}
		catch (Exception ex)
		{
			throw new Exception("exception in a Method");
		} finally{
			System.out.printf("finally");
		}
	}

	public static void main(String [] args)
	{
		try
		{
			aMethod(0);
		}
		catch (Exception ex)
		{
			System.out.printf("exception in main");
		}
		System.out.printf("finished");
	}
}