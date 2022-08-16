class Solution {
    public double average(int[] salary) {
        double ans = 0d;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int sal : salary){
            max = Math.min(max, sal);
            min = Math.max(min, sal);
            ans += sal;
        }
        return (ans - min - max) / (salary.length - 2);
    }
}