package LocalRepo.Day4and5_LinearBinarySearch;

public class StringPerformanceTest {

    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";

       
        StringBuilder sb = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;
        StringBuffer sbf = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;

        System.out.println("Time taken by StringBuilder: " + timeBuilder / 1_000_000 + " ms");
        System.out.println("Time taken by StringBuffer: " + timeBuffer / 1_000_000 + " ms");
    }
}

