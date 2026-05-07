public class StrCopiesDemo {
    static StrCopies strCopies = new StrCopies();
    public static void main(String[] args){
        System.out.println(StrCopies.strCopies("catcowcat","cow",2));
        System.out.println(StrCopies.strCopies( "catcowcat","cat",3));
        System.out.println(StrCopies.strCopies("catcowcat","cow",5));
    }
}
