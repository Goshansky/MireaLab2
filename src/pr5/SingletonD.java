package pr5;

public class SingletonD {
    // двойная проверка блокировки
    private static volatile SingletonD instance;

    private SingletonD() {}

    public static SingletonD getInstance() {
        if (instance == null) {
            synchronized (SingletonD.class) {
                if (instance == null) {
                    instance = new SingletonD();
                }
            }
        }
        return instance;
    }
}
