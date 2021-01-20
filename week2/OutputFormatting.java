public class OutputFormatting {
    public static void main(String[] args) {

        System.out.println("Sixer:\tCelics:\t\n95\t\t15");
        System.out.println("\"Sixers Win!\"");

        System.out.println("yo");

        System.out.println("sup");

        String name = "hi" + 2 + " whatsup" + 'd' + 2.5 + true;
        System.out.println(name);


        System.out.println("hello world" + 1);


        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Output formatting
        // https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf
        // https://www.baeldung.com/java-printstream-printf

        System.out.println("New line");
        System.out.print("\nNew line using escape char");
        System.out.print("\n\nNew line using escape char");



        System.out.printf("%n%n\n\nPrint format: %d and %f and %s", 1, 1.5, "hello");

        double someNum = 5.989999;
        System.out.println();
        System.out.println("Your total is $: " + someNum);
        System.out.printf("%nYour total is $: %.2f", someNum);
}
}
