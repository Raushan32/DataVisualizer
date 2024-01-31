package com.sjprogramming.springmysqlex.content;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class DataController {

	@Autowired
    private DataService dataService=new DataService();

    @GetMapping("/filtered")
    public List<DataEntity> getFilteredData() {
        return dataService.getDataByFilters();
    }
   
}
