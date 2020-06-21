package pl.sdacademy.designpatterns.structural.adapter;

public class NevaMasqueradeCat implements Cat {
    @Override
    public void meow () {
        System.out.println ("Miaaau");
    }

    @Override
    public void eat () {
        System.out.println ("Mniam");
    }
}
