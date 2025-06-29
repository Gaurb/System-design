package Template;

public class CoffeeBeverage extends Beverage{
    @Override
    void brew() {
        System.out.println("Steeping coffee bag...");
    }
    @Override
    void addCondiments() {
        System.out.println("Adding Milk...");
    }
}
