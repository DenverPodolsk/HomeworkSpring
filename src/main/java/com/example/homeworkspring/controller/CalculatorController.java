package com.example.homeworkspring.controller;
import com.example.homeworkspring.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.MemoryType;

@RestController
@RequestMapping("calculator")

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping(produces = MemoryType.TEXT_HTML_VALUE)
    public String greetings(){
        return "<h1>Добро пожаловать в калькулятор</h1>";

        @GetMapping("/plus")
                public String plus(@RequestParam( name = "num1",required = false)Integer a,
                                   @RequestParam(name ="num2",required = false)Integer b){
            if(a==null || b == null;){
                return "Какой-то из параметров не передан";
            }
            return buildResultString(a,b,"+",calculatorService.plus(a,b);
        }

        }
        @GetMapping("/minus")
        public String minus(@RequestParam( name = "num1",required = false)Integer a,
                @RequestParam(name ="num2",required = false)Integer b){
            if(a==null || b == null;){
                return "Какой-то из параметров не передан";
            }
            return buildResultString(a,b,"-", calculatorService.minus(a,b));
        }
            @GetMapping("/multiply")
            public String multiply(@RequestParam( name = "num1",required = false)Integer a,
                    @RequestParam(name ="num2",required = false)Integer b){
                if(a==null || b == null;){
                    return "Какой-то из параметров не передан";
                }
                return buildResultString(a,b,"*",calculatorService.multiply(a,b));

        }
                @GetMapping("/divide")
                public String divide(@RequestParam( name = "num1",required = false)Integer a,
                        @RequestParam(name ="num2",required = false)Integer b){
        if (b==0){
            return "Делить на 0 нельзя";
        }
                    return buildResultString(a,b, "/", calculatorService.divide(a,b));




    }
    private String buildResultString(int a,int b,String operation,Number result){
        return String.format("%d %s %d = %f",a,operation,b,result);

    }

}
