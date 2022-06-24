class Solution {
    public boolean isPossible(int[] target) {
        if(target.length==1 && target[0]!=1){
            return false;
        }
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        long sum=(long)0;
        int size=target.length;
        for(int i=0;i<target.length;i++){
            long temp=(long)target[i];
            pq.add(temp);
            sum=sum+target[i];
        }
        boolean flag=true;
        while(pq.peek()>(long)1){
            long val=pq.poll();
            sum=sum-val;         
            if(sum>=val){
                flag=false;
                break;
            }
            if(sum==1) break;
            val=val%sum;
            if(val==0){
                flag=false;
                break;
            }
            sum=sum+val;
            pq.add(val);
        } 
        return flag;
    }    
}