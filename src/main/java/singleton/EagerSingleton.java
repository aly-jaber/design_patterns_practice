package singleton;

public class EagerSingleton {
    /*
    This is a design pattern where an instance of a class is created much before it is actually required.
     Mostly it is done on system startup. In an eager initialization singleton pattern,
     the singleton instance is created irrespective of whether any other class actually asked for its instance or not.
     */

    private static volatile EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance() {
        return instance;
    }

    /*
    The above method works fine, but it has one drawback.
    The instance is created irrespective of it is required in runtime or not.

    If this instance is not a big object and you can live
     with it being unused, this is the best approach.
     */
}
