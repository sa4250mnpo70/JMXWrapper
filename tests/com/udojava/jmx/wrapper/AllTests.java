package com.udojava.jmx.wrapper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BeanAnnotationTest.class, BeanAttributeTest.class,
		BeanMethodTest.class, ResourceBundleTest.class })
public class AllTests {
}
