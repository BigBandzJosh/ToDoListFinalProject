package functions;

import java.util.ArrayList;
import java.util.Scanner;

public class MarkAsDone {
    public static void taskComplete(ArrayList<String> Status) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Which task would you like to mark as done?");
            int TaskNumber = input.nextInt();
            Status.set(TaskNumber, "Done!");
            System.out.println("Your task has been marked as done!");
        } catch (Exception e) {
            System.out.println("There are no tasks to mark as done!");
        }

    }
}
