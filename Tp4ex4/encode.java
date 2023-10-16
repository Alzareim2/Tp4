public class encode {
    public static void main(String[] args) {
        encodeAndPrint(254);  // On espere : 01111111
        encodeAndPrint(136);  // On espere : 00010001
    }

    public static void encodeAndPrint(int n) {
        if (n < 0 || n >= 256) {
            System.out.println();
            return;
        }

        String binaryEncoding = "";
        for (int i = 0; i < 8; i++) {
            if (n % 2 == 0) {
                binaryEncoding = "0" + binaryEncoding;
            } else {
                binaryEncoding = "1" + binaryEncoding;
            }
            n = n / 2;
        }

        System.out.println(binaryEncoding);
    }
}

