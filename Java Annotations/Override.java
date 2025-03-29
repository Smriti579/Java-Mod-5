class Parent {
    void display() {}
}
class Child extends Parent {
    @Override
    void display() {  // Ensures correct method overriding
        System.out.println("Overridden method");
    }
}
