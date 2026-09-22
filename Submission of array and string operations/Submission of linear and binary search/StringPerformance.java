public class StringPerformance {

    public static void main(String[] args) {

        int n = 1000000;

        // StringBuilder
        long startBuilder = System.nanoTime();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            builder.append("hello");
        }

        long endBuilder = System.nanoTime();

        // StringBuffer
        long startBuffer = System.nanoTime();

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }

        long endBuffer = System.nanoTime();

        long builderTime = endBuilder - startBuilder;
        long bufferTime = endBuffer - startBuffer;

        System.out.println("StringBuilder Time: "
                + builderTime + " nanoseconds");

        System.out.println("StringBuffer Time: "
                + bufferTime + " nanoseconds");
    }
}