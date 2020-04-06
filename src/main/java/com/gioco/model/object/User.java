package com.gioco.model.object;

public abstract class User {
    private static int it = 1;
    private int id;
    private String nickname;
    private String password;
    private String firstName;
    private String secondName;
    private String middleName;
    private String lastName;
    private String fullName;
    private String bornDate;
    private String email;
    private String phoneNumber;
    private int userType;
    private String since;
    private int status;

    User() {
        this.id = it;
        it++;
    }

    User(String s) {

    }

    public User(String nickname, String password, String firstName, String secondName, String middleName, String lastName, String fullName, String bornDate, String email, String phoneNumber, int userType, String since, int status) {
        this.nickname = nickname;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.bornDate = bornDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userType = userType;
        this.since = since;
        this.status = status;
        this.id = it;
        it++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        this.fullName = firstName + " " + secondName + " " + middleName + " " + lastName;
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User addUser() {
        return new User() {
            @Override
            protected void finalize() throws Throwable {
                super.finalize();
            }
        };
    }


    @Override
    public String toString() {
        return "Id: " + this.id + "\nNickname: " + this.nickname + "\nEmail: " + this.email + "\nNombre completo: " + this.firstName + " " + secondName + " " + middleName + " " + lastName;
    }
}
