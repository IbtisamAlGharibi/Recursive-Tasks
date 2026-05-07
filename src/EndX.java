public class EndX {
    public static String  endX(String str){
        if (str.length()==0){
            return " ";
        }else if (str.charAt(0) == 'x'){
            return  endX(str.substring(1)) + "x";
        } else if (!(str.charAt(0) == 'x')) {
            return str;
        }
    }
}
