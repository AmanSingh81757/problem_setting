import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 1; i <= t; i++) {
            solve(scanner);
        }
        scanner.close();
    }

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Map<Integer, Integer> mp = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (mp.containsKey(a[i] + i)) {
                ans += mp.get(a[i] + i);
            }
            mp.put(a[i] - i, mp.getOrDefault(a[i] - i, 0) + 1);
        }

        System.out.println(ans);
    }
}
