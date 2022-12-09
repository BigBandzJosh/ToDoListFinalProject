package functions;


import java.util.ArrayList;
import java.util.Scanner;

public class EditTask {


    public static void EditingTask(ArrayList<String> TaskTitle,ArrayList<String> Description,ArrayList<String> DueDate, ArrayList<String> Status) {
        Scanner input = new Scanner(System.in);
        System.out.println("which task would you like to edit?");
        int TaskNumber = input.nextInt();
        input.nextLine();
            System.out.println("Enter the title of your task: ");
            String Task = input.nextLine();
            TaskTitle.set(TaskNumber, Task);
            System.out.println("Enter the description of your task: ");
            String TaskDescription = input.nextLine();
            Description.set(TaskNumber, TaskDescription);
            System.out.println("Enter the due date of your task: ");
            String TaskDueDate = input.nextLine();
            DueDate.set(TaskNumber, TaskDueDate);
            Status.set(TaskNumber, "Not Done Yet!");
            System.out.println("Your task has been edited!");
    }
}
