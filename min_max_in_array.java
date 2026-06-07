public class day1 {
    public static void main(String[] args) {
        int[] a = {5, 9, 95, 10, 2, 17};
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < 6; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            else if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

