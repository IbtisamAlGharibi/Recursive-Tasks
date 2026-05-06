public class Array11Demo {
    static Array11 array11 = new Array11();
    public static void main(String[] args){
        int[] arr1 = {1, 2, 11};
        int[] arr2 = {11, 11};
        int[] arr3 = {1, 2, 3, 4};

        System.out.println(Array11.array11(arr1,2));
        System.out.println(Array11.array11(arr2,1));
        System.out.println(Array11.array11(arr3,1));

    }
}
