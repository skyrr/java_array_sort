/**
 * Created by sky on 22.04.2017.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {4, 67, 3, 435, 65, 4745, 87, 879, 98, 453, 13};
        bubbleSort(input);
    }

    private static void bubbleSort(int[] array) {
        int q = 0;
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            q++;
            printNumbers(array);
        }
        System.out.println(q + " passes");
    }

    private static void printNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }

    private static void swapNumbers(int i, int k, int[] array) {
        int temp;
        temp = array[i];
//        System.out.println(array[i]);
        array[i] = array[k];
        array[k] = temp;
    }
}
