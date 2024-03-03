package pr6.Builder;

public class BuilderPRIMER {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.construct(builder);
        Product product = builder.getResult();
        product.show();
    }
}
