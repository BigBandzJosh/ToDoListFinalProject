package functions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class AddTask {

    public static void AddingTask(ArrayList<String> TaskTitle,ArrayList<String> Description,ArrayList<String> DueDate, ArrayList<String> Status) {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println("Enter how many tasks you have: ");
        try {

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
            try {
                date = dateFormatter.parse(TaskDueDate);
                DueDate.add(TaskDueDate);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Enter the status of your task: ");
            Status.add("Not Done Yet!");
            System.out.println("Your task has been added!");
        }
        } catch (Exception e) {
            System.out.println("Something went wrong! Try again!");
        }
        }
}
