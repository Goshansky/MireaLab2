package pr7.Decorator;

// Конкретный декоратор
class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        additionalOperation();
    }

    private void additionalOperation() {
        System.out.println("Additional operation by ConcreteDecorator");
    }
}
