package eu.deustotech.internet.tecnaliaapp.model;

import java.util.HashMap;
import java.util.Map;

import eu.deustotech.internet.linkedtagworld.layout.Layout;
import eu.deustotech.internet.tecnaliaapp.R;

public class Industry implements Layout {

	@Override
	public int getLayout() {
		
		return R.layout.industry;
	}

	@Override
	public Map<String, Integer> getWidgets() {
		Map<String, Integer> widgetMap = new HashMap<String, Integer>();
		widgetMap.put("name", R.id.industry_name);
		
		return widgetMap;
	}

}
