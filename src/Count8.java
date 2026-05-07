public class Count8 {
    public static int count8(int n){
        int lastDigit= n % 10;
        int secondDigit =  (n / 10) % 10;
        if (n == 0){
            return 0;
        } else if (lastDigit == 8 && lastDigit-1 ==8) {
            return 2;
        } else if (lastDigit == 8 && !(lastDigit+1 ==8)) {
            return 1;
        }
    }
}
