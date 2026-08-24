public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int count = 1000000;

        long start = System.nanoTime();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            builder.append("hello");
        }

        long builderTime = System.nanoTime() - start;

        start = System.nanoTime();

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < count; i++) {
            buffer.append("hello");
        }

        long bufferTime = System.nanoTime() - start;

        System.out.println("StringBuilder time: "
                + builderTime / 1000000.0 + " milliseconds");

        System.out.println("StringBuffer time: "
                + bufferTime / 1000000.0 + " milliseconds");
    }
}