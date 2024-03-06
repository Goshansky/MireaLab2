package pr7.Decorator;

// Декоратор
abstract class Decorator implements Component {
    private final Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
