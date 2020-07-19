package in.codeprism.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class Resources {

    @GetMapping("/all")
    public String hello(){
        return "not a secured endpoint";
    }
    @PreAuthorize("hasAnyRole('Admin')")
    @GetMapping("/secured/all")
    public String securedHello(){
      return "this is a secured endpoint";

    }
}
