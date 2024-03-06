package pr7.Decorator;

// Пример использования
public class DecoratorExample {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator(component); // Декорируем компонент
        component.operation();
    }
}