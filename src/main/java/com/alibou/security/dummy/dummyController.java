package com.alibou.security.dummy;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/dummy")
@RequiredArgsConstructor
public class dummyController {
    
    //-2. Anonymous
    @GetMapping
    public String anonymous()
    {
        String ans = ("<h1>Just trying this stuff</h1>");
        return ans;
        //return "anonymous!";
    }
    
    //-1. Authenticate
    //@Secured("IS_AUTHENTICATED_FULLY")
    //@PreAuthorize("isAuthenticated()")
    @PreAuthorize("true")
    @GetMapping("/authenticate")
    public String authenticate()
    {
        String ans = ("<h1>authenticated!!</h1>");
        return ans;
    }
    
    //0. roles
    @PreAuthorize("hasRole('ADMIN')")
    //@Secured("ROLE_ADMIN")
    @PostMapping("/hasRole")
    public String hasRole()
    {
        
        return "hasRole!";
    }
    
    //1. Authorize Based on Multiple Roles:
    @PreAuthorize("hasAnyRole('ADMIN', 'EDITOR')")
    @GetMapping("/sensitive")
    public String sensitiveData() {
        
        return "sensitiveData: 1. Authorize Based on Multiple Roles:";
        // Accessible to users with ADMIN or EDITOR role
    }
    
    //2. Any Two of Given Roles:
    @PreAuthorize("@webSecurityExpressionRoot.hasAnyAuthority('ROLE_ADMIN', 'ROLE_USER') and @webSecurityExpressionRoot.hasAuthority('READ_PERMISSION')")
    @GetMapping("/admin-read")
    public String adminReadData() {
        return "adminReadData: 2. Any Two of Given Roles: // Accessible to users with any two of ADMIN, USER and READ_PERMISSION roles";
        
    }
    
    //3. Permissions:
    @PreAuthorize("@permissionEvaluator.hasPermission(authentication, 'CREATE_PRODUCT')")
    @PostMapping("/products")
    public String createProduct() {
        return "createProduct: //3. Permissions:";
        // Accessible to users with CREATE_PRODUCT permission
    }
    
    //4. Claims:
    @PreAuthorize("@oauth2.hasClaim('name', 'John Doe')")
    @GetMapping("/personal")
    public String personalData() {
        return "personalData: //4. Claims:";
        // Accessible to users with "name" claim equal to "John Doe" in their token
    }

    //5. Specific Token Property:
    @PreAuthorize("@oauth2.hasScope('office')")
    @GetMapping("/office-data")
    public String officeData() {
        return "officeData: 5. Specific Token Property:";
        // Accessible to users with "office" scope in their token
    }

    //6. Time-Based Access:
    @PreAuthorize("@calendarService.currentTimeMatches('09:00-17:00')")
    @GetMapping("/work-hours")
    public String workHoursData() {
        return "workHoursData: 6. Time-Based Access:";
        // Accessible only between 9am and 5pm
    }

}
