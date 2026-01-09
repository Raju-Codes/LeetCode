class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        
        for(int i = 1; i<=n; i++){
            String con = "";
            if(i%3==0 && i%5==0) {
                con = "FizzBuzz";
            } else if (i%3==0) {
                con = "Fizz";
            } else if (i%5==0) {
                con ="Buzz";
            } else {
                con +=i;
            }
            answer.add(con);
        }
        return answer;
    }
}