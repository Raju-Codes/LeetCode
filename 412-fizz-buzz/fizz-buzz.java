class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        
        for(int i = 1; i<=n; i++){
            String con = "";
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if(divisibleBy3 && divisibleBy5) {
                con = "FizzBuzz";
            } else if (divisibleBy3) {
                con = "Fizz";
            } else if (divisibleBy5) {
                con ="Buzz";
            } else {
                con +=i;
            }
            answer.add(con);
        }
        return answer;
    }
}