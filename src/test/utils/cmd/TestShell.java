package test.utils.cmd;

import utils.cmd.ShellExecution;

/**
 * Created by macaque on 04.09.2016.
 */
public class TestShell {
    public static void main(String[] args) {


        String domainName = "google.com";

        //in mac oxs
        //String command = "ping -c 3 " + domainName;

        //in windows
        String command = "ping -n 3 " + domainName;

        String output = ShellExecution.executeCommand(command);

        System.out.println(output);

    }

}
