public class Clock {
    private BoundedCounter hours = new BoundedCounter(23);
    private BoundedCounter minutes = new BoundedCounter(59);
    private BoundedCounter seconds = new BoundedCounter(59);
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
        
    }
    
    public void tick() {
        int i = 0;
        // Clock advances by one second
        this.seconds.next();
        i++;
        if(seconds.getValue() == 00 && i != 0 ){
                minutes.next();
            }
            if(minutes.getValue() == 00 && seconds.getValue() == 00 && i != 0){
                hours.next();
            }
        
    }
    
    public String toString() {
        // returns the string representation
        return this.hours.toString() + ":" + this.minutes.toString() + ":" + this.seconds.toString();
    }
}
