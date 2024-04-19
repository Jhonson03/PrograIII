package com.example.introspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IntroSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroSpringbootApplication.class, args);
    }

    @RequestMapping("/suma")
    public String suma(@RequestParam(defaultValue = "1") int sumando1,
            @RequestParam(defaultValue = "1") int sumando2) {
        int total = sumando1 + sumando2;
        return String.format("La suma total es: %d", total);
    }

    @RequestMapping("/resta")
    public String resta(@RequestParam(defaultValue = "8") int minuendo,
            @RequestParam(defaultValue = "6") int sustraendo) {
        int resultado = minuendo - sustraendo;
        return String.format("La resta total es: %d", resultado);
    }

    @RequestMapping("/multiplicacion")
    public String multiplicacion(@RequestParam(defaultValue = "5") int factor1,
            @RequestParam(defaultValue = "6") int factor2) {
        int resultado = factor1 * factor2;
        return String.format("La multiplicación total es: %d", resultado);
    }

    @RequestMapping("/division")
    public String division(@RequestParam(defaultValue = "16") int dividendo,
            @RequestParam(defaultValue = "4") int divisor) {
        if (divisor == 0) {
            return "No se puede dividir por cero.";
        }
        double resultado = (double) dividendo / divisor;
        return String.format("La división total es: %.2f", resultado);
    }
}
