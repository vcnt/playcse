package com.service.play.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class TestPlay {

    PlayImpl playImpl;

    @Before
    public void setup() throws Exception{
        Log4jUtils.init();
        BeanUtils.init();
        playImpl = BeanUtils.getBean("playImpl");
    }



    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: playImpl.helloworld(String name)
        String returnValue = playImpl.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}