class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(var ele: nums){
            m.put(ele, m.getOrDefault(ele, 0) + 1);
        }
        for(var p: m.entrySet()){
            if(p.getValue() == 1){
                return p.getKey();
            }
        }
        return -1;
    }
}