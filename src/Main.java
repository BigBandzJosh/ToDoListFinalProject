import functions.*;
import java.util.ArrayList;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
        ArrayList<String> Status = new ArrayList<>();
        ArrayList<String> TaskTitle = new ArrayList<>();
        ArrayList<String> Description = new ArrayList<>();
        ArrayList<String> DueDate = new ArrayList<>();

        boolean flag = Boolean.TRUE;
        while (flag) {

            System.out.println("------------------------------- ");
            System.out.println("Exit program - Press 9: ");
            System.out.println("Add a task -Press 1: ");
            System.out.println("Remove a task -Press 2: ");
            System.out.println("Show all your tasks -Press 3:");
            System.out.println("Edit your task- Press 4: ");
            System.out.println("Mark a task done- Press 5: ");
            System.out.println("-------------------------------");
            Scanner input = new Scanner(System.in);
            int Choice = input.nextInt();
            switch (Choice) {
                case 1 -> AddTask.AddingTask(TaskTitle,Description,DueDate,Status);
                case 2 -> RemoveTask.RemovingTask(TaskTitle,Description,DueDate,Status);
                case 3 -> ShowAllTasks.ShowTasks(TaskTitle,Description,DueDate,Status);
                case 4 -> EditTask.EditingTask(TaskTitle,Description,DueDate,Status);
                case 5 -> MarkAsDone.taskComplete(Status);
                case 9 -> flag = Boolean.FALSE;


            }
        }


    }
}