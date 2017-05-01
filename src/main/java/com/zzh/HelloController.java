package com.zzh;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zzh on 2017/4/29.
 */


@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @GetMapping("/get")
    private String getTest() {
        return "get test";
    }

    @PostMapping("/post")
    private String postTest() {
        return "post test";
    }

    @PutMapping("put")
    public String putTest() {
        return "put test";
    }

    @DeleteMapping("/delete")
    public String deleteTest() {
        return "delete test";
    }

    // 参数传递
    @GetMapping("/param/{id}")
    public String paramTest(@PathVariable("id") Integer ids) {
        return "id: " + ids;
    }

    @Select("select * from ")
    public String test() {
        return "";
    }

}


