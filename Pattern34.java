public class Pattern34
{
	public static void main(String[] args)
	{
		int row = 7;
		int column = 6;
		for(int i = 1; i < row; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i % 3 == 0)
				{
					System.out.print((char)(64+j) + " ");
				}
				if(i % 3 == 1)
				{
					System.out.print("* ");
				}
				if(i %3 == 2)
				{
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}	
	}
}

/*
*
1 2
A B C
* * * *
1 2 3 4 5
A B C D E F
*/