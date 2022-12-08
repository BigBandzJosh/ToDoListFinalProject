package functions;

import java.util.ArrayList;
import java.util.Scanner;
public class AddTask {

    public static void AddingTask(ArrayList<String> Status,ArrayList<String> TaskTitle,ArrayList<String> Description, ArrayList<String> DueDate) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many tasks you have: ");
        int TaskNumber = input.nextInt();
        input.nextLine();
        for (int i = 0; i < TaskNumber; i++) {
            System.out.println("Enter the title of your task: ");
            String Task = input.nextLine();
            TaskTitle.add(Task);
            System.out.println("Enter the description of your task: ");
            String TaskDescription = input.nextLine();
            Description.add(TaskDescription);
            System.out.println("Enter the due date of your task: ");
            String TaskDueDate = input.nextLine();
            DueDate.add(TaskDueDate);
            System.out.println("Enter the status of your task: ");
            Status.add("Not Done Yet!");
            System.out.println("Your task has been added!");

        }
    }
}
