/**
 * Created by peter on 20/01/15.
 */
public class Patient {
    String name;
    int priority;
    public Patient(String name, int prio){
        this.name = name;
        this.priority = prio;
    }
    public String getName(){
        return this.name;
    }
    public int getPriority(){
        return this.priority;
    }
}