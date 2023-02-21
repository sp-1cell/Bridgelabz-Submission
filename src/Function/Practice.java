package Function;

public class Practice {
        public static void main(String[] args) {
            int[] arr = new int[50];

            int sum;
            for (sum = 0; sum < arr.length; arr[sum] = sum++) {
            }

            sum = 0;
            int[] var3 = arr;
            int var4 = arr.length;

            for (int var5 = 0; var5 < var4; ++var5) {
                int num = var3[var5];
                sum += num;
            }

            System.out.println(sum);
        }
}
