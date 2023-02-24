public class Pattern32
{
	public static void main(String[] args)
	{
		int num = 5;
		int l;
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= num; j++)
			{
				if(i<=j)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			for(l = i; l < num; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
*********
 *******
  *****
   ***
    *
*/
