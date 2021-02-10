public class PositiveSum {
    public static void main(String[] args) {
        int[] myNums = {1,2,3, -5, -9, -11};

        System.out.println(sumPositive(myNums));
    }

    static int sumPositive(int[] arr) {
        int sum = 0;
        // do some magic
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum+=arr[i];
            }
        }
        return sum;
    }
}
