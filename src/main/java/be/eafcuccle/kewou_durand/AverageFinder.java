package be.eafcuccle.kewou_durand;

public class AverageFinder {
    public static void main(String[] args) {
        System.out.println("Average finder v0.1");
        double avg = findAverage(args);
        System.out.println("The average is " + avg);
    }

    private static double findAverage(String[] input) {
        double result = 1;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        // return result
        return result / input.length;
    }
}