package com.gzyijian.swagger.rest.api.demo.restcontroller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zmjiangi
 * @date 2019-5-9
 */
@RestController
public class HelloWorldRestController {

    @ApiOperation(value = "hello demo", notes = "just for demo")
    @GetMapping(value = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World");
    }

}
