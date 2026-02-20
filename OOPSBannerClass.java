/**
 * OOPS Banner App
 * UC7: Store Character Pattern in a Class
 * Goal: Encapsulate character and pattern using Inner Static Class
 * 
 * @author Technical Team
 * @version 1.0
 */

public class OOPSBannerApp {

    /**
     * Inner Static Class to encapsulate Character and its Pattern
     */
    public static class CharacterPatternMap {

        // Instance Variables
        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         * 
         * @param character The character to be stored
         * @param pattern   7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * 
         * @return stored character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * 
         * @return 7-line pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility Method to retrieve pattern for a character
     * 
     * @param character character to search
     * @param patterns  array of CharacterPatternMap
     * @return String[] pattern
     */
    public static String[] getCharacterPattern(char character,
                                              CharacterPatternMap[] patterns) {

        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == character) {
                return cp.getPattern();
            }
        }
        return new String[7]; // fallback
    }

    public static void main(String[] args) {

        // Create Character Pattern Objects
        CharacterPatternMap oPattern = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap pPattern = new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap sPattern = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        // Array of objects
        CharacterPatternMap[] patternArray = {oPattern, pPattern, sPattern};

        String word = "OOPS";

        // Loop row-wise (7 rows)
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                String[] charPattern =
                        getCharacterPattern(currentChar, patternArray);

                lineBuilder.append(charPattern[row]).append(" ");
            }

            System.out.println(lineBuilder);
        }
    }
}