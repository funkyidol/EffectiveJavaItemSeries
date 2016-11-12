package com.practice.effectivejava.item10;

public class OverrideToString {

    static class Employee {
        private String name;
        private int age;
        private float salary;

        public Employee() {
        }

        public Employee(String name, int age, float salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        /**
         * Method to return all the interesting information of the Pojo object in a string format.
         * Mind the output is in a format which can be parsed in order to create an object out of
         * it.
         *
         * @return
         */
        @Override
        public String toString() {
            return "{" + "name='" + name + '\'' + ",age=" + age + ",salary=" + salary + '}';
        }

        /**
         * Method that parses and returns the object from its string representation.
         *
         * @param str
         * @return
         */
        public Employee valueOf(String str) {
            Employee employee = new Employee();
            String[] split = str.split(",");

            String name = split[0].substring(7, split[0].length() - 1);
            String age = split[1].substring(4);
            String salary = split[2].substring(7, split[2].length() - 1);

            employee.name = name;
            employee.age = Integer.parseInt(age);
            employee.salary = Float.parseFloat(salary);
            return employee;
        }

        /**
         * Create getter methods to provide access to the object fields rather then asking the
         * consumer of your API to parse the string returned from toString()
         */
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public float getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Kshitij", 30, 50000.50f);
        employee.valueOf(employee.toString());
    }
}
