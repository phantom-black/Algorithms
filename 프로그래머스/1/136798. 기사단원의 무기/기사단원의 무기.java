class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i = 1; i<=number; i++) {
            int sqrt = (int) Math.sqrt(i);
            int sum = 0;
            for(int j = sqrt; j>0; j--) {
                if(i%j==0) {
                    if(Math.sqrt(i)==j) {
                        sum++;
                    } else {
                        sum+=2;
                    }
                    
                }
            }

            if(sum > limit) {
                answer += power;
            } else {
                answer += sum;
            }
        }

        return answer;
    }
}