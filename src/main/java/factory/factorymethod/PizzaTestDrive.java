package factory.factorymethod;

public class PizzaTestDrive {
    public static void main(String[] args) {
        //создаём два объекта пицерий
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        //используем одни для выполнения заказа
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Oleg ordered a " + pizza.getName() + "\n");

        //второй для второго заказа
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Ivan ordered a " + pizza.getName() + "\n");
    }
}
