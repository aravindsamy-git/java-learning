package recursionImp;

public class Triangle {
    public static void main(String[] args) {
        triangle2(4,0);
        triangle1(4, 0);
    }

    static void triangle1(int r,int c){
        if (r == c) {
            return;
        }

        printSpaces(r - c - 1);
        printStars(2 * c + 1);
        System.out.println();
        triangle1(r, c + 1);
    }

    static void printSpaces(int count) {
        if (count == 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(count - 1);
    }

    static void printStars(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("*");
        printStars(count - 1);
    }

    static void triangle2(int r,int c){
        if(r == 0){
            return;
        }

        if(c < r){
            System.out.print("*");
            triangle2(r,c+1);
        }else {
            System.out.println();
            triangle2(r-1,0);
        }
    }
}
