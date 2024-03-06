package pr7.Composite;

// Пример использования
public class CompositeExample {
    public static void main(String[] args) {
        Composite composite = new Composite();
        composite.add(new Leaf("Leaf1"));
        composite.add(new Leaf("Leaf2"));

        Composite subComposite = new Composite();
        subComposite.add(new Leaf("Leaf3"));
        subComposite.add(new Leaf("Leaf4"));

        composite.add(subComposite);

        composite.operation();
    }
}
