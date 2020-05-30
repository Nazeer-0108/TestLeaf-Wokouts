package Workouts;
public class Day11_MatrixTranspose 
{
	public static void main(String[] args) 
	{
		int[][] matrix = {{1,2,3}, 
						  {4,5,6}, 
						  {7,8,9}};
		System.out.print("Before Transpose");
		for (int i = 0; i < matrix.length; i++)
		{
			System.out.print("\n");
			for (int j=0; j < matrix.length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
		}
		System.out.println();
		System.out.print("After Transpose");
		for (int i = 0; i < matrix.length; i++)
		{
			System.out.print("\n");
			for (int j=0; j < matrix.length; j++)
			{
				System.out.print(matrix[j][i] + " ");
			}
		}
		System.out.println();
	}

}
