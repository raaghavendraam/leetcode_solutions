// Last updated: 07/09/2026, 08:45:05
import java.util.*;

class Solution {
    public int maxBuilding(int n, int[][] restrictions) {

        List<int[]> list = new ArrayList<>();

        // Building 1 must have height 0
        list.add(new int[]{1, 0});

        for (int[] r : restrictions) {
            list.add(r);
        }

        Collections.sort(list, (a, b) -> a[0] - b[0]);

        // Add building n restriction if not present
        if (list.get(list.size() - 1)[0] != n) {
            list.add(new int[]{n, n - 1});
        }

        int m = list.size();

        // Left -> Right
        for (int i = 1; i < m; i++) {
            int dist = list.get(i)[0] - list.get(i - 1)[0];
            list.get(i)[1] =
                Math.min(list.get(i)[1], list.get(i - 1)[1] + dist);
        }

        // Right -> Left
        for (int i = m - 2; i >= 0; i--) {
            int dist = list.get(i + 1)[0] - list.get(i)[0];
            list.get(i)[1] =
                Math.min(list.get(i)[1], list.get(i + 1)[1] + dist);
        }

        int ans = 0;

        // Find maximum peak between consecutive restrictions
        for (int i = 1; i < m; i++) {
            int x1 = list.get(i - 1)[0];
            int h1 = list.get(i - 1)[1];

            int x2 = list.get(i)[0];
            int h2 = list.get(i)[1];

            int dist = x2 - x1;

            int peak = (h1 + h2 + dist) / 2;
            ans = Math.max(ans, peak);
        }

        return ans;
    }
}