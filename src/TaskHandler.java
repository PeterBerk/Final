/**
 * Created by peter on 21/01/15.
 */
public class TaskHandler {
    // Task Handler class for the Task App
    // Takes care of all the nitty-gritty when working
    // directly with arrays. This includes adding,
    // removing, and getting tasks.

    // Declare task list and virtual size
    Task list[];
    int virtSize;

    public TaskHandler(int size){
        // Set array to how big the parent class wants
        this.list = new Task[size];
        // Virtual size starts off at 0; empty.
        this.virtSize = 0;
    }

    public void add(Task t, int pos, boolean replace) {
        // Add method
        // The "replace" boolean is for whether you want to replace
        // the current task, or insert it in the list.
        if (replace) {
            // If we're not replacing (variable name is inverted, yes)
            // call the reOrder() command to move everything at "pos" up one slot.
            reOrder(pos, true);
        }
        // Then replace [pos] with new task
        this.list[pos] = t;
    }
    public void remove(int pos){
        // Remove command
        // Just calls reOrder() at position to overwrite
        // task with everything ahead of it. In order, or course.
        reOrder(pos, false);
    }

    private void reOrder(int pos, boolean add){
        // Re-order command
        // Used to move parts of a list up or down.

        // If we're adding to the list...
        if (add){
            // Increase the virtual size of the array
            this.virtSize++;
            // From the top-down to the specified position,
            for (int x=this.virtSize; x >=pos; x--){
                // Copy each item over
                this.list[x+1] = this.list[x];
            }
        }
        // If we're removing from the list...
        else {
            // Decrease virtual size
            this.virtSize--;
            // And from the specified position to the top,
            for (int x = pos; x < this.virtSize; x++) {
                // Copy each item down.
                this.list[x] = this.list[x + 1];
            }
        }
    }
    public Task getTask(int pos){
        // Public method to retrieve task at position
        return this.list[pos];
    }

    public int getVirtSize(){
        // Public method to get virtual size
        return this.virtSize;
    }
}
