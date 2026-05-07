public class CountAbcDemo {
    static CountAbc countAbc = new CountAbc();
    public static void main(String[] args){
        System.out.println(CountAbc.countAbc( "abc"));
        System.out.println(CountAbc.countAbc( "abcxxabc"));
        System.out.println(CountAbc.countAbc( "abaxxaba"));
    }
}
