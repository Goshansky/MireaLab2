package pr2.num3_3;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Human> humans = List.of(
                new Human(30, "Миша", "Иванов", LocalDate.of(1992, 5, 15), 70),
                new Human(25, "Сергей", "Иванов", LocalDate.of(1997, 8, 21), 65),
                new Human(40, "Я", "Тут", LocalDate.of(1982, 12, 5), 80),
                new Human(35, "Георгий", "Пархоменко", LocalDate.of(1987, 3, 10), 60)
        );

        // Шаг 1: Фильтрация по фамилии не Иванов
        System.out.println("Фильтрация по не Иванов");
        Stream<Human> stream1 = humans.stream();
        stream1.filter(h -> !"Иванов".equals(h.getLastName())).forEach(System.out::println);


        // Шаг 2: Сортировка по весу в обратном порядке
        System.out.println("\nСортировка по весу в обратном порядке");
        Stream<Human> stream2 = humans.stream();
        stream2.sorted(Comparator.comparingInt(Human::getWeight).reversed()).forEach(System.out::println);

        // Шаг 3: Сортировка по возрасту
        System.out.println("\nСортировка по возрасту");
        Stream<Human> stream3 = humans.stream();
        stream3.sorted(Comparator.comparingInt(Human::getAge)).forEach(System.out::println);

        // Шаг 4: Произведение всех возрастов
        int ageProduct = humans.stream()
                .mapToInt(Human::getAge)
                .reduce(1, (a, b) -> a * b);

        // Вывод результата
        System.out.println("\nПроизведение всех возрастов: " + ageProduct);
    }
}
