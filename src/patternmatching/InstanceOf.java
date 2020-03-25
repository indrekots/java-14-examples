package patternmatching;

class InstanceOf {
    public static void main(String[] args) {
        String str = "Hello World";
        Object obj = str;

        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }

        if (obj instanceof String s && s.length() > 5) {
            System.out.println(s);
        }
    }
}
