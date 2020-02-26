package nullpointer;

class HelpfulNullPointer {

    public static void main(String[] args) {
        var person = new Person();
        System.out.println(person.name.fullName());
    }

    static class Person {
        Name name;
    }

    static class Name {
        String firstName;
        String lastName;

        String fullName() {
            return firstName + " " + lastName;
        }
    }
}
