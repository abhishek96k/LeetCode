class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList();
        for(int[] num : intervals) {
            if(num[1] < newInterval[0]) {
                result.add(num);
            } else if(newInterval[1] < num[0]) {
                result.add(newInterval);
                newInterval = num;
            } else {
                newInterval[0] = Math.min(newInterval[0], num[0]);
                newInterval[1] = Math.max(newInterval[1], num[1]);
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}