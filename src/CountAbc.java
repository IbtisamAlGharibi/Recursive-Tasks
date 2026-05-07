public class CountAbc {
    public static int countAbc(String str){
        int count = 0;
        if (str.length() < 3){
            return 0;
        } else if ((str.charAt(0) == 'a' && str.charAt(1) == 'b' && str.charAt(2) == 'c')
            || (str.charAt(0) == 'a' && str.charAt(1) == 'b' && str.charAt(2) == 'a') ){
            return count=1;
        }
      return  countAbc(str.substring(1));
    }
}
