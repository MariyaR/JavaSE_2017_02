package edu.javacourse.third.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by antonsaburov on 22.02.17.
 */
public abstract class Person implements Serializable
{
    private String surName;
    private String givenName;
    private String patronymic;
    private Date dateOfBirth;

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
