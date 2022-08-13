package com.bakeryExodos.ExodosBakery.DTO;

import lombok.Data;

@Data
public class UserDTO {

    String name;
    String lastName;
    int phone;
    String address;

    public UserDTO(String name, String lastName, int phone, String address) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
