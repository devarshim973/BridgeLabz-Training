class CharacterCount {

    public static void main(String[] args) {

        String input = "devarshi";
        boolean[] printed = new boolean[256]; // track printed characters

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!printed[ch]) { // only print first time
                int count = 0;

                // count occurrences
                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(j) == ch) {
                        count++;
                    }
                }

                System.out.print(ch + "=" + count);

                if (i < input.length() - 1) {
                    System.out.print(", ");
                }

                printed[ch] = true; // mark as printed
            }
        }
    }
}
