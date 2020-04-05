package io.swagger.api;

import org.springframework.core.io.Resource;
import io.swagger.model.StudentIdentityCard;
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
public class StudentIdentityCardApiController implements StudentIdentityCardApi {

    private static final Logger log = LoggerFactory.getLogger(StudentIdentityCardApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StudentIdentityCardApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<StudentIdentityCard> getStudentIdentityCard(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<StudentIdentityCard>(objectMapper.readValue("{  \"studentId\" : \"53675\",  \"studiesAt\" : \"Socialinių mokslų f.\",  \"surname\" : \"Universitaitė\",  \"spd\" : 701303,  \"name\" : \"Unė\",  \"personalNo\" : 48703030001,  \"validUntil\" : \"2021-06-30\",  \"validFrom\" : \"2017-09-01\",  \"barcode\" : \"94403905000000014\"}", StudentIdentityCard.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<StudentIdentityCard>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<StudentIdentityCard>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getStudentIdentityCardImage(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getStudentIdentityCardImageSmall(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getStudentIdentityCardNfc(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getStudentIdentityCardQr(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getStudentIdentityCardSignature(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> putStudentIdentityCardImage(@ApiParam(value = "",required=true) @PathVariable("userId") String userId,@ApiParam(value = "Image to upload") @Valid @RequestPart(value="image", required=true) MultipartFile image) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> putStudentIdentityCardValidation(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
