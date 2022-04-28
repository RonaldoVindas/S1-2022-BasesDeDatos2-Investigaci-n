
package com.basesdatos2.ravendbprototipo;

public class Vehiculo {
    private String numChasis;
    private String brand;
    private String model;
    private String year;
    private String price;
    private String color;
    private String vehicleType;
    private String condition;
    //private String image;

    
    public Vehiculo() {
    }
    
    public Vehiculo(String numChasis, String brand, String model, String year, String price, String color, String vehicleType, String condition) {
        this.numChasis = numChasis;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.vehicleType = vehicleType;
        this.condition = condition;
        
    }

    public String getNumChasis() {
        return numChasis;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getCondition() {
        return condition;
    }
    
    
    public void setNumChasis(String numChasis) {
        this.numChasis = numChasis;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    
    
    
    @Override
    public String toString() {
        return "Vehiculo{" + "numChasis=" + numChasis + ", brand=" + brand + ", model=" + model + ", year=" + year + ", price=" + price + ", color=" + color + ", vehicleType=" + vehicleType + '}';
    }

    
    
    
    
    
    
    
    
    
    
}
