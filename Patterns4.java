public class Patterns4
{
	public static void main(String[] args)
	{
		int row = 5,column = 5;
		
		for(int i=1; i<= row; i++)
		{
			for(int j=1; j<=column; j++)
			{
				System.out.print((char)(64+i) + " ");
			}
			System.out.println();
		}
	}
}

/*
A A A A A
B B B B B
C C C C C
D D D D D
E E E E E
*/