/**
 * Created by peter on 21/01/15.
 */
public class TaskHandler {
    Task[] list;
    int virtSize;

    public TaskHandler(int size){
        this.list = new Task[size];
        this.virtSize = 0;
    }
    public void add(Task t, int pos, boolean replace) {
        if (replace) {
            reOrder(pos, true);
        }
        this.list[this.virtSize] = t;
    }
    public void remove(int pos){
        reOrder(pos, false);
    }
    private void reOrder(int pos, boolean add){
        if (add){
            this.virtSize++;
            for (int x=pos; x < this.virtSize; x++){
                this.list[x+1] = this.list[x];
            }
        }
        else {
            this.virtSize--;
            for (int x = pos; x < this.virtSize; x++) {
                this.list[x] = this.list[x + 1];
            }
        }
    }
    public Task getTask(int pos){
        return this.list[pos];
    }

    public int getVirtSize(){
        return this.virtSize;
    }
}
