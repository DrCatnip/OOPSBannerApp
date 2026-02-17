/**
 * OOPS Banner App
 * UC3: Render OOPS as Banner using String.join()
 * Goal: Improve memory efficiency by replacing + operator
 * @author DrCatnip
 * UC2: Render OOPS as Banner using Print Statements
 * Goal: Display "OOPS" in a large banner made from spaces and '*'
 * @author Technical Team
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Line 1
        System.out.println(String.join(" ",
                " *****  ",
                " *****  ",
                " ****** ",
                "  ***** "
        ));

        // Line 2
        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * "
        ));

        // Line 3
        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*       "
        ));

        // Line 4
        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                " ****** ",
                "  ***** "
        ));

        // Line 5
        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*       ",
                "       *"
        ));

        // Line 6
        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*       ",
                "*     * "
        ));

        // Line 7
        System.out.println(String.join(" ",
                " *****  ",
                " *****  ",
                "*       ",
                "  ***** "
        ));
        System.out.println("  *****      *****      ******      *****  ");
        System.out.println(" *     *    *     *    *      *    *     * ");
        System.out.println(" *     *    *     *    *      *    *       ");
        System.out.println(" *     *    *     *    ******      *****   ");
        System.out.println(" *     *    *     *    *                *  ");
        System.out.println(" *     *    *     *    *                *  ");
        System.out.println("  *****      *****      *          *****   ");
    }
}
 * UC1: Print OOPS to Console
 * * Goal: Display the literal text "OOPS" (Object-Oriented Programming System) 
 * once on the console.
 * * @author Technical Team
 * @version 1.0
 */
public class OOPSBannerApp {

    /**
     * Main method - Entry point of the application.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // UC1: Simple print statement using String Literal
        System.out.println("OOPS");
    }
}
