package com.example.together.infra.exception;


import com.example.together.global.error.exception.BusinessException;
import com.example.together.global.error.exception.ErrorCode;

public class WrongImageException extends BusinessException {

    public static final BusinessException EXCEPTION = new WrongImageException();
    private WrongImageException() { super(ErrorCode.WRONG_IMAGE);}
}
