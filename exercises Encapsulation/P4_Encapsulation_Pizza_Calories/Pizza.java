package P4_Encapsulation_Pizza_Calories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {


    private String name;
    private Dough dought;
    private List<Topping> toppings;

    public Pizza(String name, int count) {
        setName(name);
        setToppings(count);
    }

    private void setName(String name) {

        if (name.trim().isEmpty() || name.length()>15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppings(int count) {
        if (count>=0 && count<=10){
            this.toppings = new ArrayList<>();
        }else {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }

    }

    public void setDought(Dough dought) {
        this.dought = dought;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping){
            this.toppings.add(topping);
    }

    public double getOverallCalories (){
        return this.dought.calculateCalories() + this.toppings.stream().mapToDouble(t-> t.calculateCalories()).sum();
    }
}



