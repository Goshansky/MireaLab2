package pr6.Builder;

class Product {
    private String part1;
    private String part2;

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public void show() {
        System.out.println("Part1: " + part1 + ", Part2: " + part2);
    }
}
