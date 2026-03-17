import java.util.*;

public class Solution {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {

        // Sort A ascending
        Collections.sort(A);

        // Sort B descending
        Collections.sort(B, Collections.reverseOrder());

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B.get(i) < k) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            List<Integer> A = new ArrayList<>();
            List<Integer> B = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                A.add(sc.nextInt());
            }

            for (int i = 0; i < n; i++) {
                B.add(sc.nextInt());
            }

            System.out.println(twoArrays(k, A, B));
        }

        sc.close();
    }
}