public class BubbleSorterGeneric<T extends Comparable<? super T>> {

    private T [] array;

    public BubbleSorterGeneric(){
    }

    public void sortArray(T [] array){

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - i - 1; j++){

                // compareTo returns 0 if the value of current index is greater than
                // the next index and the swap is only made if the condition is met
                if (array[j].compareTo(array[j + 1]) > 0){
                    swapElements(j, array);
                }
            }
        }
    }

    private void swapElements(int index, T [] array){
        T temp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = temp;
    }
}
