package com.github.huyisen.spring.boot.app.web;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/common/search")
public class SearchController {

    @RequestMapping(value = "/{collection}/{action}")
    private String index(@PathVariable("collection") String collection, @PathVariable("action") String action) {

        return "fuck " + collection + " -- " + action;
    }


}
