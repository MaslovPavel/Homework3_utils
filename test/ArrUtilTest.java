import org.junit.Test;

import static org.junit.Assert.*;


public class ArrUtilTest {
    @Test
    public void changeLengthTestTrim(){
        int[] arr = {5, 1, 3, 5};
        int[] arrExpected = {5, 1, 3};
        assertArrayEquals(ArrUtil.changeLength(arr, 3), arrExpected);
    }

    @Test
    public void changeLengthTestExtend(){
        int[] arr = {5, 1, 3, 5};
        int[] arrExpected = {5, 1, 3, 5, 0};
        assertArrayEquals(ArrUtil.changeLength(arr, 5), arrExpected);
    }


    @Test
    public void compareTestCouldBeEqual(){
        int[] arr1 = {5, 1};
        int[] arr2 = arr1;
        assertTrue(ArrUtil.compare(arr1, arr2));
    }
}