package web.model;

public class Car {
    private String manufacturer;
    private String countryOfOrigin;
    private int yearOfCreating;

    public Car(String manufacturer, String countryOfOrigin, int year) {
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.yearOfCreating = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getYearOfCreating() {
        return yearOfCreating;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setYearOfCreating(int yearOfCreating) {
        this.yearOfCreating = yearOfCreating;
    }

    @Override
    public String toString() {
        return "manufacturer = " + manufacturer +
                " countryOfOrigin = " + countryOfOrigin +
                " year = " + yearOfCreating;
    }
}
