public class Patterns21
{
	public static void main(String[] args)
	{
		int row = 5,column = 5;
		
		for(int i=row; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(64+j) + " ");
			}
			System.out.println();
		}
	}
}

/*
A B C D E
A B C D
A B C
A B
A
*/