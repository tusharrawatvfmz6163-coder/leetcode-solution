 class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>q=new PriorityQueue<>((a,b)->b-a);
        for(int i:stones){
            q.add(i);
        }
        while (q.size()>1){
            int y=q.remove();
            int x=q.remove();
            if(x!=y){
                q.add(y-x);
            }
            
        }
        return q.isEmpty()?0:q.remove();
    }
}