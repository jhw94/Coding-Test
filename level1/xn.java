package level1;

public class xn {


}

class Solution2 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < n; i++){
            answer[i] = x*(i+1);
        }
        return answer;
    }
}