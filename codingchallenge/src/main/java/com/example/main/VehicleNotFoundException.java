package com.example.main;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "vehicle not found")
public class VehicleNotFoundException extends RuntimeException{

}
