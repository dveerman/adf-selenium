package com.redheap.selenium.component;

import org.openqa.selenium.WebDriver;

@Deprecated
public class AdfCommandButton extends AdfButton {

    public AdfCommandButton(WebDriver webDriver, String clientid) {
        super(webDriver, clientid);
    }

    @Override
    protected String getExpectedComponentType() {
        return "oracle.adf.RichCommandButton";
    }

}
