

public class PowerStone implements IStone {
  private static PowerStone powerStone = null;
  private PowerStone(){}

  public static PowerStone getPowerStone()
  {
    if (powerStone == null)
    {
      powerStone = new PowerStone();
    }
    return powerStone;
  }

  public static final double MULTIPLIER = 150.0;

  /**
   * Use the multiplier to increase the person power
   */
  @Override
  public void activate(Person person) {
    System.out.println("Powering up");

    System.out.printf("%s's power == %.2f%n", person, person.getPower());
    double currentPower = person.getPower();
    currentPower = currentPower * MULTIPLIER;
    person.setPower(currentPower);
    System.out.printf("%s's power is NOW == %.2f%n", person, person.getPower());
  }

  /**
   * use the multiplier to decrease the Person's power
   *
   * @param person
   */
  @Override
  public void deactivate(Person person) {

    System.out.printf("%s's power == %.2f%n", person, person.getPower());
    System.out.println("Powering Down");
    double currentPower = person.getPower();
    currentPower = currentPower / MULTIPLIER;
    person.setPower(currentPower);
    System.out.printf("%s's power is NOW == %.2f%n", person, person.getPower());


  }
}