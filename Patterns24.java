public class Patterns24
{
	public static void main(String[] args)
	{
		int row = 5,column = 5;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=column; j++)
			{
				if( (i+j) >= 6)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

/*
    *
   **
  ***
 ****
*****
*/