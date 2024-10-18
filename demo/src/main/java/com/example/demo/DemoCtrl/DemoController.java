package com.example.demo.DemoCtrl;

import com.example.demo.Model.UserInfo;
import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController("/")
public class DemoController {


    @GetMapping("/hello")
    public UserInfo helloWorld(){

        UserInfo info=new UserInfo();
        info.setId(1);
        info.setAddress("Dulla");
        info.setName("Syam");
        return info;
    }

   @PostMapping("/addUserDetails")
public ResponseEntity<String>   addUserDetails ( @Valid @RequestBody UserInfo info)
   {

       List<UserInfo> userDb=new LinkedList<UserInfo>();
       userDb.add(info);

       return ResponseEntity.ok("User Details Saved.");
   }



}
