import org.junit.Test;

import static org.junit.Assert.*;


public class MatrixTest {
    @Test
    public void testCountDeterminant(){
        Matrix test = new Matrix(3, 3);
        test.setElement(1, 2, 5);
        test.setElement(2, 0, 1);
        test.setElement(0, 0, 1);
        test.setElement(0, 1, 3);
        test.setElement(0, 2, 1);
        test.setElement(1, 0, 2);
        test.setElement(1, 1, 1);
        test.setElement(2, 2, 1);
        //assertEquals(test.countDeterminant(), 9);
    }
}