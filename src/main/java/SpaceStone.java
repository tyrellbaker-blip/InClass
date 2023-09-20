public class SpaceStone implements IStone {

  private static SpaceStone spaceStone = null;

  private SpaceStone(){}

  public static SpaceStone getSpaceStone()
  {
    if (spaceStone == null)
    {
      spaceStone = new SpaceStone();
    }
    return spaceStone;
  }


  @Override
  public void activate(Person person) {

  }

  @Override
  public void deactivate(Person person) {

  }
}
