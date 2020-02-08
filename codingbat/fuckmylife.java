public class fuckmylife{
    public boolean makeBricks(int small, int big, int goal) {
        int maxBig = goal/5;
          if(maxBig <= big)
              goal -= maxBig*5;
          else
              goal -= big*5;
          if(goal <= small)
              return true;
          return false;
    }

    public int loneSum(int a, int b, int c) {
        if(a == b){
           if(a == c)
                return 0;
            else
                return c; 
        }
        if(a == c)
            return b;
        if(b == c)
            return a;
        return a + b + c;
    }

    public int luckySum(int a, int b, int c) {
        if(a == 13)
            return 0;
        else if(b == 13)
            return a;
        else if(c == 13)
            return a + b;
        else
            return a + b + c;
    }
    
    public int noTeenSum(int a, int b, int c) {
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);
        return a + b + c;
    }

    public int fixTeen(int n){
        if(13 <= n & n <= 19){
            if(n == 15 || n == 16)
                return n;
            return 0;
        }
        return n;
    }

    public int roundSum(int a, int b, int c) {
  
    }
}