public class Pattern35
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=1; j++)
			{
				if (i==j)
				{
					System.out.print("* ");
				}
				else if (j<i)
				{
					System.out.print("* ");
				}
				System.out.println("");
			}
			for(int k=1; k<=4; k++)
			{
				if (i==k)
				{
					System.out.print(" ");
				}
				if (i<k)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}