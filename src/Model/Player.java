package Model;

public class Player {
    private String name;
    private int executionTime;

    public Player(String name) {
        this.name = name;
        this.executionTime = 0;
    }

    public Player(String name, int executionTime) {
        this.name = name;
        this.executionTime = executionTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", executionTime=" + executionTime +
                '}';
    }
}
