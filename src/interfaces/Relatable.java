package interfaces;

/**
 * Created by Bext on 04/01/2017.
 */
public interface Relatable {
    // this (object calling isLargerThan)
    // and other must be instances of
    // the same class returns 1, 0, -1
    // if this is greater than,
    // equal to, or less than other
    public int isLargerThan(Relatable other);
}
