
public class Main {

    public static void main(String[] args) {
        int len = args.length;
        double arr[] = new double[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Double.parseDouble(args[i]);
        }

        BubbleSort.sort(arr);

        printArray(arr);
    }

    private static void printArray(double[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
