class Task{
    String name;
    boolean isCompleted;

    public Task(String name) {
        this.name = "[ ] "+name;
        this.isCompleted = false;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markCompleted() {
        this.isCompleted = true;
        this.name = this.name.replace("[ ] ","[✔] ");
    }
}