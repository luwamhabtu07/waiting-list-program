import java.util.*;

public class WaitingListManager {
    private Queue<String> waitingQueue;
    private Set<String> waitingSet;

    public WaitingListManager() {
        waitingQueue = new LinkedList<>();
        waitingSet = new HashSet<>();
    }

    // Add a person to the waiting list
    public void addPerson(String name) {
        if (waitingSet.contains(name)) {
            System.out.println(name + " is already in the waiting list.");
        } else {
            waitingQueue.add(name);
            waitingSet.add(name);
            System.out.println(name + " has been added to the waiting list.");
        }
    }

    // Serve the next person in line
    public String servePerson() {
        if (waitingQueue.isEmpty()) {
            return "Waiting list is empty.";
        } else {
            String servedPerson = waitingQueue.poll();
            waitingSet.remove(servedPerson);
            return servedPerson + " has been served.";
        }
    }

    // Check if a person is in the waiting list
    public boolean isPersonInList(String name) {
        return waitingSet.contains(name);
    }

    // Get the number of people in the waiting list
    public int waitingListSize() {
        return waitingQueue.size();
    }

    // Display the names in the waiting list
    public void displayWaitingList() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Waiting list is empty.");
        } else {
            System.out.println("Current Waiting List: " + waitingQueue);
        }
    }
}
