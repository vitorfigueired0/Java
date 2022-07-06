package resolvidoherança;

public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employee(String name, Integer hours, Double valuePerHour){
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        return hours * valuePerHour;
    }
    public String getName() {
        return name;
    }
    public Integer getHours() {
        return hours;
    }
    public Double getValuePerHour() {
        return valuePerHour;
    }

}
