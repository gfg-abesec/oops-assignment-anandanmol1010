import java.util.ArrayList;

class TodoManage{
    ArrayList<TodoList> all_lists;

    public TodoManage() {
        this.all_lists = new ArrayList<TodoList>();;
    }

    public boolean isEmpty(){
        return all_lists.isEmpty();
    }

    public void showAllLists(){
        for(int i=0;i<all_lists.size();i++){
            System.out.println((i+1)+". "+all_lists.get(i).getName());
        }
    }

    public void removeTodoList(int r) {
        if(r>=0 && r<all_lists.size()){
            all_lists.remove(r);
        }
        else {
            Main.gap();
            System.out.println("Wrong Input!");
        }
    }

    public void addTodoList(String todoListName) {
        all_lists.add(new TodoList(todoListName));
    }

    public TodoList getTodolist(int r){
        if(r>=0 && r<all_lists.size()){
            return all_lists.get(r);
        }
        else {
            return null;
        }
    }
}