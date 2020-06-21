package factory.abstractfactory;

//конкретный создатель
public class NYPizzaStoreForAbstract extends PizzaStoreForAbstract {


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        //фабрика создаёт ингридиенты для всех пицц в нью-йоркском стиле
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            //при создании каждой пиццы задается фабрика, которая должна использоваться для производства ее ингридиетов
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("clam")) {
            //
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
