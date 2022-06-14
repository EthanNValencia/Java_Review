import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class SpamBot {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        System.out.println("Spam bot is starting in 5 seconds...");
        Thread.sleep(5000);

        int i = 0;
        while(i < 10) {
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            i++;
        }
    }
}
