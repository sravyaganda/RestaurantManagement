/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate; 
/**
 *
 * @author sravyaganda
 */
public class Car {
    private String company;
    private int yearOfManufacture;
    private int seatCapacity;
    private String color;
    private String modelNumber;
    private String serialno;
    private boolean statusOfCar;//is that availble for ride; 
    // Date of Maintenance Certificate Expiry
    private Date maintainExpdate;
    private String location;
    
    
    public Car (String Company,int YearOfManufacture,int SeatCapacity,String Color,String ModelNumber,String Serialno,
            boolean StatusOfCar,Date MaintainExpDate,String Location)
    {
        this.company=Company;
        this.yearOfManufacture=YearOfManufacture;
        this.seatCapacity=SeatCapacity;
        this.color=Color;
        this.modelNumber=ModelNumber;
        this.serialno=Serialno;
        this.statusOfCar=StatusOfCar;
        this.maintainExpdate=MaintainExpDate;
        this.location=Location;
    }
    
     public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public boolean getisStatusOfCar() {
        return statusOfCar;
    }

    public void setStatusOfCar(boolean statusOfCar) {
        this.statusOfCar = statusOfCar;
    }

    public Date getMaintainExpdate() {
        return maintainExpdate;
    }

    public void setMaintainExpdate(Date maintainExpdate) {
        this.maintainExpdate = maintainExpdate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
