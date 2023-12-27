package util;

public class Numbers {

    public static void swap(int index_a, int index_b, int [] array) {
        int temp = array[index_a];
        array[index_a] = array[index_b];
        array[index_b] = temp;
    }
}
