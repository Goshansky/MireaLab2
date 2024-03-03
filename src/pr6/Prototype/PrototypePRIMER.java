package pr6.Prototype;

public class PrototypePRIMER {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        Prototype clonedPrototype1 = prototype.clone();
        Prototype clonedPrototype2 = prototype.clone();
        clonedPrototype1.operation();
        clonedPrototype2.operation();
    }
}
