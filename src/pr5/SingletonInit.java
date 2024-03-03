package pr5;

public class SingletonInit {
    // инициализация при запросе с использованием внутреннего статического класса
    private SingletonInit() {}

    private static class SingletonHolder {
        private static final SingletonInit INSTANCE = new SingletonInit();
    }

    public static SingletonInit getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
