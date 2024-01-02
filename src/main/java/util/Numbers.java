package util;

public class Numbers {

    public static void swap(int index_a, int index_b, int [] array) {
        int temp = array[index_a];
        array[index_a] = array[index_b];
        array[index_b] = temp;
    }

    public static int random(int start, int end) {
        int length = end - start + 1;
        int random = (int) (Math.random() * length);
        System.out.println(random);

        return start + random;
    }
}
