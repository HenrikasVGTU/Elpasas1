/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Authorization;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T16:04:50.980Z")

@Api(value = "user", description = "the user API")
@RequestMapping(value = "/api")
public interface UserApi {

    @ApiOperation(value = "Logs user into the system", nickname = "loginUser", notes = "", response = Authorization.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful login", response = Authorization.class),
        @ApiResponse(code = 400, message = "Invalid login credentials supplied") })
    @RequestMapping(value = "/user/login",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Authorization> loginUser(@NotNull @ApiParam(value = "The string with user credentials in base64", required = true) @Valid @RequestParam(value = "creds", required = true) String creds) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"userId\" : \"31234567890\",  \"token\" : \"Basic ZllvSFpwcnJCR01XZXExZk9IYUFIWTZmWE53bTA1TDJLaXdZRFI2azZrWDYyclhTY3REOEhVbHZVRzZGcEVlOA==\"}", Authorization.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Logs out current logged in user session", nickname = "logoutUser", notes = "", authorizations = {
        @Authorization(value = "Token")
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully logged off") })
    @RequestMapping(value = "/user/logout",
        produces = { "text/plain" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Void> logoutUser(@NotNull @ApiParam(value = "The string with user credentials in base64", required = true) @Valid @RequestParam(value = "creds", required = true) String creds) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}