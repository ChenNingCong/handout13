package com.example.handout13.controller;

import jakarta.websocket.OnClose;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Obj {
    public List<Integer> a;
    public Obj(List<Integer> a) {
        this.a = a;
    }
}

@RestController
@RequestMapping("api/v1/")
public class CityController {
    // responds to get requests at "/hello"
    @GetMapping("city")
    public Obj getCity() {
        return new Obj(Arrays.asList(5,6));
    }
    @GetMapping("city/{id}")
    public Obj getCity(@PathVariable int id) {
        List l;
        if (id == 1) {
            l = Arrays.asList(1, 2);
        } else if (id == 2) {
            l = Arrays.asList(0);
        }
        else {
            l = List.of();
        }
        Obj obj = new Obj(l);
        return obj;
    }
}
