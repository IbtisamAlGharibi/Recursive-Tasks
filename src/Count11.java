public class Count11 {
    public static int count11(String str){
        if (str.length()<2){
            return 0;
        } else if (str.substring(0, 2) == "11") {
            return 1;
        }
    }
}
