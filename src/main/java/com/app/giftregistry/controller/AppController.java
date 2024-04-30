package com.app.giftregistry.controller;

import com.app.giftregistry.model.GiftItem;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/testUrl")
    public ResponseEntity<String> testUrl() {
        return new ResponseEntity<>("Api is running!! /testUrl up", HttpStatus.OK);
    }
    //Input Add Url Details to DB
    @PostMapping("/addItem")
    public ResponseEntity<Void> addItem(@RequestBody GiftItem giftItem){
        //giftItem -> save it in DB and respond success else error
        System.out.println("Gift Item = "+giftItem.getName() +", "+giftItem.getId()+", "+giftItem.getPrice());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
