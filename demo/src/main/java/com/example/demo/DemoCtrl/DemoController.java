package com.example.demo.DemoCtrl;

import com.example.demo.Model.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class DemoController {


    @GetMapping("/hello")
    public UserInfo helloWorld(){
        //System.out.println("Calling inside ");

        UserInfo info=new UserInfo();
        info.setAddress("Dulla");
        info.setName("Syam");
        return info;
    }



}
