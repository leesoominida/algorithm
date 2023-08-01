class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            int a = n;
            while(a > 0){
                answer = answer + my_string.charAt(i);
                a--;
            }    
        }
        return answer;
        
        
    }
}