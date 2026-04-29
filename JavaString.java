public class JavaString {
    public static void main(String[] args) {

        String firstName = "Robiul Aoual";
        String lastName = "Rakib";

        String fullName = firstName + " " + lastName;

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Full Name: " + fullName);

        System.out.println("Length: " + fullName.length());
        System.out.println("Uppercase: " + fullName.toUpperCase());
        System.out.println("Lowercase: " + fullName.toLowerCase());
    }
}