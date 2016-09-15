import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karel on 07.09.2016.
 */
public class Project {
    public Integer id;
    public List<Task> seznamTasku = new ArrayList<>();
    public static Integer taskCounter;

    public void vytvoritTask() {

            Task task= new Task();

            seznamTasku.add(task);

            task.id = this.taskCounter;

    }

    public void vypisTasky() {
        for(Task task : seznamTasku) {
            System.out.println("task: " + task.id);
        }
    }

}
