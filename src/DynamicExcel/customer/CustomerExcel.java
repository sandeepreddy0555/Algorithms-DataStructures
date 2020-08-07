package DynamicExcel.customer;

import DynamicExcel.common.ExcelCell;
import DynamicExcel.common.ExcelService;
import DynamicExcel.common.HeaderService;
import DynamicExcel.common.RowService;

public class CustomerExcel extends ExcelService {

  private  HeaderService headerService;

  private  RowService rowService;


  public CustomerExcel(HeaderService headerService, RowService rowService)
  {
    super(headerService, rowService);

  }


}
