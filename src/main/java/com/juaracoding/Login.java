package com.juaracoding;

public class Login {
    // loginTest
    public String loginCheck(String username, String password){
        if (username.equals("admin") && password.equals("P4ssw0rd")){
            return "Login berhasil";
        }else{
            return "Invalid login";
        }
    }

    // showLogo
    public boolean showLogo(String path){
        return path.equals("C:\\Pictures\\image.png");
    }

    // forgotPassword()
    // check username, newPassword, confirmPassword
    public String forgotPassword(String username, String newPassword, String confirmPassowrd){
        if(username.equals("admin")){
            if(newPassword.equals(confirmPassowrd)){
                return "Password berhasil diubah";
            }else{
                return "Password tidak sama";
            }
        }else{
            return "Username tidak terdaftar";
        }
    }

}
