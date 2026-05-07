public class PairStar {
    public static String pairStar(String str){
        if (str.length() == 0 || str.length()==1){
            return str;
        } else if (str.charAt(0) == str.charAt(1) ) {
            return str.charAt(0)+ "*" + str.charAt(1);
        }
    }
}
