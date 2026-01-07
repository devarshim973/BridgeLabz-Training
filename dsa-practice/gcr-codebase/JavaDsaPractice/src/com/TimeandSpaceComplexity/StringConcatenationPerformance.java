package com.TimeandSpaceComplexity;

class StringConcatenationPerformance {

    // Using immutable String (O(N²))
    static void concatenateUsingString(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + "A";
        }
    }

    // Using StringBuilder (O(N))
    static void concatenateUsingStringBuilder(int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append("A");
        }
    }

    // Using StringBuffer (O(N), thread-safe)
    static void concatenateUsingStringBuffer(int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append("A");
        }
    }

    public static void main(String[] args) {

        int operations = 10_000;

        // -------- String --------
        long stringStart = System.nanoTime();
        concatenateUsingString(operations);
        long stringEnd = System.nanoTime();

        // -------- StringBuilder --------
        long builderStart = System.nanoTime();
        concatenateUsingStringBuilder(operations);
        long builderEnd = System.nanoTime();

        // -------- StringBuffer --------
        long bufferStart = System.nanoTime();
        concatenateUsingStringBuffer(operations);
        long bufferEnd = System.nanoTime();

        System.out.println("Operations Count: " + operations);

        System.out.println("String Time (ms): " +
                (stringEnd - stringStart) / 1_000_000.0);

        System.out.println("StringBuilder Time (ms): " +
                (builderEnd - builderStart) / 1_000_000.0);

        System.out.println("StringBuffer Time (ms): " +
                (bufferEnd - bufferStart) / 1_000_000.0);
    }
}
