package pl.sdacademy.designpatterns.behavioral.observer;

public class PressReader implements PressObserver {
    private String fullName;

    public PressReader (String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void update (String paper) {
        System.out.println ("Czytelik " + fullName + " odczytuje: " + paper);
    }
}
