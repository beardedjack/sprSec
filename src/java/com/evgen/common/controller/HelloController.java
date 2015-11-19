/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evgen.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping(method = RequestMethod.GET)
//@RequestMapping("/welcome")
public class HelloController {
        @RequestMapping("/welcome")
	// @RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Велком!");
		return "hello";

	}
        
        
        @RequestMapping("/goodbye")
	// @RequestMapping(method = RequestMethod.GET)
	public String printGoodbye(ModelMap model) {

		model.addAttribute("message", "Вали отсель!");
		return "hello";

	}
        
        @RequestMapping("/")
	// @RequestMapping(method = RequestMethod.GET)
	public String printNothing(ModelMap model) {

		model.addAttribute("message", "Ничё нет!");
		return "nothing";

	}
        
}