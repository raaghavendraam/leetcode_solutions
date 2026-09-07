// Last updated: 07/09/2026, 08:45:55
class Solution {
    public double angleClock(int hour, int min) {
        double m = (min*6)%360;
        double h = ((30*hour)%360);
        h= h+((m/12));
        double ans = Math.abs(m-h);
        return Math.min(ans,360-ans);
    }
}