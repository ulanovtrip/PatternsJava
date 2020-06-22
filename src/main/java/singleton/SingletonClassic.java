package singleton;

public class SingletonClassic {
    //переменная для хранения единственного экземпляра
    private static SingletonClassic uniqueInstance;

    //только SingletonClassic может создать экземляры этого класса
    private SingletonClassic() {
    }

    //создаёт и возвращает экземпляр
    public static SingletonClassic getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonClassic();
        }
        return uniqueInstance;
    }

    //here can be other methods
}
