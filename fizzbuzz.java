class Solution {
    public List<String> fizzBuzz(int n) {
        String[] answer = new String[n-1];
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && and i % 5 == 0) {
                answer[i] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                answer[i] = "Fizz";
            }
            else if (i % 5 == 0) {
                answer[i] = "Buzz";
            }
            else {
                answer[i] = i;
            }
        }    
        return answer;    
        }      
    }