package com.myproject.myproject.core.models;

import javax.script.Bindings;

import org.apache.sling.scripting.sightly.pojo.Use;
import org.apache.sling.api.resource.Resource;

public class MyComponent implements Use {

    private String value;

    @Override
    public void init(Bindings bindings) {
        // All standard objects are available as bindings
        Resource resource = (Resource) bindings.get("resource");

        // Parameters are also passed as bindings
        String param1 = (String) bindings.get("param1");
        String param2 = (String) bindings.get("param2");

        value = resource.getPath() + param1 + param2;
    }

    public String getCalculatedValue() {
        return value;
    }

	
}
