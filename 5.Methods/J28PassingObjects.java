public class J28PassingObjects {

    //Passing object as a parameter.
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 5, 6 };
        modifyArray(arr);
        System.out.println("Array from Main Method");
        for (int value : arr) {
            System.out.print(value + " ");
        }

    }

    public static void modifyArray(int[] arr) {
        arr[0] = 0;
        System.out.println("Array from the Modify Array Method");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
