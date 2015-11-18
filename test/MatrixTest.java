import org.junit.Test;

import static org.junit.Assert.*;


public class MatrixTest {
    @Test
    public void testCountDeterminant(){
        Matrix test = new Matrix(3, 3);
        test.matrix=new int[][]{{1, 3, 1},
                                {2, 1, 5},
                                {1, 0, 1}};
        assertEquals(test.countDeterminant(), 9);
    }
}