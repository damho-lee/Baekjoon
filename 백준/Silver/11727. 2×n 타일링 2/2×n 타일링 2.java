import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int readInput() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return Integer.parseInt(reader.readLine().trim());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int calculate(int n) {
        if (n == 1) {
            return 1;
        }

        int arr[] = new int[n + 1];
        arr[1] = 1;
        arr[2] = 3;

        for (int i = 3; i < arr.length; i++) {
            arr[i] = (2 * arr[i - 2] + arr[i - 1]) % 10007;
        }

        return arr[n];
    }

    private static void run() {
        int n = readInput();
        System.out.println(calculate(n));
    }

    public static void main(String[] args) {
        run();
    }
}
