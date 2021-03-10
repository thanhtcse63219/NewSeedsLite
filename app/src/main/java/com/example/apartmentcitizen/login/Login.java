package com.example.apartmentcitizen.login;

import com.google.gson.annotations.SerializedName;

public class Login {
    @SerializedName("userId")
    private int userId;

    @SerializedName("email")
    private String email;

    @SerializedName("phoneNo")
    private String phoneNo;

    @SerializedName("roleId")
    private int role;

    @SerializedName("house")
    private HouseLogin house;

    @SerializedName("profileImage")
    private String profileImage;

    @SerializedName("dateOfBirth")
    private String dateOfBirth;

    @SerializedName("idNumber")
    private String cifNumber;

    @SerializedName("idImage")
    private String cifImage;

    @SerializedName("gender")
    private int gender;

    @SerializedName("job")
    private String job;

    @SerializedName("homeTown")
    private String HomeTown;

    @SerializedName("firstName")
    private String FirstName;

    @SerializedName("lastName")
    private String LastName;

    @SerializedName("createDate")
    private String createDate;

    @SerializedName("lastModified")
    private String lastModified;

    @SerializedName("familyLevel")
    private int familyLevel;

    @SerializedName("status")
    private int status;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public HouseLogin getHouse() {
        return house;
    }

    public void setHouse(HouseLogin house) {
        this.house = house;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCifNumber() {
        return cifNumber;
    }

    public void setCifNumber(String cifNumber) {
        this.cifNumber = cifNumber;
    }

    public String getCifImage() {
        return cifImage;
    }

    public void setCifImage(String cifImage) {
        this.cifImage = cifImage;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHomeTown() {
        return HomeTown;
    }

    public void setHomeTown(String homeTown) {
        HomeTown = homeTown;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public int getFamilyLevel() {
        return familyLevel;
    }

    public void setFamilyLevel(int familyLevel) {
        this.familyLevel = familyLevel;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
