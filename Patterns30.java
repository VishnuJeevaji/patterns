public class Patterns30
{
	public static void main(String[] args)
	{
		int row = 5,column = 5;
		
		for(int i=row; i>=1; i--)
		{
			for(int j=i; j<=column; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

/*
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5
*/