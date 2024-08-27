package recursionImp;

public class RecursionIntro {

    public static void main(String[] args) {
        print2(1);
    }

    static void print2(int n){
        System.out.println(n);
        if(n == 5){
            return;
        }
        print2(n+1);
    }
}
