package org.boost;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.Iterator;

public class TestRunner {

    public TestRunner(){

    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(new Class[]{BoostReflectionTest.class});
        Iterator failures = result.getFailures().iterator();

        while(failures.hasNext()){
            Failure failure = (Failure)failures.next();
            System.err.println(failure);
        }
    }
}
