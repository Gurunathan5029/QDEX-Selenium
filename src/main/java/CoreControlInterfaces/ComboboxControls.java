package CoreControlInterfaces;

public interface ComboboxControls {
	void SelectItem(String identifier,String item);
	void SelectItem(String identifier,int index);
	void DeSelectItem(String identifier,String item);
	void DeSelectItem(String identifier,int index);
	void DeSelectAllItem();
}
