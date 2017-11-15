package com.service.play.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-15T10:13:34.844+08:00")

@RestSchema(schemaId = "play")
@RequestMapping(path = "/play", produces = MediaType.APPLICATION_JSON)
public class PlayImpl {

    @Autowired
    private PlayDelegate userPlayDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userPlayDelegate.helloworld(name);
    }

}
