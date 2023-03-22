package Lab03;

import java.time.Year;

public class House {
    Integer number;
    Integer year;
    String nameHouse;

    public House() {
    }

    ;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getNameHouse() {
        return nameHouse;
    }

    public void setNameHouse(String nameHouse) {
        this.nameHouse = nameHouse;
    }

    public int numberOfYear() {
        int datNow = Year.now().getValue();
        int numberOfYear = datNow - year;
        return numberOfYear;
    }

    @Override
    public String toString() {
        return "House{" +
                "number='" + number + '\'' +
                ", year='" + year + '\'' +
                ", nameHouse='" + nameHouse + '\'' +
                '}';
    }
}
