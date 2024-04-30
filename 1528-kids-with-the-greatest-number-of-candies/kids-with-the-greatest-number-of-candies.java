class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int candy : candies) {
            max = Math.max(candy, max);
        }
        List<Boolean> ans = new ArrayList<>();
        for(int candy: candies) {
            ans.add(max <= candy + extraCandies);
        }
        return ans;
    }
}