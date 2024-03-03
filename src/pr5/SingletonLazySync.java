package pr5;

public class SingletonLazySync {
    // с использованием синхронизации
    private static SingletonLazySync instance;

    private SingletonLazySync() {}

    public static synchronized SingletonLazySync getInstance() {
        if (instance == null) {
            instance = new SingletonLazySync();
        }
        return instance;
    }
}
