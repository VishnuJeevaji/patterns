public class Patterns15
{
	public static void main(String[] args)
	{
		int row = 5,column = 5;
		
		for(int i=row; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}


/*
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
*/