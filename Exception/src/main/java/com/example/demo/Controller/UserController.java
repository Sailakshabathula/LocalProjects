package com.example.demo.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
public class UserController {

    /*@Operation
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode ="404", description = "Not Found")
    })*/
    @GetMapping("/example")
    public ResponseEntity<String> getExample() {
       // ExampleResponse exampleResponse = new ExampleResponse("This is an example response");
        return ResponseEntity.ok("this");
    }


}
