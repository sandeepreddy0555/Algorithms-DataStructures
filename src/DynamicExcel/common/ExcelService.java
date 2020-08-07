package DynamicExcel.common;

public abstract class ExcelService {

  HeaderService headerService;
  RowService rowService;


  public ExcelService()
  {

  }

  public ExcelService(HeaderService headerService, RowService rowService)
  {
    this.headerService = headerService;
    this.rowService = rowService;
  }

  public void createExcel()
  {


  }

  public void doCreateHeaders()
  {
    headerService.createHeaders();
  }

  public void doCreateRows()
  {
    rowService.createRows();
  }

  public void createSheet()
  {

    this.createExcel();
    this.doCreateHeaders();
    this.doCreateRows();

  }

}
