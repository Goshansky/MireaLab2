package pr1.num3;

public class MirrorStrings implements Function<String[], String[]> {
    @Override
    public String[] apply(String[] strings) {
        String[] mirroredStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            mirroredStrings[i] = new StringBuilder(strings[i]).reverse().toString();
        }
        return mirroredStrings;
    }
}
