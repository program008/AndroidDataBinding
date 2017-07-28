package com.me.androiddatabinding.model;

/**
 * Created by tao.liu on 2017/7/28.
 */

public class Contact {
        private String tel;
        private String address;

        public Contact(String tel, String address) {
                this.tel = tel;
                this.address = address;
        }

        public String getTel() {
                return tel;
        }

        public void setTel(String tel) {
                this.tel = tel;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }
}
