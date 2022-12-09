package functions;

import java.util.ArrayList;
import java.util.Scanner;

public class MarkAsDone {
    public static void taskComplete(ArrayList<String> Status) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which task would you like to mark as done?");
        int TaskNumber = input.nextInt();
            Status.set(TaskNumber, "Done!");
            System.out.println("Your task has been marked as done!");
    }
}
