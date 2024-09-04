package com.example.together.global.exception;


import com.example.together.global.error.exception.BusinessException;
import com.example.together.global.error.exception.ErrorCode;

public class InvalidTokenException extends BusinessException {
    public static final BusinessException EXCEPTION = new InvalidTokenException();
    private InvalidTokenException(){
        super(ErrorCode.INVALID_TOKEN);

    }
}
