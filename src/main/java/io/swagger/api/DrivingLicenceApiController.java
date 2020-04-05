package io.swagger.api;

import io.swagger.model.DrivingLicence;
import org.springframework.core.io.Resource;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T16:04:50.980Z")

@Controller
public class DrivingLicenceApiController implements DrivingLicenceApi {

    private static final Logger log = LoggerFactory.getLogger(DrivingLicenceApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DrivingLicenceApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<DrivingLicence> getDrivingLicence(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DrivingLicence>(objectMapper.readValue("{  \"4a_dateOfIssue\" : \"24 11 2016\",  \"4c_issuedBy\" : \"VĮ Regitra\",  \"2_name\" : \"Vardenis\",  \"4b_dateOfExpiry\" : \"24 11 2026\",  \"3_dateOfBirth\" : \"01 01 1985\",  \"4d_personalNo\" : 31234567890,  \"1_surname\" : \"Pavardenis\",  \"5_licenceNo\" : 35983081,  \"categories\" : [ {    \"9_name\" : \"AM\",    \"12_code\" : \"95.(24.11.21)\",    \"11_dateOfExpiry\" : \"24.11.21\",    \"10_dateOfIssue\" : \"19.01.13\"  }, {    \"9_name\" : \"AM\",    \"12_code\" : \"95.(24.11.21)\",    \"11_dateOfExpiry\" : \"24.11.21\",    \"10_dateOfIssue\" : \"19.01.13\"  } ]}", DrivingLicence.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DrivingLicence>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DrivingLicence>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getDrivingLicenceImage(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getDrivingLicenceImageSmall(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getDrivingLicenceNfc(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getDrivingLicenceQr(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getDrivingLicenceSignature(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> putDrivingLicenceImage(@ApiParam(value = "",required=true) @PathVariable("userId") String userId,@ApiParam(value = "Image to upload") @Valid @RequestPart(value="image", required=true) MultipartFile image) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> putDrivingLicenceValidation(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
