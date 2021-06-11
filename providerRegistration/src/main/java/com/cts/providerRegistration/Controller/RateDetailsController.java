package com.cts.providerRegistration.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.providerRegistration.Modal.RateDetails;
import com.cts.providerRegistration.Service.RateDetailsService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api-pod8")
public class RateDetailsController {
	
	 @Autowired
	  private RateDetailsService rateDetailsService;
	 
	 @GetMapping(value = "/get-all-rate")
	    public List<RateDetails> getAllRateDetails() {
	        return rateDetailsService.getAllRateDetail();
	    }
	 @PostMapping(value = "/set-rate")
	    public String setRateDetails(@RequestBody final RateDetails rateDetails) {
	        return rateDetailsService.setRateDetails(rateDetails);
	    }

}
