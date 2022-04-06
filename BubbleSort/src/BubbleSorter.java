/**
 * @author Pawan K Sharma
 */
public class BubbleSorter {

    private int [] array; // array init

    /**
     * @param array
     * Modifies the value of current array with the given array
     */
    public BubbleSorter(int []array){
        this.array = array;
    }

    /**
     * @return the reference of the current array after
     * sorting the array in ascending oder
     */
    public int[] sortArray(){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            int j;
            for (j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
