package Oops;

public class IneritanceEx {
    double l;
    double h;
    double w;

    IneritanceEx () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    IneritanceEx (double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    IneritanceEx(double l,double h,double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    IneritanceEx (IneritanceEx old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Runnning the box");
    }
}

class BoxWeight extends IneritanceEx{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double h , double w , double weight){
        super(l,h,w);
        this.weight = weight;
    }
}