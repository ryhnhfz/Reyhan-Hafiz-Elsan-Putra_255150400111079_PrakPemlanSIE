import java.util.*;

public class Main {

    public static int[] bubble(int[] list) {
        int tukarAtauGeser = 0;

        for (int i = 0; i < list.length - 1; i++) {
            for (int k = i + 1; k < list.length; k++) {
                if (list[i] < list[k]) {
                    int t = list[i];
                    list[i] = list[k];
                    list[k] = t;
                    tukarAtauGeser++;
                }
            }
        }
        System.out.println("\nBubble: " + tukarAtauGeser);
        return list;
    }

    public static int[] insertion(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 1; i < list.length; ++i) {
            int key = list[i];
            int k = i - 1;

            while (k >= 0 && list[k] < key) {
                list[k + 1] = list[k];
                k = k - 1;
                tukarAtauGeser++;
            }
            list[k + 1] = key;
        }
        System.out.println("\nInsertion: " + tukarAtauGeser);
        return list;
    }

    public static int[] selection(int[] list) {

        int tukarAtauGeser = 0;
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;

            for (int k = i + 1; k < list.length; k++) {
                if (list[k] > list[minIndex]) {
                    minIndex = k;
                }
            }

            int t = list[minIndex];
            list[minIndex] = list[i];
            list[i] = t;
            tukarAtauGeser++;
        }
        System.out.println("\nSelection: " + tukarAtauGeser);
        return list;
    }

    public static void main(String[] args) {

    int[] arr;
    arr = new int[]{
    34, 7, 23, 32, 5, 62, 78, 1, 45, 90,
    12, 56, 89, 67, 3, 21, 44, 88, 11, 9,
    100, 54, 2, 76, 81, 19, 27, 6, 39, 14};

    System.out.println("Array sebelum sorting:");
    System.out.println(Arrays.toString(arr));

    // Bubble
    int[] bubbleSorted = bubble(arr.clone());
    System.out.println("Bubble Sort:");
    System.out.println(Arrays.toString(bubbleSorted));

    // Insertion
    int[] insertionSorted = insertion(arr.clone());
    System.out.println("Insertion Sort:");
    System.out.println(Arrays.toString(insertionSorted));

    // Selection

    int[] selectionSorted = selection(arr.clone());
    System.out.println("Selection Sort:");
    System.out.println(Arrays.toString(selectionSorted));
    }
}