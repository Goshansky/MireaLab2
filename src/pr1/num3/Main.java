package pr1.num3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Пример использования
        String[] inputStrings = {"hello", "world", "java"};
        Function<String[], String[]> mirrorFunction = new MirrorStrings();
        String[] mirrored = mirrorFunction.apply(inputStrings);
        System.out.println("Отзеркаленно: " + Arrays.toString(mirrored));
    }
}
