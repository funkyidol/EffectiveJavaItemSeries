package com.practice.effectivejava.item12;

public class ImplementingComparable {

    /**
     * Implementing comparable indicates that the instances of this class have a natural ordering
     * and can be incorporated with all the generic algorithms and collection implementations
     * that depend on this interface like TreeSet & TreeMap.
     * For e.g. objects can be easily sorted using helper methods like Arrays.sort(a);
     */
    class PhoneNumber implements Comparable<PhoneNumber> {
        int countryCode;
        int stdCode;
        int number;

        /**
         * Classes with multiple significent fields, the order in which you compare them is
         * critical. Fields must be compared in the descending order of there significance in
         * there ordering scheme.
         * @param o
         * @return
         */
        @Override
        public int compareTo(PhoneNumber o) {
            if (countryCode < o.countryCode) return -1;
            if (countryCode > o.countryCode) return 1;
            if (stdCode < o.stdCode) return -1;
            if (stdCode > o.stdCode) return 1;
            if (number < o.number) return -1;
            if (number > o.number) return 1;
            return 0;
        }
    }
}
