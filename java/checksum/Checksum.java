import java.util.Scanner;

public class Checksum {

    // Add binary strings with carry wrap-around
    static String addBinary(String a, String b) {
        int len = Math.max(a.length(), b.length());
        a = String.format("%" + len + "s", a).replace(' ', '0');
        b = String.format("%" + len + "s", b).replace(' ', '0');

        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = len - 1; i >= 0; i--) {
            int bitSum = (a.charAt(i) - '0') + (b.charAt(i) - '0') + carry;
            result.insert(0, bitSum % 2);
            carry = bitSum / 2;
        }

        if (carry == 1) {
            result = new StringBuilder(addBinary(result.toString(), "1"));
        }

        return result.toString().substring(result.length() - len);
    }

    static String onesComplement(String binary) {
        StringBuilder complement = new StringBuilder();
        for (char c : binary.toCharArray()) {
            complement.append(c == '0' ? '1' : '0');
        }
        return complement.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // STEP 1: Sender inputs message
        System.out.print("Sender: Enter binary message (multiple of 4 bits): ");
        String message = sc.nextLine().replaceAll("\\s", "");

        if (message.length() % 4 != 0) {
            System.out.println("Error: Message length must be a multiple of 4.");
            return;
        }

        int sliceCount = message.length() / 4;
        String[] slices = new String[sliceCount];

        System.out.println("\nMessage slices:");
        for (int i = 0; i < sliceCount; i++) {
            slices[i] = message.substring(i * 4, (i + 1) * 4);
            System.out.println("Slice " + (i + 1) + ": " + slices[i]);
        }

        // Calculate checksum
        String sum = slices[0];
        for (int i = 1; i < sliceCount; i++) {
            sum = addBinary(sum, slices[i]);
        }

        String checksum = onesComplement(sum);
        System.out.println("Generated checksum: " + checksum);

        String transmitted = message + checksum;
        System.out.println("Transmitted message (message + checksum): " + transmitted);

        // STEP 2: Receiver inputs the message received (manually)
        System.out.print("\nReceiver: Enter received message (including checksum): ");
        String received = sc.nextLine().replaceAll("\\s", "");

        if (received.length() % 4 != 0) {
            System.out.println("Error: Received message must be multiple of 4 bits.");
            return;
        }

        int totalSlices = received.length() / 4;
        String[] receivedSlices = new String[totalSlices];

        System.out.println("\nReceived Slices:");
        for (int i = 0; i < totalSlices; i++) {
            receivedSlices[i] = received.substring(i * 4, (i + 1) * 4);
            System.out.println("Slice " + (i + 1) + ": " + receivedSlices[i]);
        }

        // Add all received slices
        String total = receivedSlices[0];
        for (int i = 1; i < totalSlices; i++) {
            total = addBinary(total, receivedSlices[i]);
        }

        System.out.println("Checksum validation result: " + total);
        if (total.matches("1+")) {
            System.out.println(" No error detected.");
        } else {
            System.out.println(" Error detected in the received message.");
        }
    }
}























