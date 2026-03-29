class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");

        System.out.println("Modified String: " + sb);

        // Comment:
        // StringBuilder is faster and not thread-safe.
        // StringBuffer is slower but thread-safe.
    }
}