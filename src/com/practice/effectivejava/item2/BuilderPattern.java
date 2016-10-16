package com.practice.effectivejava.item2;

/**
 * With Builder pattern, we make the object creation verbose and easily readable. Also we can
 * avoid any sort of state inconsistency with proper error checking at before an actual object is
 * created.
 * <p>
 * The only disadvantage of this pattern is writing the build itself and the cost it incur be
 * it minor.
 */
public class BuilderPattern {

    private final int xlat;
    private final int xlong;
    private final int ylat;
    private final int ylong;

    public static class Builder {
        //Required parameters
        private final int xlat;
        private final int xlong;

        //optional patrameters
        private int ylat = 0;
        private int ylong = 0;

        public Builder(int xlat, int xlong) {
            this.xlat = xlat;
            this.xlong = xlong;
        }

        /**
         * V1
         * Where each optional value has its own method. Though we can check and verify in the
         * build() method if all the values are present and valid but it would still be only
         * called at the call of build method
         */
        public Builder ylat(int val) {
            this.ylat = val;
            return this;
        }

        public Builder ylong(int val) {
            this.ylong = val;
            return this;
        }

        /**
         * V2
         * This method groups related parameters together to check and verify them together so
         * that argument checking can be done even before build method is called
         */
        public Builder yCoord(int lat, int ilong) {
            if (lat < -1000 || ilong < -1000 && lat > ilong) {
                throw new IllegalArgumentException("Invalid argument");
            } else {
                this.ylat = lat;
                this.ylong = ilong;
            }
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }

    private BuilderPattern(Builder builder) {
        xlat = builder.xlat;
        xlong = builder.xlong;
        if (builder.ylat > -1000) {
            ylat = builder.ylat;
        } else {
            throw new IllegalStateException("Invalid parameter");
        }
        if (builder.ylong > -1000) {
            ylong = builder.ylong;
        } else {
            throw new IllegalStateException("Invalid parameter");
        }
        if (builder.ylat < builder.ylong) {
            throw new IllegalStateException("Lat should be bigger then long");
        }

    }

    public static void main(String[] args) {
        BuilderPattern builderPattern =
                new BuilderPattern.Builder(-20, 0).ylat(30).ylong(5).build();

        BuilderPattern builderPattern1 = new BuilderPattern.Builder(-20, 0).yCoord(-30, 5).build();
    }
}
