package pl.sdacademy.designpatterns.behavioral.observer;

public class Main {
    public static void main (String[] args) {
        PressPublisher pressPublisher = new PressPublisher ("NY Times");
        PressReader pressReader = new PressReader ("Kamil Lek");
        pressPublisher.addObserver (pressReader);
        pressPublisher.publish ("AaaaaaBbbbbbCccccc");

        Billboard billboard = new Billboard ();
        pressPublisher.addObserver (billboard);
        pressPublisher.publish ("KLLsjjdnJJJJJSnnnndjk");
    }
}
