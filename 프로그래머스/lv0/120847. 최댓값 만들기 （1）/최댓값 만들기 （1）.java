import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int l = numbers.length;
        
        Arrays.sort(numbers);
        
        answer = numbers[l-2] * numbers[l-1];
        
        return answer;
    }
}