package com.bobo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.saml.SAMLCredential;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/saml")
public class SamlController {

    @RequestMapping(value = "/play")
    public String play(HttpServletRequest request, HttpServletResponse response){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        SAMLCredential credential = (SAMLCredential) authentication.getCredentials();

        String email = credential.getAttributeAsString("emailAddress");
        String userID = credential.getAttributeAsString("UserID");

        //        response.sendRedirect();
        return "hello";
    }

}
