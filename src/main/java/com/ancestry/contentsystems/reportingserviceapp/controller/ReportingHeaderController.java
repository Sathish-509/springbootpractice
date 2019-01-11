package com.ancestry.contentsystems.reportingserviceapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ancestry.contentsystems.reportingserviceapp.model.ReportingHeaders;

@RestController
public class ReportingHeaderController {
    private static Map<String, ReportingHeaders> headersRepo = new HashMap<>();
    static {
        ReportingHeaders header1 = new ReportingHeaders();
        header1.setId("1");
        header1.setName("id");
        headersRepo.put(header1.getId(), header1);

        ReportingHeaders header2 = new ReportingHeaders();
        header2.setId("2");
        header2.setName("name");
        headersRepo.put(header2.getId(), header2);
    }

    @RequestMapping(value = "/headers")
    public ResponseEntity<Object> getProduct() {
        return new ResponseEntity<>(headersRepo.values(), HttpStatus.OK);
    }
}
