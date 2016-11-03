package com.practice.effectivejava.item4;

public class NonInstantiableUtilHelper {

    public static final String CONSTANT_1 = "constant 1";

    public static void someHelperMethod(Object... randomArgs){

    }

    /**
     * In Util or Helper classes which have only static fields and methods, they should always
     * have private constructors to enforce <b>Noninstantiability</b>.
     */
    private NonInstantiableUtilHelper() {
        throw new AssertionError();
    }
}
