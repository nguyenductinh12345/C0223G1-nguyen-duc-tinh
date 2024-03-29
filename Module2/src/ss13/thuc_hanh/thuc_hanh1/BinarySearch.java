package ss13.thuc_hanh.thuc_hanh1;

public class BinarySearch {
    static int[] list = {1, 2, 4, 7, 10, 13, 25, 14, 45, 50, 60, 70};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 13));
        System.out.println(binarySearch(list, 45));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 0));
    }
}

