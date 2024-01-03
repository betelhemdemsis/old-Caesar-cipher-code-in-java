import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a message to encrypt: ");
        String message = scanner.nextLine();

        System.out.print("Enter key (ps: key=3): ");
        int key = scanner.nextInt();

        if (key == 3) {
            char[] encryptedMessage = encrypt(message, key);
            System.out.println("Encrypted message: " + new String(encryptedMessage));
        } else {
            System.out.println("Invalid key added to the code!");
        }
    }

    private static char[] encrypt(String message, int key) {
        char[] result = new char[message.length()];

        for (int i = 0; i < message.length(); ++i) {
            char ch = message.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + key);

                if (ch > 'z') {
                    ch = (char) (ch - 'z' + 'a' - 1);
                }

                result[i] = ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + key);

                if (ch > 'Z') {
                    ch = (char) (ch - 'Z' + 'A' - 1);
                }

                result[i] = ch;
            } else {
                // If the character is not a letter, leave it unchanged
                result[i] = ch;
            }
        }

        return result;
    }
}
