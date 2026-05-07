public class Count11 {
    public static int count11(String str){
        if (str.length()<2){
            return 0;
        } else if (str.substring(0, 2) == "11") {
            return 1;
        }else if (str.substring(1,3) == "11") {
            return 1 + count11(str.substring(2));
        }
        return count11(str.substring(1));
    }
}
