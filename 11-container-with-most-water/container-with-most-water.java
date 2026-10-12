class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int currAns = 0, maxAns = 0;
        while(left<right){
            int wd = right - left;
            int ht = Math.min(height[left], height[right]);
            currAns = wd*ht;
            maxAns = Math.max(currAns, maxAns);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return maxAns;
    }
}