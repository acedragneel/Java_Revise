package patterns.behavioralpattern.iterator;

public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
