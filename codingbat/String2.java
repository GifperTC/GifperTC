public class String2{
    public String doubleChar(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            result += (str.charAt(i));
            result += (str.charAt(i));
        }
        return result;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i + 2).equals("hi"))
                count++;
        }
        return count;
    }

    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++){
            if(str.substring(i, i + 3).equals("cat"))
                catCount++;
        }
        for (int i = 0; i < str.length() - 2; i++){
            if(str.substring(i, i + 3).equals("dog"))
                dogCount++;
        }
        return catCount == dogCount;
    }

    public int countCode(String str) {
        int count = 0;
        
        for (int i = 0; i < str.length() - 3; i++){
            String string = str.substring(i, i + 4);
            if(string.equals("code") == false){
                if(string.startsWith("c") && string.endsWith("e") && string.charAt(1) == "o")
                    count++;
            }
            count++;
        }
        return count;
    }

    // public static void main(String[] args) {
    //     System.out.println(String2.doubleChar("Giorno"));
    // }
}