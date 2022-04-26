import java.util.Arrays;

public class BubbleSortGenericTester {
    public static void main(String[] args) {
        BubbleSorterGeneric<String> stringSorter = new BubbleSorterGeneric<>();

        String [] names = {"goat", "chicken", "boat", "coat", "Iron"};
        stringSorter.sortArray(names);
        System.out.println(Arrays.toString(names));

        BubbleSorterGeneric<Integer> integerSorter = new BubbleSorterGeneric<>();
        Integer [] numbers = {18, -20, 100, 40, 200, 12};
        integerSorter.sortArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
