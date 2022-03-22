package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.*;

//Rest Request Controller
@RestController
public class HelloWorldController {
    //GET
    //URI - /hello-world
    //method - "Hello World!"
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    //OR @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    //hello-world-bean
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world-bean")
    // OR @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }


    //hello-world-version
    @RequestMapping(method = RequestMethod.GET, path = "hello-world-version")
    public HelloWorldVersion HelloWorldVersion() {
        return new HelloWorldVersion("Learning Spring Boot!");
    }

    //hello-world/path-variable/username
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world/path-variable/{name}")
    public HelloWorldVersion newhelloworldversion(@PathVariable String name) {
        return new HelloWorldVersion("Hello World!" + name);
    }


}
