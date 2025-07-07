package com.calculator.bird;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
/**
 * Include in diff
 */
public class BirdApplication {

    public static String CONSTANT = "This should be final";
    
    private List<String> listField = new ArrayList<String>();

    @GetMapping("/")
    public String home() {
        return "Spring is here!";
    }

    @GetMapping("/test")
    public String test(String param) {
        if(param.equals("test"))
            return "Test successful";
        else {
            return "Test failed";
        }
    }

    private void unusedMethod() {
        System.out.println("This method is never called");
    }

    @GetMapping("/performance")
    public String performanceTest() {
        String result = "";
        for (int i = 0; i < 1000; i++) {
            result += "a";
        }
        return result;
    }

    public static void main(String[] args) {
        SpringApplication.run(BirdApplication.class, args);
    }

    // what's next?

}
