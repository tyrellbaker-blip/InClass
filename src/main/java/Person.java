/**
 * @author Tyrell Baker
 * @since 20- sept - 2023
 * Representing a person for command pattern
 */

public class Person {
  private String name;
  private Double power = 100.0;
  private String location;

  public Person(String name) {
    this.name = name;
  }

  public Double getPower() {
    return power;
  }

  public void setPower(Double power) {
    this.power = power;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
