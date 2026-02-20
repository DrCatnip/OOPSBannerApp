/**
 * OOPS Banner App
 * UC5: Render OOPS as Banner using Inline Array Initialization
 * Goal: Combine array declaration and initialization using String.join()
 * @author Technical Team
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline declaration + initialization
        String[] banner = {

            String.join(" ",
                    " *****  ",
                    " *****  ",
                    " ****** ",
                    "  ***** "
            ),

            String.join(" ",
                    "*     * ",
                    "*     * ",
                    "*     * ",
                    "*     * "
            ),

            String.join(" ",
                    "*     * ",
                    "*     * ",
                    "*     * ",
                    "*       "
            ),

            String.join(" ",
                    "*     * ",
                    "*     * ",
                    " ****** ",
                    "  ***** "
            ),

            String.join(" ",
                    "*     * ",
                    "*     * ",
                    "*       ",
                    "       *"
            ),

            String.join(" ",
                    "*     * ",
                    "*     * ",
                    "*       ",
                    "*     * "
            ),

            String.join(" ",
                    " *****  ",
                    " *****  ",
                    "*       ",
                    "  ***** "
            )
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}