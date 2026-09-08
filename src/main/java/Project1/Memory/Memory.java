package Project1.Memory;

import Project1.AdvancedOperations.TrigonumetricFunctions.BasicIdentity;
import Project1.BasicOperations.Operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Memory {
    private List<Operation> history;

    public Memory() {
        this.history = new ArrayList<>();
    }

    public List<Operation> getHistory() {
        return history;
    }

    public void removeOperation(Operation operation) {
        for (Operation operation1 : getHistory()) {
            if (operation1.equals(operation)) {
                getHistory().remove(operation);
            }
        }
    }

    @Override

    public String toString() {

        return getHistory().toString();
    }
}

