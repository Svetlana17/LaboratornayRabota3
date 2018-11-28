package MementoPattern;

public class Application {
    public static void main(String[] args) {
        Originator originator = new Originator();//cсоздатель
        Caretaker caretaker = new Caretaker();//опекун

        originator.setState("on");
        System.out.printf("State is %s\n", originator.getState());
        caretaker.setMemento(originator.saveState());

        originator.setState("off");
        System.out.printf("State is %s\n", originator.getState());

        originator.restoreState(caretaker.getMemento());
        System.out.printf("State is %s\n", originator.getState());
    }
}
