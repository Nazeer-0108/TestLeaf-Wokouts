package Workouts;
public class Day11_MatrixAddition 
{
	public static void main(String[] args) 
	{
		int[][] matrix1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] matrix2 = {{9,8,7}, {6,5,4}, {3,2,1}};
		System.out.print("Matrix 1 Before Transpose");
		for (int i = 0; i < matrix1.length; i++)
		{
			System.out.print("\n");
			for (int j=0; j < matrix1.length; j++)
			{
				System.out.print(matrix1[i][j] + " ");
			}
		}
		System.out.println();
		System.out.print("Matrix 2 Before Transpose");
		for (int i = 0; i < matrix2.length; i++)
		{
			System.out.print("\n");
			for (int j=0; j < matrix2.length; j++)
			{
				System.out.print(matrix2[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("Sum of matrix");
		Integer [][] sum = new Integer[3][3];
		System.out.println("Lenght of Matrix-1: " + matrix1.length);
		System.out.println("Lenght of Matrix-2: " + matrix2.length);
		for (int i = 0; i < matrix1.length; i++)
		{
			System.out.print("\n");
			for (int j=0; j < matrix2.length; j++)
			{
				sum[i][j] = matrix1[i][j] + matrix2[i][j]; 
				System.out.print(sum[i][j] + " ");
			}
		}
		
	}

}
