class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int n = heights.length;
        int area = 0,top=0;
        Stack<Integer> stk = new Stack<>();
        int i=0;
        while(i<n){
            if(stk.isEmpty() || heights[i]>= heights[stk.peek()]){
                stk.push(i);
                i++;
            }
            else{
                top = stk.pop();
                area = heights[top]*(stk.isEmpty()?i:i-stk.peek()-1);
                if(area>max){
                    max=area;
                }
            }
        }
        while(!stk.isEmpty()){
            top = stk.pop();
            area = heights[top]*(stk.isEmpty()?i:i-stk.peek()-1);
            if(area>max){
                max=area;
            }
        }
        return max;
    }
}
