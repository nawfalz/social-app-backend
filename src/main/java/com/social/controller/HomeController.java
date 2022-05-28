/*
 * Developed by Nay Oo Kyaw
 */

package com.social.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* we use the annotation of spring */
@RestController
public class HomeController {

	@RequestMapping("/")
	public HashMap<String, String> home()
	{
		HashMap<String, String> responseObj = new HashMap<String, String>();
		responseObj.put("name", "Mr.haha");
		responseObj.put("address", "Myanmar");
		responseObj.put("favorite", "pornhub");
		
		return responseObj;
	}
}
