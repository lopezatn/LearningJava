public class Meal {
    private Burger burger;
    private SideDish sidedish;
    private Drink drink;

    public Meal() {
        this.burger = new Burger();
        this.sidedish = new SideDish();
        this.drink = new Drink();
    }
    
    // Method to get Burger setters
    public Burger getBurger() {
        return burger;
    }

    // Method to get Sidedish setters
    public SideDish getSidedish() {
        return sidedish;
    }

    // Method to get Drink setters  
    public Drink getDrink() {
        return drink;
    }


}

class Burger {
    private String burgerType, burgerTopping;
    private double burgerPrice;
    private int toppingCount = 0;

    public Burger() {
        this.burgerType = "Regular Burger";
        this.burgerTopping = "Ketchup";
        this.burgerPrice = 0.50;
    }

    public double setBurgerType(String burgerType) {
        // Example logic to set burger price based on type
        switch (burgerType) {
            case "RegularMeal":  burgerPrice = 1.39; break;
            case "BigMac":  burgerPrice = 1.39; break;
            case "Tasty":   burgerPrice = 1.99; break;
            case "Bacon&Cheese":    burgerPrice = 1.49; break;
            default:    burgerPrice = 0.0;  break;
        }
        return burgerPrice;
    }

    public void addTopping(String topping) {
        toppingCount++;
    }

    public double getBurgerPrice() {
        double extraToppings = toppingCount >= 4 ? (toppingCount - 3) * 0.50 : 0;
        return burgerPrice + extraToppings;
    }

}

class SideDish {
    private String sideType;
    private double sidePrice;

    public SideDish() {
        this.sideType = "Fries";
        this.sidePrice = 0.75;
    }

    // side type will be set by the user
    public double setSideType(String sideType) {
        switch (sideType) {
            case "Fries":   sidePrice = 0.75; break;
            case "Salad":   sidePrice = 0.59; break;
            case "Onion Rings": sidePrice = 0.95; break;
            default:    sidePrice = 0.0;    break;
        }
        return sidePrice;
    }

    public double getSidePrice() {
        return sidePrice;
    }

}

class Drink {
    private String drinkSize, drinkType;
    private double drinkPrice;

    public Drink() {
        this.drinkSize = "Small";
        this.drinkType = "Coke";
        this.drinkPrice = 0.35;
    }
    // Example logic to set drink price based on type and size

    // drink size and type will be set by the user
    public double setDrinkType(String drinkType) {
        switch (drinkType) {
            case "Coke":    drinkPrice += 0.99; break;
            case "Pepsi":   drinkPrice += 0.89; break;
            case "Sprite":  drinkPrice += 0.79; break;
            case "Fanta":   drinkPrice += 0.79; break;
            case "Water":   drinkPrice += 0.00; break;
            default:    drinkPrice = 0.0;   break;
        }
        return drinkPrice;
    }

    public double setDrinkSize(String drinkSize) {
        switch (drinkSize) {
            case "Small":   drinkPrice += 0.00; break;
            case "Medium":  drinkPrice += 0.50; break;
            case "Large":   drinkPrice += 1.00; break;
            default:        drinkPrice = 0.0;   break;
        }
        return drinkPrice;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

}