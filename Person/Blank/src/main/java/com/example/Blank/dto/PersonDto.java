package com.example.Blank.dto;



public class PersonDto {



    private Integer id;

    private String fName;

    private String lName;

    private String address;

    public PersonDto(Integer id, String fName, String lName, String address) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

