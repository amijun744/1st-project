public class Main {
    public static void main(String[] args) {
        Person person = new Person("Amir", 56, 21,true);
        System.out.println(person.getCorrectName()); // Output:amir
        CapitalizeDecorator capitalizedPerson = new CapitalizeDecorator(person);
        System.out.println(capitalizedPerson.getCorrectName()); // Output:Amir
        TrimmerDecorator capitalizedTrimmedPerson = new TrimmerDecorator(capitalizedPerson);
        System.out.println(capitalizedTrimmedPerson.getCorrectName()); // Output: Amir
        }
}