/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate; 

/**
 *
 * @author sravyaganda
 */
public class CarsCatalog {
    
      private ArrayList<Car> CarsCatalog;

      
      public CarsCatalog()
      {
          CarsCatalog=new ArrayList<Car>();
          //String Company,int YearOfManufacture,int SeatCapacity,String Color,String ModelNumber,String Serialno,
           // boolean StatusOfCar,Date MaintainExpDate,String City
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           try{
          CarsCatalog.add(new Car("Tyota",2015,5,"Red","Innova","1234",true,sdf.parse("2022-05-11"),"Boston"));
          CarsCatalog.add(new Car("Honda",2018,7,"White","Civic","234",true,sdf.parse("2020-05-03"),"Dorchester"));
          CarsCatalog.add(new Car("KIA",2011,3,"Blue","I20","123",false,sdf.parse("2018-08-01"),"Lowell"));
          CarsCatalog.add(new Car("Lexus",2020,5,"Red","RR","1264",false,sdf.parse("2023-05-11"),"DownTown"));
          CarsCatalog.add(new Car("Honda",2019,7,"White","RV","1254",true,sdf.parse("2012-05-11"),"Ruggles"));
          CarsCatalog.add(new Car("Tyota",2017,4,"Blue","Corella","134",false,sdf.parse("2021-12-11"),"Boston"));
          CarsCatalog.add(new Car("Honda",2018,9,"Red","Civic","124",false,sdf.parse("2023-05-11"),"Ruggles"));
      }
      
     catch(ParseException e)
      {
           System.out.println("Exception occured while parsing the date parameter" ); 
      }
      }
      
    public ArrayList<Car> getCarsCatalog() {
        return CarsCatalog;
    }

    public void setCarsCatalog(ArrayList<Car> CarsCatalog) {
        this.CarsCatalog = CarsCatalog;
    }
    
    public void addCar(Car c)
    {
        CarsCatalog.add(c);
    }
    
    public void removeCar(Car c)
    {
        CarsCatalog.remove(c);
    }
}
      
    
