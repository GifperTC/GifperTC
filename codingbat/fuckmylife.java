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
    
}