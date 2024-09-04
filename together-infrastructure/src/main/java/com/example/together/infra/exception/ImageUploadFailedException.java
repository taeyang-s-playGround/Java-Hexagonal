package com.example.together.infra.exception;


import com.example.together.global.error.exception.BusinessException;
import com.example.together.global.error.exception.ErrorCode;

public class ImageUploadFailedException extends BusinessException {

    public static final BusinessException EXCEPTION =
            new ImageUploadFailedException();

    private ImageUploadFailedException() { super(ErrorCode.IMAGE_UPLOAD_FAIL);}
}
