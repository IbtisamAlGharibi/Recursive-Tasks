public class ParenBit {
    public static String parenBit(String str){
        if (str.startsWith("(") && str.endsWith(")")){
            return str;
        } else if (!(str.startsWith("("))) {
            return str.replace(str.substring(1),"");
        } else if (!(str.endsWith(")"))) {
            return str.substring(0, str.length() - 1);
        }
        return "not string";
    }
}
