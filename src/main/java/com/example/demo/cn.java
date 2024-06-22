package com.example.demo;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/test")
public class cn {



    @RequestMapping(value = "/test2")
    public String test2()
    {
        System.out.println(EasyExcel.read("F:\\Users\\yangzehan\\IdeaProjects\\demoserver\\demo\\src\\main\\resources\\test.xlsx"
        ).doReadAllSync());
        return "test2";
    }
}
