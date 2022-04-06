import java.util.Arrays;

/**
 * @author Pawan K Sharma
 * Test driver class with main method
 */
public class BubbleSorterTester {
    public static void main(String[] args){

        int [] array = {5, 12, 4 }; // definition of int array

        // instantiating object of BubbleSorter class with a constructor
        // that takes parameter of type int array
        BubbleSorter sorter = new BubbleSorter(array);

        sorter.sortArray(); // sorting array objet with sortArray method

        // printing using Arrays class
        System.out.println(Arrays.toString(array));

        // printing array using enhanced for loop
        for (int num : array){
            System.out.print(num + " ");
        }





        }
}
