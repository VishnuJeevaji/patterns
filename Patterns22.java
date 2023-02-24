public class Patterns22
{
	public static void main(String[] args)
	{
		int row = 5,column = 5;
		
		for(int i=row; i>=1; i--)
		{
			for(int j=i; j<=row; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

/*
5
4 4
3 3 3
2 2 2 2
1 1 1 1 1
*/