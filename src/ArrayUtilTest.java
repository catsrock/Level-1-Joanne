import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void testArrayUtil() {
		int[] arr = {2, 7, 5, 1, 0};
		int[] testArr = {0, 1, 5, 7, 2};
		
		ArrayUtil.reverseArray(arr);
		
		assertArrayEquals(testArr, arr);
	}
	
	@Test
	public void testReverseAllRows(){
		int[][] mat = {{1, 2, 3, 4},
					   {5, 6, 7, 8},
					   {9, 10, 11, 12}};
		
		int[][] testArr = {{4, 3, 2, 1},
				           {8, 7, 6, 5},
				           {12, 11, 10, 9}};
		
		Matrix mat1 = new Matrix(mat);
		mat1.reverseAllRows();
		
		assertArrayEquals(testArr, mat1.getIntArray());
	}
	
	@Test
	public void testReverseMatrix(){
		int[][] mat = {{1, 2, 3, 4},
				       {5, 6, 7, 8},
				       {9, 10, 11, 12}};
	
		int[][] testArr = {{12, 11, 10, 9},
			               {8, 7, 6, 5},
			               {4, 3, 2, 1}};
	
		Matrix mat1 = new Matrix(mat);
		mat1.reverseMatrix();
		
		assertArrayEquals(testArr, mat1.getIntArray());
	}

}


