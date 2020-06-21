package factory.abstractfactory;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Cheese createCheese();
    public Sauce createSauce();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
