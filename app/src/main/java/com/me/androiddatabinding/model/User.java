package com.me.androiddatabinding.model;

/**
 * Created by tao.liu on 2017/7/27.
 */

public class User {

        private String firstName;

        private String lastName;

        private String displayName;

        private int age;

        public User(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
        }

        public User(String firstName, String lastName, int age) {
                this(firstName, lastName);
                this.age = age;
        }

        public String getFirstName() {
                return firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public String getDisplayName() {
                return null;
        }

        public int getAge() {
                return age;
        }

        public boolean isAdult() {
                return age >= 18;
        }
}
