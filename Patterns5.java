public class Patterns5
{
	public static void main(String[] args)
	{
		int row = 5,column = 5;
		
		for(int i=1; i<= row; i++)
		{
			for(int j=1; j<=column; j++)
			{
				System.out.print((char)(64+j) + " ");
			}
			System.out.println();
		}
	}
}

/*
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
*/