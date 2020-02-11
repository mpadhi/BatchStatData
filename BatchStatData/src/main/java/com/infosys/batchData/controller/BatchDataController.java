/**
 * 
 */
package com.infosys.batchData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.batchData.entity.BatchStat;
import com.infosys.batchData.model.ResponseDTO;
import com.infosys.batchData.repository.BatchRepository;
import com.infosys.batchData.service.DataService;



/**
 * @author Manisha
 *
 */

@RestController 
@RequestMapping("/BatchData")
public class BatchDataController {
	
	@Autowired
    DataService dataService;
	
	@GetMapping(path = "/all", produces = "application/json")
     public List<ResponseDTO> sample() {
     return dataService.getAll();
 }
	
	
}
