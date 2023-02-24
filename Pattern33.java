public class Pattern33
{
	public static void main(String[] args)
	{
		int row = 6;
		int column = 6;
		for(int i = 1; i < row; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i % 3 == 0)
				{
					System.out.print((char)(64+i) + " ");
				}
				if(i % 3 == 1)
				{
					System.out.print("* ");
				}
				if(i %3 == 2)
				{
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	
	}
}

/*
*
2 2
C C C
* * * *
5 5 5 5 5
*/