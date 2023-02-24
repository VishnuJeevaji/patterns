public class Patterns19
{
	public static void main(String[] args)
	{
		int row = 5,column = 5;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=column; j>=i; j--)
			{
				System.out.print((char)(64+j) + " ");
			}
			System.out.println();
		}
	}
}

/*
E D C B A
E D C B
E D C
E D
E
*/