public class CountHi {
    public static int countHi(String str){
        if (str.length()<2){
            return 0;
        }else if (str.substring(0, 2) =="Hi"){
            return 1;
        } else if (!(str.substring(0, 2) =="Hi")) {
            return 1 + countHi(str.substring(2));
        }

    }
}
