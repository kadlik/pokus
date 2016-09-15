/**
 * Created by Karel on 14.09.2016.
 */
public class TaskManagement {

    public static void main(String args[]) {
        Project project = new Project();
        project.taskCounter = 1;

        while (project.taskCounter <= 2) {
            project.vytvoritTask();
            project.taskCounter++;
        }

        project.vypisTasky();
    }

}
