package pr5;

public class SingletonTest {
    public static void main(String[] args) {
        // Проверка первой реализации (с использованием синхронизации)
        SingletonLazySync singleton1 = SingletonLazySync.getInstance();
        SingletonLazySync singleton2 = SingletonLazySync.getInstance();
        System.out.println(singleton1 == singleton2);

        // Проверка второй реализации (двойная проверка блокировки)
        SingletonD singleton3 = SingletonD.getInstance();
        SingletonD singleton4 = SingletonD.getInstance();
        System.out.println(singleton3 == singleton4);

        // Проверка третьей реализации (инициализация при запросе с использованием внутреннего статического класса)
        SingletonInit singleton5 = SingletonInit.getInstance();
        SingletonInit singleton6 = SingletonInit.getInstance();
        System.out.println(singleton5 == singleton6);
    }
}
