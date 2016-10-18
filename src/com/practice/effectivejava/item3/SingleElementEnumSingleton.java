package com.practice.effectivejava.item3;

public class SingleElementEnumSingleton {
    /**
     * This approach is functionally equivalent to the public field approach. This approach
     * allows for easy and effective against serialization, reflection and multi-threading issues.
     *
     *
     * More explanation on how it works can be found here
     * http://stackoverflow.com/a/26285591/237403
     */
    enum SingleElementEnum {
        INSTANCE;

        public void taskMethod() {
            System.out.println("This is a new type of Singleton");
        }
    }

    public static void main(String[] args) {
        SingleElementEnum singleElementEnum = SingleElementEnum.INSTANCE;
        singleElementEnum.taskMethod();
    }
}
