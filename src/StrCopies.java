public class StrCopies {
    public static boolean strCopies(String str, String sub, int n){
        if (n == 0){
            return true;
        } else if (str.length()< sub.length()) {
            return false;
        }
    }
}
