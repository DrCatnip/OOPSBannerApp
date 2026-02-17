/**
 * OOPS Banner App
 * UC4: Render OOPS as Banner using Arrays and Loops
 * Goal: Improve modularity by storing banner lines in a String array
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[7];

        banner[0] = "  *****     *****    *******    ****** ";
        banner[1] = " *     *   *     *   *      *  *      *";
        banner[2] = " *     *   *     *   *      *  *       ";
        banner[3] = " *     *   *     *   *******    ******  ";
        banner[4] = " *     *   *     *   *          *      *";
        banner[5] = " *     *   *     *   *          *      *";
        banner[6] = "  *****     *****    *           ****** ";

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
