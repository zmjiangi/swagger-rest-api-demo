package com.gzyijian.swagger.rest.api.demo.restcontroller;

import com.gzyijian.swagger.rest.api.demo.model.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author zmjiangi
 * @date 2019-5-9
 */
@RestController
public class UserController {

    @ApiOperation(value = "add new user", notes = "add new user to system")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName", value = "userName", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "fullName", value = "fullName", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "email", value = "email", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "userTyp", allowableValues = "1,2,3", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "dateFormat", value = "dateFormat", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "timeFormat", value = "timeFormat", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "timezone", value = "timezone", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "language", value = "language", dataType = "String", paramType = "query")
    })
    @PostMapping(value = "api/user/add", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<User> add(
            @RequestParam String userName,
            @RequestParam String password,
            @RequestParam String fullName,
            @RequestParam String email,
            @RequestParam Integer userType,
            @RequestParam(defaultValue = "yyyy-MM-dd") String dateFormat,
            @RequestParam(defaultValue = "HH:mm:ss") String timeFormat,
            @RequestParam(defaultValue = "GMT+8") String timezone,
            @RequestParam(defaultValue = "zh_CN") String language) {

        User user = new User(
                userName,
                password,
                fullName,
                email,
                userType,
                dateFormat,
                timeFormat,
                timezone,
                language
        );
        return ResponseEntity.ok(user);
    }

    @ApiOperation(value = "findByFullName", notes = "find by findByFullName")
    @ApiImplicitParam(name = "fullName", value = "fullName", required = true, dataType = "String", paramType = "path")
    @GetMapping(value = "/api/user/findByFullName/{fullName}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<User> getUserByFullName(@PathVariable String fullName) {
        User user = new User();
        user.setFullName(fullName);
        return ResponseEntity.ok(user);
    }
}
