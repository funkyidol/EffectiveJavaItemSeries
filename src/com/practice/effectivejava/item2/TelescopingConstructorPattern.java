package com.practice.effectivejava.item2;

public class TelescopingConstructorPattern {

    private int xlong = 0;
    private int ylat = 0;
    private int ylong = 0;
    private int xlat = 0;

    public TelescopingConstructorPattern(int xlat, int xlong) {
        new TelescopingConstructorPattern(xlat, xlong, 0);
    }

    public TelescopingConstructorPattern(int xlat, int xlong, int ylat) {
        new TelescopingConstructorPattern(xlat, xlong, ylat, 0);
    }

    public TelescopingConstructorPattern(int xlat, int xlong, int ylat, int ylong) {
        this.xlat = xlat;
        this.xlong = xlong;
        this.ylat = ylat;
        this.ylong = ylong;
    }

    public static void main(String[] args) {
        /**
         * Without proper documentation it is hard to understand what each constructor is
         * supposed to
         * do.
         * Even with documentation it is confusing and prone to errors what each value represents.
         */
        TelescopingConstructorPattern telescopingConstructorPattern =
                new TelescopingConstructorPattern(-20, 30, 0, 5);
    }
}
