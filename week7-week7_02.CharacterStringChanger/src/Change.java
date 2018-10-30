public class Change {
    private char fromChar;
    private char toChar;

    public Change(char fromCharacter, char toCharacter) {
        this.fromChar = fromCharacter;
        this.toChar = toCharacter;
    }

    public String change(String characterString) {
        String newString = "";

        for ( int i=0; i < characterString.length(); i++) {
            char character = characterString.charAt(i);

            if ( character == fromChar ) {
                newString += toChar;
            }  else {
                newString += character;
            }
        }

        return newString;
    }
}
