package singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized uniqueInstance;

    //synchronized - заставляем каждый поток дождаться своей очереди входа в него.
    public static synchronized SingletonSynchronized getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new SingletonSynchronized();
        }
        return uniqueInstance;
    }
}
