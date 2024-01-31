package com.sjprogramming.springmysqlex.content;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {
	
	@Autowired
    private DataRepository dataRepository;

    public List<DataEntity> getDataByFilters() {	
    	
    	  return dataRepository.findAll();
    }
    
}
