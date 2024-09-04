package com.example.common.spi;


public interface SecurityPort {
    Long getCurrentUserId();

    String encodePassword(String password);

    Authority getCurrentUserAuthority();

    boolean isPasswordMatch(String rawPassword, String encodedPassword);

    Company getCurrentCompany();

    Student getCurrentStudent();

    Teacher getCurrentTeacher();

    User getCurrentUser();
}
