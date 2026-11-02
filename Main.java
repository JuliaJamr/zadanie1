public class Main {

    public static void main(String[] args)
    {
        SubarrayAnalyzer tablica1 = new SubarrayAnalyzer(new int[] {1,2,3,1,2,3,4,5,6,3});

        int a = tablica1.findLongestIncreasingBounds()[0];
        int b = tablica1.findLongestIncreasingBounds()[1];

        System.out.println(a + " " + b);

    }
}
