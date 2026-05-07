public class FibonacciDemo {
    static Fibonacci fibonacci = new Fibonacci();

    public static void main(String[] args){
        System.out.println(Fibonacci.fibonacci(0));
        System.out.println(Fibonacci.fibonacci( 1));
        System.out.println(Fibonacci.fibonacci(2));
        System.out.println(Fibonacci.fibonacci(10));

    }
}
