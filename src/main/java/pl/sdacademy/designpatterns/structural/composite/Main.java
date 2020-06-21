package pl.sdacademy.designpatterns.structural.composite;

import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main (String[] args) {
     CocaColaCan coke = new CocaColaCan ();
     Snickers snickers = new Snickers ();
     CompositeProduct compositeProduct = new CompositeProduct (coke, snickers);
        System.out.println (compositeProduct.getPrice ());

        CompositeProduct compositeProduct2 = new CompositeProduct (compositeProduct, coke);
        System.out.println (compositeProduct2.getPrice ());
    }
}
