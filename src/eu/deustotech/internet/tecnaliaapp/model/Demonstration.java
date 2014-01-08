package eu.deustotech.internet.tecnaliaapp.model;

import java.util.HashMap;
import java.util.Map;

import eu.deustotech.internet.linkedtagworld.layout.Layout;
import eu.deustotech.internet.tecnaliaapp.R;

public class Demonstration implements Layout {

	@Override
	public int getLayout() {
		return R.layout.demonstration;
	}

	@Override
	public Map<String, Integer> getWidgets() {
		Map<String, Integer> widgetMap = new HashMap<String, Integer>();
		
		widgetMap.put("evolvedtechnology", R.id.demonstration_technologies);
		widgetMap.put("mantainer", R.id.demonstration_mantainer);
		widgetMap.put("name", R.id.demonstration_name);
		widgetMap.put("developer", R.id.demonstration_developer_layout);
		widgetMap.put("relatedindustry", R.id.demonstration_industry);
		widgetMap.put("relatedproject", R.id.demonstration_project);
		widgetMap.put("description", R.id.demonstration_description);
		
		return widgetMap;
	}

}
