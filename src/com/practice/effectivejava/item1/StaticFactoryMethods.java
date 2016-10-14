package com.practice.effectivejava.item1;

public class StaticFactoryMethods {
    private static StaticFactoryMethods instance;

    /**
     * This is the standard way to create objects
     */
    public StaticFactoryMethods() {
    }

    /**
     * This constructor will create an object based on x
     *
     * @param x
     */
    public StaticFactoryMethods(int x) {

    }

    /**
     * This constructor will create an object based on x & y
     *
     * @param x
     * @param y
     */
    public StaticFactoryMethods(int x, int y) {

    }

    /**
     * This static method has a more descriptive name compared to a default constructor
     * <p>
     * Also it allows you to have control on whether an object is created or not. e.g. Singleton
     * <p>
     * But the only <b>disadvantage</b> having classes without public/protected constructors is that
     * they cannot be subclassed
     */
    public static StaticFactoryMethods getSingeltonInstance() {
        if (instance == null) {
            instance = new StaticFactoryMethods();
        }
        return instance;
    }

    /**
     * In the above two parametrized constructors, it is easy to confuse between the two and
     * call the wrong constructor
     * Static Factory Methods make it very clear which method will return what type of instance
     *
     * @param x
     * @return
     */
    public static StaticFactoryMethods getXInstance(int x) {
        return new StaticFactoryMethods(x);
    }

    /**
     * @param x
     * @param y
     * @return
     */
    public static StaticFactoryMethods getXYInstance(int x, int y) {
        return new StaticFactoryMethods(x, y);
    }

}
