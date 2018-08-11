package CoreControlClasses;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import CoreControlInterfaces.TableControls;
import WebDriverCoreSupportClasses.WebDriverClass;

public class TableMain implements TableControls {
	WebDriverClass driver;
	int size;
	
	
	public String GetCellValue(String refColumn, String refCellValue, String returnCellColumn, By Table) {
		WebElement Parent = driver.driver().findElement(Table);
		WebElement cell;
		int rowIndex = 0;
		int columnIndex = 0;
		int refIndex = 0;
		int returnIndex = 0;
			for (WebElement innerelement : Parent.findElements(By.xpath("//tr[1]//td")))
			{
				columnIndex = columnIndex+1;
				if (innerelement.getText().toString().equals(refColumn))
				{
					refIndex = columnIndex;					
				}
				else if (innerelement.getText().toString().equals(returnCellColumn))
				{
					returnIndex = columnIndex;
				}
					
			}
			for (WebElement refElement : Parent.findElements(By.xpath("//tr//td["+refIndex+"]")))
			{
				rowIndex = rowIndex+1;
				if (refElement.getText().toString().equals(refCellValue))
				{
					cell = Parent.findElement(By.xpath("//tr["+rowIndex+"]//td["+returnIndex+"]"));
					return cell.getText().toString();
				}
			}
		return null; 
	}
	
	public void ClickOnCellByNumber(String refColumn, String refCellValue, String returnCellColumn, By Table) {
		WebElement Parent = driver.driver().findElement(Table);
		WebElement cell;
		int rowIndex = 0;
		int columnIndex = 0;
		int refIndex = 0;
		int returnIndex = 0;
			for (WebElement innerelement : Parent.findElements(By.xpath("//tr[1]//td")))
			{
				columnIndex = columnIndex+1;
				if (innerelement.getText().toString().equals(refColumn))
				{
					refIndex = columnIndex;					
				}
				else if (innerelement.getText().toString().equals(returnCellColumn))
				{
					returnIndex = columnIndex;
				}
					
			}
			for (WebElement refElement : Parent.findElements(By.xpath("//tr//td["+refIndex+"]")))
			{
				rowIndex = rowIndex+1;
				if (refElement.getText().toString().equals(refCellValue))
				{
					cell = Parent.findElement(By.xpath("//tr["+rowIndex+"]//td["+returnIndex+"]"));
					cell.click();
				}
			}
	}
	
	
	public ArrayList<String> GetColumn(String returnCellColumnHeader, By Table) {
		WebElement Parent = driver.driver().findElement(Table);
		ArrayList<String> column = new ArrayList<String>();
		int columnIndex = 0;
		for (WebElement innerelement : Parent.findElements(By.xpath("//tr[1]//td")))
		{
			columnIndex = columnIndex+1;
			if (innerelement.getText().toString().equals(returnCellColumnHeader))
			{
		      break;				
			}
				
		}
		
		for (WebElement refElement : Parent.findElements(By.xpath("//tr[position()>1]//td["+columnIndex+"]")))
		{
			column.add(refElement.getText().toString());
		}
		return column;
	}

	
}
