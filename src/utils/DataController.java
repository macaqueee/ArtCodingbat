package utils;


import java.io.*;

/**
 * Created by macaque on 03.09.2016.
 */
public class DataController {


    public static boolean writeToFile() {
        return false;
    }


    public static boolean readFromFile() {
        return false;
    }


    public static boolean makeFilesCopy(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
        return true;
    }
}