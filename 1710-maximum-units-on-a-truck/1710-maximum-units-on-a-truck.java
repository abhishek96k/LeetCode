class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int maxUnitOfBoxes = 0;
        for(int[] box : boxTypes) {
            int noOfBoxes = box[0];
            int noOfUnits = box[1];
            
            if(truckSize >= noOfBoxes) {
                maxUnitOfBoxes += noOfBoxes * noOfUnits;
                truckSize -= noOfBoxes;
            } else {
                maxUnitOfBoxes += truckSize * noOfUnits;
                return maxUnitOfBoxes;
            }
        }
        return maxUnitOfBoxes;
    }
}