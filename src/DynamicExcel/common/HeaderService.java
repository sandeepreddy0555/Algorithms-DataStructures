package DynamicExcel.common;

import DynamicExcel.model.ExcelCellDto;
import java.util.List;

public interface HeaderService {

  public List<ExcelCellDto> createHeaders();

}
