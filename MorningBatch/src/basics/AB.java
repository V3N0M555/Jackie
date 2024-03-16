package basics;

import java.io.File;
import java.time.LocalDateTime;

public class AB {
public static void main(String[] args) throws InterruptedException {
String timeStamp = LocalDateTime.now().toString();
String t = timeStamp.replace(":", "-");
File f = new File("./screenshots/img"+t+".png");

}
}
