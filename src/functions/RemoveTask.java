package functions;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveTask {
    public static void RemovingTask(ArrayList<String> TaskTitle,ArrayList<String> Description,ArrayList<String> DueDate, ArrayList<String> Status) { // This method is used to remove a task from the list
        Scanner input = new Scanner(System.in);
        System.out.println("Which task would you like to remove?");
        int TaskNumber = input.nextInt();
            TaskTitle.remove(TaskNumber);
            Description.remove(TaskNumber);
            DueDate.remove(TaskNumber);
            Status.remove(TaskNumber);
            System.out.println("Your task has been removed!");
    }
}
