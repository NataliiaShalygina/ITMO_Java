package Lab02;

public class figureSkaters {
    private String name;
    private String surname;
    private Discipline disp;
    private Integer age;
    private String country;
    private Status stat;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public Discipline getDisp(){
        return disp;
    }
    public void setDisp(Discipline disp){
        this.disp = disp;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public Status getStat(){
        return stat;
    }
    public void setStat(Status stat){
        this.stat = stat;
    }

    public figureSkaters(){
    };
    public figureSkaters(String name, String surname, Discipline disp, Status stat){
        this.name = name;
        this.surname = surname;
        this.disp = disp;
        this.stat = stat;
    }
    public figureSkaters(String name, String surname, Discipline disp, Integer age, String country, Status stat){
        this.name = name;
        this.surname = surname;
        this.disp = disp;
        this.age = age;
        this.country = country;
        this.stat = stat;
    }
    @Override
    public String toString() {
        return "figureSkaters{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", disp='" + disp + '\'' +
                ", age='" + age + '\'' +
                ", country='" + country + '\'' +
                ", stat='" + stat + '\'' +
                '}';
    }
}
