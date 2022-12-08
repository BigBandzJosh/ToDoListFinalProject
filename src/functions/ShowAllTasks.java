package functions;

import java.util.ArrayList;



public class ShowAllTasks {

    public static void ShowTasks(ArrayList<String> Status,ArrayList<String> Title,ArrayList<String> Description, ArrayList<String> DueDate) {
        try {
            System.out.println("Printing all tasks: ");
            int spaceBetween = 5;
            String space = String.format("%" + spaceBetween + "s", " ");
            System.out.println("|"+"TaskTitle" +"|"+ space + "|"+"Description" +"|"+ space + "|"+"DueDate" +"|"+ space + "|"+"Status"+"|");

            int printTask = Status.size();
            for (int i = 0; i < printTask; i++) {
                String s = "|"+Title.get(i) +"|"+ space + "|"+Description.get(i) + "|"+space +"|"+ DueDate.get(i) +"|"+ space + "|"+Status.get(i)+"|";
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println("There are no tasks to show!");
        }



    }



}
