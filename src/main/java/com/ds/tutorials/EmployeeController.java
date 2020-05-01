package com.ds.tutorials;

import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController extends BaseController {

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    private EmployeeService employeeService;


    @GetMapping (path = "/employee", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<RestResponse<List<Employee>>> getAllEmployeeDetails()
    {
        List<Employee> employeeList = employeeService.getAllEmployeeDetails();

        return generateResponse(employeeList);
    }
}
