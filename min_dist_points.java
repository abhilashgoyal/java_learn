package abhilash_learning;

import java.util.ArrayList;
public class min_dist_points {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))

  public int coverPoints(ArrayList<Integer> x, ArrayList<Integer> y) {
        if (x.size() <= 1) return 0;
        assert(x.size() == y.size());
        int ans = 0;
        for (int i = 0; i < x.size()-1; i++) {
            ans += max(Math.abs(x.get(i) - x.get(i+1)), Math.abs(y.get(i) - y.get(i+1)));
        }
        return ans;
    	
     
    }
        private int max(int abs, int abs2) {
		return ((abs>abs2)?abs:abs2);
	}
}
