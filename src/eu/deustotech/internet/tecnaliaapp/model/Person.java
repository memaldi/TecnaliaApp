package eu.deustotech.internet.tecnaliaapp.model;

import java.util.HashMap;
import java.util.Map;

import eu.deustotech.internet.linkedtagworld.layout.Layout;
import eu.deustotech.internet.tecnaliaapp.R;

public class Person implements Layout{

	@Override
	public int getLayout() {
		// TODO Auto-generated method stub
		return R.layout.person;
	}

	@Override
	public Map<String, Integer> getWidgets() {
		Map<String, Integer> widgetMap = new HashMap<String, Integer>();
		widgetMap.put("name", R.id.demonstration_tech_name);
		return widgetMap;
	}

}
