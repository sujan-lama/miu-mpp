package prob1;

import java.util.ArrayList;
import java.util.List;

public class Group<T> {
    private final T specialElements;
    private final List<T> elements;


    public Group(T specialElements, List<T> elements) {
        this.specialElements = specialElements;
        this.elements = elements;
    }

    public T getSpecialElements() {
        return specialElements;
    }

    public List<T> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return "[special : " + specialElements.toString()
                + ", elements :\n   " + elements.toString() + "]";
    }
}
