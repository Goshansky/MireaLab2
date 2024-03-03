package pr6.Builder;

class Director {
    public void construct(Builder builder) {
        builder.buildPart1();
        builder.buildPart2();
    }
}
