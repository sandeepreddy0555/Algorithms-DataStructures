package DynamicExcel;

import DynamicExcel.common.DefaultHeaderService;
import DynamicExcel.common.DefaultRowService;
import DynamicExcel.common.ExcelService;
import DynamicExcel.customer.CustomerExcel;

public class MainExcel {

  public static void main(String[] args) {

    ExcelService excelService = new CustomerExcel(new DefaultHeaderService(), new DefaultRowService());
    excelService.createSheet();

  }

}
