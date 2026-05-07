public class ParenBitDemo {
    static ParenBit parenBit = new ParenBit();
    public static void main(String[] args){
        System.out.println(ParenBit.parenBit("xyz(abc)123"));
        System.out.println(ParenBit.parenBit( "x(hello)"));
        System.out.println(ParenBit.parenBit("(xy)1"));
    }
}
