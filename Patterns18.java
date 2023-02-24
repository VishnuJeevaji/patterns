public class Patterns18
{
	public static void main(String[] args)
	{
		int row = 5,column = 5;
		
		for(int i=row; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(64+i) + " ");
			}
			System.out.println();
		}
	}
}

/*
E E E E E
D D D D
C C C
B B
A
*/