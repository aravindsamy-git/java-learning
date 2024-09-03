package recursionImp;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factotialofn(5));
    }

    static int factotialofn(int n){

        if(n == 1){
            return 1;
        }

        return n * factotialofn(n-1);
    }
}
