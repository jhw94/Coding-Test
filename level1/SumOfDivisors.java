package level1;

public class SumOfDivisors {



}

class Solution1 {
    public int solution(int n) {
        int answer= 0;
        for(int i = 1; i <= n; i++){
            if(n%i==0){  // 나머지가 0이면 약수이기 때문에
                answer+= i;
            }
        }
        return answer;
    }
}