package com.company.examples.module2.ex020_file;

public class PassportInfo {

    private String passportSeries;
    private String passportNumber;
    private int acquirePlaceId;
    private long taxPayerNumber;

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getAcquirePlaceId() {
        return acquirePlaceId;
    }

    public void setAcquirePlaceId(int acquirePlaceId) {
        this.acquirePlaceId = acquirePlaceId;
    }

    public long getTaxPayerNumber() {
        return taxPayerNumber;
    }

    public void setTaxPayerNumber(long taxPayerNumber) {
        this.taxPayerNumber = taxPayerNumber;
    }
}
