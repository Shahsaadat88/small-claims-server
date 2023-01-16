package com.allstate.smallclaimsserver.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "allstateclaims")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String policyNumber;
    @Column(name="claimNumber")
    private String claimNumber;
    private Date date;
    private String title;
    private String firstName;
    private String lastName;

    private String claimStatus;
    private Integer companyId;
    private Integer lineCd;
    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String status) {
        this.claimStatus = claimStatus;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getLineCd() {
        return lineCd;
    }

    public void setLineCd(Integer lineCd) {
        this.lineCd = lineCd;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Claim(Integer id, String policyNumber, String claimNumber, Date date, String title, String firstName, String lastName, String claimStatus, Integer companyId, Integer lineCd, String state) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.claimNumber = claimNumber;
        this.date = date;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.claimStatus = claimStatus;
        this.companyId = companyId;
        this.lineCd = lineCd;
        this.state = state;
    }

    public Claim() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claim claim = (Claim) o;
        return Objects.equals(id, claim.id) && Objects.equals(policyNumber, claim.policyNumber) && Objects.equals(claimNumber, claim.claimNumber) && Objects.equals(date, claim.date) && Objects.equals(title, claim.title) && Objects.equals(firstName, claim.firstName) && Objects.equals(lastName, claim.lastName) && Objects.equals(claimStatus, claim.claimStatus) && Objects.equals(companyId, claim.companyId) && Objects.equals(lineCd, claim.lineCd) && Objects.equals(state, claim.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, policyNumber, claimNumber, date, title, firstName, lastName, claimStatus, companyId, lineCd, state);
    }

    @Override
    public String toString() {
        return "Claim{" +
                "id=" + id +
                ", policyNumber='" + policyNumber + '\'' +
                ", claimNumber='" + claimNumber + '\'' +
                ", date=" + date +
                ", title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", claimStatus='" + claimStatus + '\'' +
                ", companyId=" + companyId +
                ", lineCd=" + lineCd +
                ", status='" + state + '\'' +
                '}';
    }
}
