package DynamicExcel.model;

import java.awt.Color;

public class ExcelCellDto {

  String data;
  Integer width;
  Color color;


  public ExcelCellDto(String data, Integer width, Color color) {
    this.data = data;
    this.width = width;
    this.color = color;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }
}
