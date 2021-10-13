import java.net.URLClassLoader;
import java.net.URL;
/**
 * 
 */
public class Prova {
    private static final String CLASS_FOLDER = "C:/Users/nicol/Desktop/FirstApplication/src/myfirstpackage/pets";

    public static void main( String[] args ) throws Exception {
        URL url = new URL(CLASS_FOLDER);
        URLClassLoader l = new URLClassLoader(new URL[] {new URL("file://" + CLASS_FOLDER)}};
    }
}