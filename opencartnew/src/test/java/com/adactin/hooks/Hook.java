package com.adactin.hooks;

import com.baseclass.adactin.Baseadactin;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Baseadactin{
@Before
public void beforeHook() {
	System.out.println("Before hook");
}
@After
public void afterHook() {
System.out.println("after Hook");
}
}
