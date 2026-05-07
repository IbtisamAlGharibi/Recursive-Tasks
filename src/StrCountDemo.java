public class StrCountDemo {
    static StrCount strCount = new StrCount();
    public static void main(String[] args){
        System.out.println(StrCount.strCount("catcowcat", "cat"));
        System.out.println(StrCount.strCount("catcowcat", "cow"));
        System.out.println(StrCount.strCount("catcowcat", "dog"));
    }
}
