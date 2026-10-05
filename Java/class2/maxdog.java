public class maxdog{
    public static void main(String[] args) {
        
        Dog d3 = new Dog(3);
        Dog d4 = new Dog(6);
        d3.bark();
        d4.bark();
        d3.maxdog(d4).bark();
    }
    
}