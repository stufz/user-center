package fz.study.usercenter.model.domain.request;

import lombok.Data;

@Data
public class UserLoginRequest {
    private  String userAccount;

    private String userPassword;
}
