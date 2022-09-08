package com.example.docks;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String userName;
    private String password;



    User(String userName, String password) {

        this.userName = userName;
        this.password = password;
    }

    public User() {

    }


    public Long getId() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void setPassword(String role) {
        this.password = role;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;
        User user = (User) o;
        return Objects.equals(this.id, user.id) && Objects.equals(this.userName, user.userName)
                && Objects.equals(this.password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.userName, this.password);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + this.id + ", username='" + this.userName + '\'' + ", password='" + this.password + '\'' + '}';
    }
}