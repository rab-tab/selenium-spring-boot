package com.selenium.spring.seleniumspringboot.googletest;

import com.selenium.spring.seleniumspringboot.SpringBaseTestNGTest;
import com.selenium.spring.seleniumspringboot.pages.GooglePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleTest extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;


    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        this.googlePage.getSearchComponent().search("spring boot");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        //this.screenshotService.takeScreenShot();
        this.googlePage.close();
    }

}
