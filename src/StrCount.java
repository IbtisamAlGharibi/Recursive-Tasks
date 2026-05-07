public class StrCount {
    public static int strCount(String str, String sub){
        int count = 0;
        if (str.length() < sub.length()){
            return 0;
        } else if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }
}
