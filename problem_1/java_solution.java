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
        int k = scanner.nextInt();

        Map<Integer, Integer> mp = new HashMap<>();
        int ans = 0, left = 0, right = 0, maxx = 0;

        while (right < n) {
            mp.put(a[right], mp.getOrDefault(a[right], 0) + 1);
            maxx = Math.max(maxx, mp.get(a[right]));

            if ((right - left + 1) - maxx <= k) {
                ans = Math.max(ans, right - left + 1);
                right++;
            } else {
                mp.put(a[left], mp.get(a[left]) - 1);
                if (mp.get(a[left]) == 0) {
                    mp.remove(a[left]);
                }
                left++;
                right++;
            }
        }

        System.out.println(ans);
    }
}
