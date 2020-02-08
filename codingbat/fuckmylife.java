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
        a = round10(a);
        b = round10(b);
        c = round10(c);
        return a + b + c;
    }

    public int round10(int num) {
        int firstDigit = num / 10;
        int lastDigit = num % 10;
        if(lastDigit < 5)
            num = 10 * firstDigit;
        else if(lastDigit >= 5)
            num = 10 * (firstDigit + 1);
        return num;
    }

    public static boolean closeFar(int a, int b, int c) {

        return (Math.abs(a - b) <= 1 && Math.abs(a - c) < 2 && Math.abs(b - c) < 2 || Math.abs(b - a) <= 1 && Math.abs(c - a) < 2 && Math.abs(c - b) < 2);
    }

    public static void main(String[] args) {
        System.out.println(fuckmylife.closeFar(1, 3, 2));
    }
}

