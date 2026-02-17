/**
 * OOPS Banner App
 * UC3: Render OOPS as Banner using String.join()
 * Goal: Improve memory efficiency by replacing + operator
 * @author DrCatnip
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
    }
}
