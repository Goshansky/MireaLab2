package pr3.num3;


public class Main {
    public static void main(String[] args) {
        LockedMap<String, Integer> concurrentMap = new LockedMap<>();

        // Добавление элементов
        concurrentMap.put("1", 1);
        concurrentMap.put("2", 2);
        concurrentMap.put("3", 3);

        // Получение размера
        System.out.println("Размер: " + concurrentMap.size());

        // Получение элементов
        System.out.println("Значение по ключу 1': " + concurrentMap.get("1"));

        // Удаление элемента
        concurrentMap.remove("2");

        // Проверка наличия ключа
        System.out.println("Проверка '2': " + concurrentMap.containsKey("2"));

        // Очистка карты
        concurrentMap.clear();

        // Проверка размера после очистки
        System.out.println("Размер после удаления: " + concurrentMap.size());

        System.out.println();

        SynchronizedSet<Integer> synchronizedSet = new SynchronizedSet<>();

        // Добавление элементов
        synchronizedSet.add(1);
        synchronizedSet.add(2);
        synchronizedSet.add(3);

        // Получение размера
        System.out.println("Размер: " + synchronizedSet.size());

        // Проверка наличия элемента
        System.out.println("Проверим 2: " + synchronizedSet.contains(2));

        // Удаление элемента
        synchronizedSet.remove(2);

        // Проверка размера после удаления
        System.out.println("Размер после: " + synchronizedSet.size());
    }
}
