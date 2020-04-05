package io.swagger.api;

import io.swagger.model.Passport;
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
public class PassportApiController implements PassportApi {

    private static final Logger log = LoggerFactory.getLogger(PassportApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PassportApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Passport> getPassport(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Passport>(objectMapper.readValue("{  \"passportNo\" : 14951794,  \"dateOfExpiry\" : \"02 01 2029\",  \"placeOfBirth\" : \"Lietuva\",  \"nationality\" : \"Lietuvos Respublikos\",  \"footer\" : \"P<LTUBASANAVICIENE<<BIRUTE<<<<<<<<<<<<<<<<<<14951794<0LTU90031187290102049003111045<<<86\",  \"surname\" : \"Basanavičienė\",  \"givenName\" : \"Birutė\",  \"sex\" : \"MOT/F\",  \"authority\" : \"Vilnius (19)\",  \"personalNo\" : 49003111045,  \"dateOfBirth\" : \"11 03 1990\",  \"dateOfIssue\" : \"02 01 2019\"}", Passport.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Passport>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Passport>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getPassportImage(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getPassportImageSmall(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getPassportNfc(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getPassportQr(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getPassportSignature(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> putPassportImage(@ApiParam(value = "",required=true) @PathVariable("userId") String userId,@ApiParam(value = "Image to upload") @Valid @RequestPart(value="image", required=true) MultipartFile image) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> putPassportValidation(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
