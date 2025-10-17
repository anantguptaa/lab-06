package com.example.listycity;
public class City implements Comparable<City>{
    private String city;
    private String province;
     public City(String city, String province){
        this.city = city;
        this.province = province;
    }
    public String getCityName() {
        return this.city;
    }
    public String getProvinceName(){
            return this.province;
        }
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(o.getCityName()); // this.city refers to the city name
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City newCity = (City) o;
            return city.equals(newCity.getCityName()) && province.equals(newCity.getProvinceName());
    }
    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + province.hashCode();
        return result;
    }
}

