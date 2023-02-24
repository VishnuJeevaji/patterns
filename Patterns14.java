public class Patterns14
{
	public static void main(String[] args)
	{
		int row = 5,column = 5;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=column; j>=i; j--)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

/*
1 1 1 1 1
2 2 2 2
3 3 3
4 4
5
*/