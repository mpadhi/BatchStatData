package com.infosys.batchData.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.batchData.entity.BatchStat;
import com.infosys.batchData.model.Docs;
import com.infosys.batchData.model.ResponseDTO;
import com.infosys.batchData.repository.BatchRepository;

@Service
public class DataService {
	
	 @Autowired
	 BatchRepository batchRepo;
	/*
	 * @Autowired ResponseDTO dto;
	 */
	 
	/*
	 * @Autowired BatchStat batchModel;
	 */
	 
	        public List<ResponseDTO> getAll() {
	        	
	        	List<ResponseDTO> list = new ArrayList<ResponseDTO>();
	        	ResponseDTO dto = new ResponseDTO();
	        	Docs doc = new Docs();
	        	
	        	for (BatchStat bs:batchRepo.getAll() ) {
	        		doc.setTotal(Integer.parseInt(bs.getTotal()));
	        		doc.setTbp(Integer.parseInt(bs.getToBeProcessed()));
	        		doc.setFailed(Integer.parseInt(bs.getFailed()));
	        		doc.setSuccess(Integer.parseInt(bs.getSuccess()));
	        		doc.setStart(bs.getStartTime());
	        		doc.setEnd(bs.getEndTime());
	        		dto.setDocs(doc);
	        	dto.setLabel(bs.getBatchId());
	        	list.add(dto);
	        	}
	        	
	        	
	        return list;
	    }

}
