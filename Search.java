public class Search {
    public static int linearSearch(int[] arr, int search) {
    int check = 0;

    for (int i = 0; i < arr.length; i++) {
        check++;
        if (arr[i] == search) {
            System.out.println("Linear check: " + check);
            return i;
        }
    }

    System.out.println("Linear check: " + check);
    return -1;
    }

    public static int binarySearch(int[] arr, int search) {
    int low = 0, high = arr.length - 1;
    int check = 0;

    while (low <= high) {
        check++;
        int mid = low + (high - low) / 2;

        if (arr[mid] == search) {
            System.out.println("Binary check: " + check);
            return mid;
        }

        if (arr[mid] < search) low = mid + 1;
        else high = mid - 1;
    }

    System.out.println("Binary check: " + check);
    return -1;
    }
 
    public static void main(String[] args) {

    int[] arr = {
    1, 2, 3, 5, 6, 7, 9, 11, 12, 14,
    19, 21, 23, 27, 32, 34, 39, 44, 45, 54,
    56, 62, 67, 76, 78, 81, 88, 89, 90, 100};

    int result1 = linearSearch(arr, 88);
    System.out.println("Linear Search (88): " + result1);
    
    int result2 = linearSearch(arr, 50);
    System.out.println("Linear Search (50): " + result2);

    int result3 = binarySearch(arr, 88);
    System.out.println("Binary Search (88): " + result3);
    
    int result4 = binarySearch(arr, 50);
    System.out.println("Binary Search (50): " + result4);
    }

}