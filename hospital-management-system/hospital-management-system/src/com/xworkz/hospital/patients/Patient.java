package com.xworkz.hospital.patients;

public class Patient
{
    private int patieniId;
    private String patientName;
    private String admittedDate;
    private String dischargeDate;

    public void setPatientId(int id)
    {
        patieniId=id;
    }

    public int getPatieniId() {
        return patieniId;
    }

    public void setPatientName(String name)
    {
        patientName=name;
    }

    public String getPatientName()
    {
        return patientName;
    }

    public void setAdmittedDate(String admittedDate)
    {
        this.admittedDate=admittedDate;
    }
    public String getAdmittedDate()
    {
        return admittedDate;
    }

    public void setDischargeDate(String dischargeDate)
    {
        this.dischargeDate=dischargeDate;
    }
    public String getDischargeDate()
    {
        return dischargeDate;
    }

}
