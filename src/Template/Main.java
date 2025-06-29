package Template;

public class Main {
    public static void main(String[] args) {
        Beverage tea = new TeaBeverage();
        Beverage coffee= new CoffeeBeverage();

        System.out.println("Preparing tea...");
        tea.prepareRecipe();
        System.out.println("\nPreparing coffee...");
        coffee.prepareRecipe();
    }
}
