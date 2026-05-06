public class BunnyEars {
    public static int bunnyEars2(int n){
        if (n==0){
            return 0;
        } else if (n % 2 == 0) {
            return 3;
        }
        return 2 + bunnyEars2(n - 1);
    }
}
