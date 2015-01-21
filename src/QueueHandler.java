/**
 * Created by peter on 20/01/15.
 */
public class QueueHandler {
    Patient[] list;
    // Speeds things up by keeping track of what the highest priority is
    int highestPrio;
    int virtSize;

    public QueueHandler(int size){
        this.list = new Patient[size];
        this.highestPrio = 2;
        this.virtSize = 0;

    }
    public void add(Patient p) {
        if (p.getPriority() < this.highestPrio) this.highestPrio = p.getPriority();
        this.list[this.virtSize] = p;
        this.virtSize++;

    }
    public Patient remove(){
        Patient temp = new Patient("No one", 2);
        for (int x=0;x<this.virtSize;x++){
            if (this.list[x].getPriority()==this.highestPrio){
                temp = this.list[x];
                reOrder(x);
                break;
            }
        }
        checkPrio();
        return temp;
    }

    public int getVirtSize(){
        return this.virtSize;
    }

    private void reOrder(int pos){
        this.virtSize--;
        for (int x=pos;x<this.virtSize;x++){
            this.list[x] = this.list[x + 1];
        }
    }

    private void checkPrio(){
        int highest = 2;
        for (int x=0;x<this.virtSize;x++){
            int best = this.list[x].getPriority();
            if (best < highest) {
                highest = this.list[x].getPriority();
            }
        }
        this.highestPrio = highest;
    }

}
