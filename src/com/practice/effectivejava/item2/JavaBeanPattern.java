package com.practice.effectivejava.item2;

public class JavaBeanPattern {

    private int xlong = -1000;
    private int ylat = 0;
    private int ylong = 0;
    private int xlat = 0;

    public void setXlong(int xlong) {
        this.xlong = xlong;
    }

    public void setYlat(int ylat) {
        this.ylat = ylat;
    }

    public void setYlong(int ylong) {
        this.ylong = ylong;
    }

    public void setXlat(int xlat) {
        this.xlat = xlat;
    }

    public static void main(String[] args) {
        /**
         * This pattern has the disadvantage that if you miss any of the setter methods, you are
         * creating an object with inconsistent state.
         *
         * Also this pattern is prone to incorrect defaults
         */
        JavaBeanPattern javaBeanPattern = new JavaBeanPattern();
        javaBeanPattern.setXlat(-20);
        javaBeanPattern.setXlong(0);
        javaBeanPattern.setYlat(30);
        javaBeanPattern.setYlong(5);
    }

}
