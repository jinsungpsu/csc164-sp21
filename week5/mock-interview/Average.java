public class Average {
    public static void main(String[] args) {
        int[] myNums = {1,2,3, -5, -9, -11};

        System.out.println(sumPositive(myNums));
        System.out.println(average(myNums));
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

    static double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double average = ((double)sum)/arr.length;
        return average;
    }
}
