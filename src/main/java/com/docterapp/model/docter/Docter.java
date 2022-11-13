package com.docterapp.model.docter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import com.sun.istack.NotNull;

@Entity
@Table(name = "docter")
public class Docter {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int docterId;
    private String docterName;
    private DocterCity docterCity;
    @NotNull
    @Email(message = "Enter a vaild email")
    private String docterEmail;
    private long docterPhone;
    private DocterSpeciality docterSpeciality;

    public int getDocterId() {
        return docterId;
    }

    public void setDocterId(int docterId) {
        this.docterId = docterId;
    }

    public String getDocterName() {
        return docterName;
    }

    public void setDocterName(String docterName) {
        this.docterName = docterName;
    }

    public DocterCity getDocterCity() {
        return docterCity;
    }

    public void setDocterCity(DocterCity docterCity) {
        this.docterCity = docterCity;
    }

    public String getDocterEmail() {
        return docterEmail;
    }

    public void setDocterEmail(String docterEmail) {
        this.docterEmail = docterEmail;
    }

    public long getDocterPhone() {
        return docterPhone;
    }

    public void setDocterPhone(long docterPhone) {
        this.docterPhone = docterPhone;
    }

    public Docter() {
    }

    public Docter(int docterId, String docterName, DocterCity docterCity, String docterEmail, long docterPhone, DocterSpeciality docterSpeciality) {
        this.docterId = docterId;
        this.docterName = docterName;
        this.docterCity = docterCity;
        this.docterEmail = docterEmail;
        this.docterPhone = docterPhone;
        this.docterSpeciality = docterSpeciality;
    }

    public DocterSpeciality getDocterSpeciality() {
        return docterSpeciality;
    }

    public void setDocterSpeciality(DocterSpeciality docterSpeciality) {
        this.docterSpeciality = docterSpeciality;
    }

    @Override
    public String toString() {
        return "Docter{" +
                "docterId=" + docterId +
                ", docterName='" + docterName + '\'' +
                ", docterCity=" + docterCity +
                ", docterEmail='" + docterEmail + '\'' +
                ", docterPhone=" + docterPhone +
                ", docterSpeciality=" + docterSpeciality +
                '}';
    }
}
