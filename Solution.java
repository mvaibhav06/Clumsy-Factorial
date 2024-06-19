class Solution {
    public int clumsy(int n) {
        // 90 / 8 + 7 - 30 / 4 + 3 - 2

        int out = n;
        char ch = '*';
        int i = n-1;

        while(i>0){
            if(ch == '*'){
                out *= i;
                i--;
                if(i>0){
                    out /= i;
                    i--;
                }
                if(i>0){
                    out += i;
                    ch = '-';
                    i--;
                }
            }else if(ch == '-'){
                int temp = i;
                i--;
                if(i > 0){
                    temp *= i;
                    i--; 
                }else {
                    out -= temp;
                    break;
                }
                if(i > 0){
                    temp /= i;
                    i--;
                }else {
                    out -= temp;
                    break;
                }
                if(i > 0){
                    out -= temp;
                    out += i;
                    i--;
                    ch = '-';  
                }else {
                    out -= temp;
                    break;
                }
            }
        }
        return out;
    }
}
