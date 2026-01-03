class DecimalToBinary {

    public static void main(String[] args) {

        int num = 15;
        String binary = "";

        while (num > 0) {
            int rem = num % 2;   // remainder 0 or 1
            binary = rem + binary; // prepend to the binary string
            num = num / 2;       // divide by 2
        }

        System.out.println(binary);
    }
}
