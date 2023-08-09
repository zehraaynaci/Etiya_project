package com.example.demo_project.Exceptions;

import com.example.demo_project.Response.GenericResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(BusinessValidationException.class)

    protected ResponseEntity<Object> handleHttpMessageNotWritable(HttpMessageNotWritableException ex, HttpHeaders headers, HttpStatus status, WebRequest request){
        return this.handleExceptionInternal(ex, (Object)null, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        String message = ex.getBindingResult().getFieldErrors().stream().map(FieldError::getDefaultMessage).reduce((oldMessage, newMessage) -> oldMessage + ", " + newMessage).orElse("HATA!");
        GenericResponse<?> errorResponse = GenericResponse.failedResponse(message);
        return ResponseEntity.badRequest().body(errorResponse);
    }


    public ResponseEntity<GenericResponse<?>> handleBusinessValidationException(BusinessValidationException ex, WebRequest webRequest) {
        return ResponseEntity.internalServerError().body(GenericResponse.failedResponse(ex.getMessage()));
    }

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        return ResponseEntity.badRequest().body(GenericResponse.failedResponse("POSTALAMA TİPİNİ ***"));
    }
}
