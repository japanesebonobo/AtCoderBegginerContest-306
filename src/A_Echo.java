import java.util.*;

public class A_Echo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char s[] = scanner.next().toCharArray();
        scanner.close();

        for (int i = 0; i < N; i++) {
            System.out.print(s[i]);
            System.out
            .print(s[i]);
        }
    }
}

