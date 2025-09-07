import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running=true;
        Scanner sc = new Scanner(System.in);
        TodoManage todoLists = new TodoManage();
        while (running) {
            gap();

            System.out.println("---------Todo-List------------------");
            System.out.println("1. Create Todo List");
            System.out.println("2. Use Todo List");
            System.out.println("3. Remove Todo List");
            System.out.println("4. Quit");
            System.out.print("Enter choice: ");
            int n = sc.nextInt();

            gap();

            int i;
            boolean usingList;

            switch (n) {
                case 1:
                    System.out.println("Enter name of Todo List:- ");
                    String todo_list_name = sc.next();
                    todoLists.addTodoList(todo_list_name);
                    i = todoLists.all_lists.size()-1;

                    usingList = true;
                    while (usingList) {
                        gap();

                        TodoList selected = todoLists.getTodolist(i);

                        System.out.println("\n--- Using Todo List: " + selected.getName() + " ---");
                        System.out.println("1. Add task");
                        System.out.println("2. Remove task");
                        System.out.println("3. Mark task as completed");
                        System.out.println("4. Quit");
                        System.out.print("Enter choice: ");
                        int c = sc.nextInt();

                        gap();

                        switch (c) {
                            case 1:
                                System.out.print("Enter task name: ");
                                String taskName = sc.next();
                                selected.addTask(taskName);
                                break;

                            case 2:
                                if(selected.tasks.isEmpty()){
                                    System.out.println("No Task found");
                                }
                                else {
                                    selected.showTasks();
                                    System.out.print("Enter task number to remove: ");
                                    int r = sc.nextInt() - 1;
                                    selected.removeTask(r);
                                }
                                break;

                            case 3:
                                if(selected.tasks.isEmpty()){
                                    System.out.println("No Task found");
                                }
                                else {
                                    selected.showTasks();
                                    System.out.print("Enter task number to mark completed: ");
                                    int m = sc.nextInt() - 1;
                                    selected.markCompleted(m);
                                }
                                break;

                            case 4:
                                usingList = false;
                                break;
                            default:
                                System.out.println("Wrong Choice! Plz Retry\n");
                        }
                    }

                    break;

                case 2:
                    if (todoLists.isEmpty()) {
                        gap();
                        System.out.println("List is Empty");
                    } else {
                        todoLists.showAllLists();

                        System.out.print("Choose list number: ");
                        i = sc.nextInt() - 1;

                        usingList = true;
                        while (usingList) {

                            TodoList selected = todoLists.getTodolist(i);

                            gap();
                            if (selected.getName().isEmpty()) {
                                System.out.println("Wrong Choice! Plz Retry\n");
                            }
                            else {
                                System.out.println("--- Using Todo List: " + selected.getName() + " ---");
                                System.out.println("1. Add task");
                                System.out.println("2. Remove task");
                                System.out.println("3. Mark task as completed");
                                System.out.println("4. Quit");
                                System.out.print("Enter choice: ");
                                int c = sc.nextInt();

                                switch (c) {
                                    case 1:
                                        System.out.print("Enter task name: ");
                                        String taskName = sc.next();
                                        selected.addTask(taskName);
                                        break;

                                    case 2:
                                        if (selected.tasks.isEmpty()) {
                                            gap();
                                            System.out.println("No Task found");
                                        } else {
                                            selected.showTasks();
                                            gap();
                                            System.out.print("Enter task number to remove: ");
                                            int r = sc.nextInt() - 1;
                                            selected.removeTask(r);
                                        }
                                        break;

                                    case 3:
                                        if (selected.tasks.isEmpty()) {
                                            gap();
                                            System.out.println("No Task found");
                                        } else {
                                            selected.showTasks();
                                            System.out.print("Enter task number to mark completed: ");
                                            int m = sc.nextInt() - 1;
                                            selected.markCompleted(m);
                                        }
                                        break;

                                    case 4:
                                        usingList = false;
                                        break;
                                    default:
                                        gap();
                                        System.out.println("Wrong Choice! Plz Retry\n");
                                }
                            }
                        }
                    }
                    break;

                case 3:
                    if(todoLists.isEmpty()) {
                        gap();
                        System.out.println("List is Empty");
                    }

                    else {
                        todoLists.showAllLists();
                        System.out.println("Enter number of Todo which you want to remove");
                        int r = sc.nextInt()-1;
                        todoLists.removeTodoList(r);
                    }
                    break;

                case 4:
                    running = false;
                    break;

                default:
                    gap();
                    System.out.println("Wrong Choice! Plz Retry\n");
            }
        }
    }

    public static void gap(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
