package com.selenium.spring.seleniumspringboot.pages;

import com.selenium.spring.seleniumspringboot.annotation.PageFragment;
import com.selenium.spring.seleniumspringboot.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@PageFragment
public class SearchResult extends Base {

    @FindBy(css = "div.rc")
    private List<WebElement> results;

    public int getCount(){
        return this.results.size();
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> !this.results.isEmpty());
    }
}
