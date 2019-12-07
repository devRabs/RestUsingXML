package com.rest.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@RequestMapping(value="/testXML", method=RequestMethod.POST,
			consumes= {"application/json","application/xml"},
			produces= {"application/json","application/xml"})
	public Superparent getXML(@RequestBody Superparent req)
	{
		return req;
	}
	
	@RequestMapping(value="/test", method=RequestMethod.POST)
	public String getXML(@RequestBody String req)
	{
		return req;
	}
}
