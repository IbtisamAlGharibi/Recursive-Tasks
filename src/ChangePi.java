public class ChangePi {
    public static String  changePi(String str){
        if (str.length() == 0){
            return "";
        } else if (str.startsWith("pi")) {
            return "3.14" + changePi(str.substring(2));
        }
        return String.valueOf(str.charAt(0));
    }
}
