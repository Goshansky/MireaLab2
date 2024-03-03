package pr6.Prototype;

class Prototype implements Cloneable {
    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void operation() {
        System.out.println("Prototype operation");
    }
}