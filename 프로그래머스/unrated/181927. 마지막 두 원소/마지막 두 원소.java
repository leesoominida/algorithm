class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int end = num_list.length - 1;
        if(num_list[end] > num_list[end-1]){
            answer[end+1] = num_list[end] - num_list[end-1]; 
        }else{
            answer[end+1] = num_list[end]*2;
        }
        
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}