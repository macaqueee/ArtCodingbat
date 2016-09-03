package menu.console;

import controller.TaskController;
import utils.file.FileController;

import java.util.Scanner;
import java.util.SortedMap;

/**
 * Created by macaque on 03.09.2016.
 */
public class Menu {

    private TaskController taskController;
    private static Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        System.out.println("1: show all tasks");
        System.out.println("2: take task");
        System.out.println("3: perform task");
        System.out.println("4: show your progress");
        System.out.println("0: exit");
    }

    public void MenuRun() {
        while (true) {
            showMenu();

            int choice = scanner.nextInt();

            if (choice == 1) {
                taskController.showTasks();
            }
            if (choice == 2) {
                chooseTaskMenu();
            }
            if (choice == 3) {
                performTaskMenu();
            }
            if (choice == 4) {
                showProgressMenu();
            }
            if (choice == 0) {
                break;
            }

        }
    }

    private void showProgressMenu() {
        System.out.println("this part of menu in progress :D");
    }

    private void performTaskMenu() {
        System.out.println("Enter your path of file without filename, please");
        String path = scanner.next();
        System.out.println("Enter your filename, please");
        String filename = scanner.next();

        taskController.performTask(path, filename);
    }

    private void chooseTaskMenu() {
        System.out.println("Pick task, please");
    }
}

