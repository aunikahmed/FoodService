package com.aunik.restfullService.controller;


import com.aunik.restfullService.domain.Menu;
import com.aunik.restfullService.service.MenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by muzaddid on 11/16/14.
 */
@Controller
@RequestMapping("/")
public class ServiceController {

@Autowired
Menu menu;

    @RequestMapping(value = "/confirmations", method = RequestMethod.GET)
    public @ResponseBody List<Menu> confirmations(){

        System.out.println("controller called");
        List<Menu> menuList = MenuService.getMenu();
        return menuList ;
    }
}

