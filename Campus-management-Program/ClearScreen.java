public class ClearScreen {
    // ANSI escape code to clear screen and move cursor to top-left corner
    public static final String ANSI_CLEAR_SCREEN = "\u001B[2J\u001B[H";

    public static void main(String[] args) {
        // Print some content
        System.out.println("This is some content on the screen.");

        // Clear the screen and move cursor to top-left corner
        clearScreen();

        // Print something after clearing
        System.out.println("The screen has been cleared and text is displayed from the top.");
    }

    // Method to clear the screen and move cursor to top-left corner
    public static void clearScreen() {
        System.out.print(ANSI_CLEAR_SCREEN);
        System.out.flush();
    }
}
