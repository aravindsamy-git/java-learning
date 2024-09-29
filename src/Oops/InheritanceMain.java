package Oops;

public class InheritanceMain {
    public static void main(String[] args) {

        BoxWeight box = new BoxWeight();
        BoxWeight box1 = new BoxWeight(box);

        System.out.println(box.l+ " " + box.h + " "+ box.w + " " + box.weight);

        Boxprice price1 = new Boxprice(5);
        System.out.println(price1.l);
    }
}
