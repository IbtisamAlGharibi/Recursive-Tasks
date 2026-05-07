public class NoX {
    public static String noX(String str){
        if (str.length()==0){
            return " ";
        }else if (str.charAt(0) == 'X'){
            return noX(str.substring(1));
        }else if (str.contains("x")){
            return noX(str.substring(1));
        }
        return str.charAt(0) + noX(str.substring(1));
    }
}
