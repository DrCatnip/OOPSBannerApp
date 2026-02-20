/**
 * OOPS Banner App
 * UC1 → UC5 Combined Version
 * @author Technical Team
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // =========================
        // UC1: Simple Print
        // =========================
        System.out.println("UC1 Output:");
        System.out.println("OOPS");
        System.out.println();

        // =========================
        // UC2: Print Statements
        // =========================
        System.out.println("UC2 Output:");
        System.out.println("  *****      *****      ******      *****  ");
        System.out.println(" *     *    *     *    *      *    *     * ");
        System.out.println(" *     *    *     *    *      *    *       ");
        System.out.println(" *     *    *     *    ******      *****   ");
        System.out.println(" *     *    *     *    *                *  ");
        System.out.println(" *     *    *     *    *                *  ");
        System.out.println("  *****      *****      *          *****   ");
        System.out.println();

        // =========================
        // UC3: Using String.join()
        // =========================
        System.out.println("UC3 Output:");

        System.out.println(String.join(" ",
                " *****  ",
                " *****  ",
                " ****** ",
                "  ***** "
        ));
        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * "
        ));
        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*       "
        ));
        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                " ****** ",
                "  ***** "
        ));
        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*       ",
                "       *"
        ));
        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*       ",
                "*     * "
        ));
        System.out.println(String.join(" ",
                " *****  ",
                " *****  ",
                "*       ",
                "  ***** "
        ));
        System.out.println();

        // =========================
        // UC4: Using Array + Loop
        // =========================
        System.out.println("UC4 Output:");

        String[] bannerUC4 = new String[7];

        bannerUC4[0] = " *****    *****    ******    ***** ";
        bannerUC4[1] = "*     *  *     *  *     *  *     *";
        bannerUC4[2] = "*     *  *     *  *     *  *";
        bannerUC4[3] = "*     *  *     *   ******    ***** ";
        bannerUC4[4] = "*     *  *     *  *               *";
        bannerUC4[5] = "*     *  *     *  *         *     *";
        bannerUC4[6] = " *****    *****   *          ***** ";

        for (String line : bannerUC4) {
            System.out.println(line);
        }

        System.out.println();

        // =========================
        // UC5: Inline Array Initialization
        // =========================
        System.out.println("UC5 Output:");

        String[] bannerUC5 = {

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

        for (String line : bannerUC5) {
            System.out.println(line);
        }
    }
}