package org.chiches.summer_practice.dtos;

public class UserDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private double bonusBalance;

    public UserDto(String name, String surname, String email, double bonusBalance) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.bonusBalance = bonusBalance;
    }

    public UserDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBonusBalance() {
        return bonusBalance;
    }

    public void setBonusBalance(double bonusBalance) {
        this.bonusBalance = bonusBalance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
