
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String input) {
        int i = input.length();
        if (i % 2 == 1) {
            input += " ";
            i++;
        }
        printSmileyRow(i);
        System.out.println(":) " + input + " :)");
        printSmileyRow(i);
    }

    private static void printSmileyRow(int i) {
        for (int j=0; j < ((i / 2) +3); j++) {
            System.out.print(":)");
        }
        System.out.println();
    }

}
