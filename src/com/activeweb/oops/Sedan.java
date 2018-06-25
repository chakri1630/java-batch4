package com.activeweb.oops;

import org.apache.commons.lang3.StringUtils;

public class Sedan {

	public void running(String engine) {

		if (engine != null && engine != "" && engine != " ") {
			engine.concat("Hello");
		}

		if(StringUtils.isNotBlank(engine)) {
			
		}
		
	}

}
