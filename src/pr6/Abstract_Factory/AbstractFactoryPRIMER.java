package pr6.Abstract_Factory;

public class AbstractFactoryPRIMER {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
        productA.operationA();
        productB.operationB();
    }
}