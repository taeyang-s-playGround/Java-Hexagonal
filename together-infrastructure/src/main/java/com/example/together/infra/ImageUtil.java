package com.example.together.infra;

import org.springframework.web.multipart.MultipartFile;

public interface ImageUtil {

    String uploadImage(MultipartFile image);

}
