package io.swagger.api;

import io.swagger.model.PersonalIdentityCard;
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
public class PersonalIdentityCardApiController implements PersonalIdentityCardApi {

    private static final Logger log = LoggerFactory.getLogger(PersonalIdentityCardApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PersonalIdentityCardApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<PersonalIdentityCard> getPersonalIdentityCard(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PersonalIdentityCard>(objectMapper.readValue("{  \"dateOfExpiry\" : \"04 07 2022\",  \"nationality\" : \"Lietuvos Respublikos\",  \"footer\" : \"I<LTU56499778<047803111025<<<<7803118F2207043LTU<<<<<<<<<<<8BRUZAITE<<VIGILIJA<<<<<<<<<<<<\",  \"surname\" : \"Bružaitė\",  \"givenName\" : \"Vigilija\",  \"sex\" : \"MOT/F\",  \"authority\" : \"Vilnius (19)\",  \"personalNo\" : 47803111025,  \"dateOfBirth\" : \"11 03 1978\",  \"dateOfIssue\" : \"04 07 2012\",  \"cardNo\" : 56499778}", PersonalIdentityCard.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PersonalIdentityCard>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PersonalIdentityCard>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getPersonalIdentityCardImage(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getPersonalIdentityCardImageSmall(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getPersonalIdentityCardNfc(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getPersonalIdentityCardQr(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getPersonalIdentityCardSignature(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> putPersonalIdentityCardImage(@ApiParam(value = "",required=true) @PathVariable("userId") String userId,@ApiParam(value = "Image to upload") @Valid @RequestPart(value="image", required=true) MultipartFile image) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> putPersonalIdentityCardValidation(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
