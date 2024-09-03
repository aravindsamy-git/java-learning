package recursionImp;

public class Nto1 {
    public static void main(String[] args) {
        nto1(5);
        reverseNto1(5);
    }

    static void nto1(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        nto1(n-1);
    }

    static void reverseNto1(int n){
        if (n == 0){
            return;
        }

        reverseNto1(n-1);
        System.out.println(n);
    }

}
