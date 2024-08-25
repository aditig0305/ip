public class Event extends Task {
    protected String startTime;
    protected String endTime;

    public Event(String description, String time) throws MaxException {
        super(description);
        String[] temp = time.split(" /to ");
        if (temp.length != 2) {
            throw new MaxException("Oh no!! The description of the task cannot be empty. :(");
        }
        this.startTime = temp[0];
        this.endTime = temp[1];
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (from: " + startTime + " to: " + endTime + ")";
    }

    @Override
    public String toFileFormat() {
        return String.format("E | %d | %s | %s", isDone ? 1 : 0, description, "/from" + startTime + "/to" + endTime);
    }

}
