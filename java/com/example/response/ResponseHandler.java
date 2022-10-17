package com.example.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
	
	public static ResponseEntity<Object> generateResponse(String message, HttpStatus httpStatus, Object responseObject) {
		Map<String, Object> responseMap = new HashMap<String, Object>();
		responseMap.put("message",message);
		responseMap.put("status", httpStatus.value());
		responseMap.put("data", responseObject);
		
		return new ResponseEntity<Object>(responseMap, httpStatus);
	}

}
