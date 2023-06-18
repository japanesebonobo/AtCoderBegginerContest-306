import java.util.*;

public class B_Base2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A[] = new long[64];
        for (int i = 0; i < 64; i++) {
            A[i] = scanner.nextLong();
        }
        scanner.close();

        long ans = 0L;
        for (int i = 0; i < A.length; i++) {
            ans += A[i] << i;
        }
        System.out.println(ans);
    }
}

