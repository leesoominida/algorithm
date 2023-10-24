class Solution {
    public int[] solution(int n) {
        int i = 0;
        for(int j = 1; j <=n; j++){
            if(n%j == 0){
                i++;
            }
        }
        int[] answer = new int[i];
        
        int k = 0;
        for(int j=1; j <= n; j++){
            if(n%j == 0){
                answer[k] = j;
                k++;
            }
        }
        
        return answer;
    }
}