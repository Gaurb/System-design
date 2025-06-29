package Template;

public abstract class Beverage {

    boolean isCondimentsNeeded() {
        return true;
    }

    void prepareRecipe(){
        boilWater();
        pourInCup();
        brew();
        if(isCondimentsNeeded()){
            addCondiments();
        }
    }
    void boilWater(){
        System.out.println("Boiling water........");
    }

    void pourInCup(){
        System.out.println("Pouring in cup........");
    }
    void brew(){};
    void addCondiments(){};
}
