package br.com.java.productapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("api")
public class StatusController {

    @GetMapping("status")
    public ResponseEntity<HashMap<String, Object>> getApiStatus(){
        var response = new HashMap<String, Object>();
        response.put("service", "Product-APIII");
        response.put("status", "upppp");
        response.put("httpStatus", HttpStatus.OK.value());

        return ResponseEntity.ok(response);

    }

    @GetMapping("teste")
    public ResponseEntity<HashMap<String, Object>> getApiTest(){
        var response = new HashMap<String, Object>();
        response.put("servicess", "Product-APIII");
        response.put("statusss", "uup");
        response.put("httpStatus", HttpStatus.OK.value());

        return ResponseEntity.ok(response);

    }

}
