package com.docterapp.model.paitent;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "paitent")
public class Paitent {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int paitentId;
    @NotNull
    @Min(value = 3, message = "Enter a vaild name more than 3 char")
    private String paitentName;
    @NotNull
    @Max(value = 20, message = "City name should not be more than 20 char")
    private String paitentCity;
    @NotNull
    @Email
    private String paitentEmail;
    @Pattern(regexp="(^$|[0-9]{10})",message = "Enter a vaild Phone Number")
    private long paitentPhone;
    private PaitentSymptom paitentSymptom;

    public Paitent() {
    }

    public Paitent(int paitentId, String paitentName, String paitentCity, String paitentEmail, long paitentPhone, PaitentSymptom paitentSymptom) {
        this.paitentId = paitentId;
        this.paitentName = paitentName;
        this.paitentCity = paitentCity;
        this.paitentEmail = paitentEmail;
        this.paitentPhone = paitentPhone;
        this.paitentSymptom = paitentSymptom;
    }

    public int getPaitentId() {
        return paitentId;
    }

    public void setPaitentId(int paitentId) {
        this.paitentId = paitentId;
    }

    public String getPaitentName() {
        return paitentName;
    }

    public void setPaitentName(String paitentName) {
        this.paitentName = paitentName;
    }

    public String getPaitentCity() {
        return paitentCity;
    }

    public void setPaitentCity(String paitentCity) {
        this.paitentCity = paitentCity;
    }

    public String getPaitentEmail() {
        return paitentEmail;
    }

    public void setPaitentEmail(String paitentEmail) {
        this.paitentEmail = paitentEmail;
    }

    public long getPaitentPhone() {
        return paitentPhone;
    }

    public void setPaitentPhone(long paitentPhone) {
        this.paitentPhone = paitentPhone;
    }

    public PaitentSymptom getPaitentSymptom() {
        return paitentSymptom;
    }

    public void setPaitentSymptom(PaitentSymptom paitentSymptom) {
        this.paitentSymptom = paitentSymptom;
    }
}
