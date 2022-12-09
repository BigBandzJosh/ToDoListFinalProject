package functions;

import java.util.ArrayList;



public class ShowAllTasks {

    public static void ShowTasks(ArrayList<String> TaskTitle,ArrayList<String> Description,ArrayList<String> DueDate, ArrayList<String> Status) {

        try {
            System.out.println("Printing all tasks: ");
            int spaceBetween = 5;
            String space = String.format("%" + spaceBetween + "s", " ");
            System.out.println("|"+"Task number: n"+"|"+ space +"|"+"TaskTitle" +"|"+ space + "|"+"Description" +"|"+ space + "|"+"DueDate" +"|"+ space + "|"+"Status"+"|");

            for (int i = 0; i < Status.size(); i++) {
                String header = "|"+"Task number:"+ (i+1) +"|"+space+"|"+TaskTitle.get(i) +"|"+ space + "|"+Description.get(i) + "|"+space +"|"+ DueDate.get(i) +"|"+ space + "|"+Status.get(i)+"|";
                System.out.println(header);
            }
        } catch (Exception e) {
            System.out.println("There are no tasks to show!");
        }
    }
}
