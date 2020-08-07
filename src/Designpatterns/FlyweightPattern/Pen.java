package Designpatterns.FlyweightPattern;

public class Pen implements PenInterface {

  private PenType penType;
  private PenColor penColor;

  @Override
  public void setType(PenType penType){
    this.penType = penType;
  }

  @Override
  public void setColor(PenColor penColor){
    this.penColor = penColor;
  }


}
