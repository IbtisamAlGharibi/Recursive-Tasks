public class ParenBit {
    public static String parenBit(String str){
        if (str.startsWith("(") && str.endsWith(")")){
            return str;
        } else if (!(str.startsWith("("))) {
            return str.replace(str.substring(1),"");
        }
    }
}
