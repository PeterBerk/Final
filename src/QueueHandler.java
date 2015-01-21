/**
 * Created by peter on 20/01/15.
 */
public class QueueHandler {
    // QueueHandler class for the ER Scheduler
    // Accepts "Patients" and determines
    // which patient should be treated next

    // Declare out patient list
    Patient[] list;
    // Speeds things up by keeping track of what the highest priority is
    int highestPrio;
    // Virtual size of array
    int virtSize;

    public QueueHandler(int size){
        // Initialize list, virtual size, and highest priority
        this.list = new Patient[size];
        // Highest priority is assumed lowest; "2", or "Fair"
        this.highestPrio = 2;
        this.virtSize = 0;

    }
    public void add(Patient p) {
        // Add method for adding a new patient
        // If this patient is in worse condition than what we're aware of,
        // remember new condition
        if (p.getPriority() < this.highestPrio) this.highestPrio = p.getPriority();
        // Add patient to the end of the list
        this.list[this.virtSize] = p;
        // Increase virtual size in accordance.
        this.virtSize++;

    }
    public Patient remove(){
        // Remove method
        // Takes into account priorities
        // Initialize temporary Patient to satisfy compiler
        Patient temp = new Patient("No one", 2);
        // Go through the array...
        for (int x=0;x<this.virtSize;x++){
            // If we encounter someone with the most severe condition
            // we're aware of...
            if (this.list[x].getPriority()==this.highestPrio){
                // Set the temporary patient to them
                temp = this.list[x];
                // and remove them from the list with reOrder()
                reOrder(x);
                // Break, we found the next appropriate patient
                break;
            }
        }
        // Go through patients and see if there's anyone else with same condition
        // or less severe.
        checkPrio();
        // Send patient home!
        return temp;
    }

    public int getVirtSize(){
        // Getter for virtual size of array.
        return this.virtSize;
    }

    private void reOrder(int pos){
        // reOrder for removing patients from the array.
        // Not nearly as complicated as reOrder in the TaskHandler,
        // as we're only removing patients.

        // Decrement virtual size
        this.virtSize--;
        // Go through from where the patient was to the end
        for (int x=pos;x<this.virtSize;x++){
            // and copy each person ahead 1 spot.
            // This also overwrites the patient specified
            // essentially "removing" them.
            this.list[x] = this.list[x + 1];
        }
    }

    private void checkPrio(){
        // Checks for most severe condition in the list of people
        // Assume the lowest severity at first.
        int highest = 2;
        // Go through the list of people...
        for (int x=0;x<this.virtSize;x++){
            // Get the patient's condition priority
            int best = this.list[x].getPriority();
            // If there's is more severe than what's set...
            if (best < highest) {
                // set the new standard
                highest = this.list[x].getPriority();
            }
        }
        // Confirm the new most severe condition
        this.highestPrio = highest;
    }

}
