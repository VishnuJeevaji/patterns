public class Patterns7
{
	public static void main(String[] args)
	{
		int row = 5,column = 5;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=column; j>=1; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/