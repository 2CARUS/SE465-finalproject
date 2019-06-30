public class Child extends Parent {
    private int birthOrder;
    public Child(String name) {
        super(name);
    }
    public int getBirthOrder() {return this.birthOrder;}
    public void setBirthOrder(int birthOrder) {this.birthOrder = birthOrder;}
}