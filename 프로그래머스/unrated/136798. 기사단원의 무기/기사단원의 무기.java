class Solution {
    public int solution(int number, int limit, int power) {
        int sum = 0;
        
        for(int i = 1; i <= number; i++){
            int cnt = getCountDivisors(i);
            
            if(cnt > limit){
                sum += power;
            }else{
                sum += cnt;
            }
        }
        return sum;
    }
    
    public int getCountDivisors(int num){
        int cnt = 0;
        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                cnt += 1;
            }
        }
        cnt += 1;
        return cnt;
    }
    
    
    
    
}