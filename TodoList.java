import java.util.ArrayList;

interface todoWorking{
    void addTask(String TaskName);
    void removeTask(int r);
    void markCompleted(int r);
    void showTasks();
}

class TodoList implements todoWorking{
    String name;
    ArrayList<Task> tasks;


    public TodoList(String name) {
        this.name = name;
        this.tasks = new ArrayList<Task>();
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void addTask(String TaskName){
        tasks.add(new Task(TaskName));
    }
    @Override
    public void removeTask(int r){
        if(r>=0 && r<tasks.size()){
            tasks.remove(r);
        }
        else {
            Main.gap();
            System.out.println("Wrong Input!");
        }
    }
    @Override
    public void markCompleted(int r){
        if(r>=0 && r<tasks.size()){
            tasks.get(r).markCompleted();
        }
        else {
            Main.gap();
            System.out.println("Wrong Input!");
        }
    }
    @Override
    public void showTasks(){
        if(tasks.isEmpty()){
            System.out.println("No Tasks!");
        }
        else{
            for(int i=0;i<tasks.size();i++){
                System.out.println((i+1)+". "+tasks.get(i).getName());
            }
        }
    }
}