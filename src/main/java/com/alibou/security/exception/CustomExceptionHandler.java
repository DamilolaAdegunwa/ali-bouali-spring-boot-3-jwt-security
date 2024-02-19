//package com.alibou.security.exception;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.client.HttpClientErrorException;
//import org.springframework.web.client.HttpServerErrorException;
//
//@EnableWebMvc
//@ControllerAdvice
//@Order(Ordered.HIGHEST_PRECEDENCE)
//public class CustomExceptionHandler {
//
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<Object> handleException(HttpServletRequest request, Exception ex) {
//        return new ResponseEntity<>("Resource not found!", HttpStatus.BAD_REQUEST);
//    }
//    
//    @ExceptionHandler(ServletException.class)
//    public ResponseEntity<Object> handleServletException(HttpServletRequest request, Exception ex) {
//        return new ResponseEntity<>("Resource not found!", HttpStatus.BAD_GATEWAY);
//    }
//    
//    @ExceptionHandler(HttpServerErrorException.class)
//    public ResponseEntity<Object> handleHttpServerErrorException(HttpServletRequest request, Exception ex) {
//        return new ResponseEntity<>("Resource not found!", HttpStatus.GATEWAY_TIMEOUT);
//    }
//    
//    @ExceptionHandler(HttpClientErrorException.class)
//    public ResponseEntity<Object> handleHttpClientErrorException(HttpServletRequest request, Exception ex) {
//        return new ResponseEntity<>("Resource not found!", HttpStatus.FAILED_DEPENDENCY);
//    }
//}