package utils.cmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by macaque on 03.09.2016.
 */
public class ShellExecution {

    public static String executeCommand(String command){
        String error = "";
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            error = readAll(p.getErrorStream());
            p.waitFor();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return error;
    }

    private static String readAll(InputStream is) throws IOException {
        StringBuffer output = new StringBuffer();
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(is));
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }
            return output.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output.toString();
    }
}
