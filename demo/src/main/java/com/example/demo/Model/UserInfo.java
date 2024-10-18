package com.example.demo.Model;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
public class UserInfo {

    
    int id;
    @Pattern(regexp = "[a-zA-Z]+",message = "Invalid input for name")
    String name;
    @Pattern(regexp = "[a-zA-Z]+",message = "invalid input for address")
    String address;

}
