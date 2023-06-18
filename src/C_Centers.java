import java.util.*;

public class C_Centers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        int s2[] = new int[s.length];
        int t2[] = new int[t.length];

        int alphaCount = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == '@') {
                alphaCount++;
            }
            int sValue = s[i];
            s2[i] = sValue;
            int tValue = t[i];
            t2[i] = tValue;
            
        }

        String atcoder[] = {"a", "t", "c", "o", "d", "e", "r"};

        List<String> charList = new ArrayList<>();
        charList = Arrays.asList(atcoder);

        int notFound = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '@') {
                continue;
            }
            int ret = search(t2, s2[i]);
            if (ret == -1) {
                if (charList.contains(String.valueOf(s[i]))) {
                    notFound++;
                } else {
                    System.out.println("No");
                    System.exit(0);
                }
            } else {
                t[ret] = '0';
            }
        }
        if(notFound <= alphaCount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static int search(int[] data, int target) {
        Arrays.sort(data);
		int ret = -1;
		int left = 0;
		int right = data.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (data[mid] == target) {
				return mid;
			} else if (target < data[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return ret;
	}
}