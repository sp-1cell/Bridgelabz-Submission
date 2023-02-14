public class Practice {
    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println(sum);


    }
}
