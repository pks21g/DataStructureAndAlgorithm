import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * @author Pawan K Sharma
 */
public class BubbleSorterTest {

   @Test
    public void sortArray(){     // test method

       int arr [] = {-6, -200, -1000}; // define an array

       BubbleSorter bs = new BubbleSorter(arr);    // object of BubbleShorter

       assertArrayEquals("Array test failed",           // message to show if failed
                                   new int[] {-1000, -200, -6}, // expected result
                                   bs.sortArray());            // actual result
   }

}
