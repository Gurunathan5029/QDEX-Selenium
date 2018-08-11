package CoreControlInterfaces;

import java.util.ArrayList;

import org.openqa.selenium.By;

public interface TableControls {
	 String GetCellValue(String refColumn,String refCellValue,String returnCellColumn,By Table);
	 
	 ArrayList<String> GetColumn(String returnCellColumnHeader,By Table);
	 
	 void ClickOnCellByNumber(String refColumn,String refCellValue,String clickColumnHeader,By Table);	 
	
}
