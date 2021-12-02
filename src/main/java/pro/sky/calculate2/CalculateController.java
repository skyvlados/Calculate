package pro.sky.calculate2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculateController {
    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }
    @GetMapping
    public String answerHello() {
        return calculateService.answerHello();
    }
    @GetMapping("plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1+"+"+num2+"="+calculateService.plus(num1, num2);
    }

    @GetMapping("minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1+"-"+num2+"="+calculateService.minus(num1, num2);
    }
    @GetMapping("multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1+"*"+num2+"="+calculateService.multiply(num1, num2);
    }
    @GetMapping("divide")
    public String divide(@RequestParam("num1") float num1, @RequestParam("num2") float num2) {
        if(num2==0){
            return "Деление на нуль невозможно в этой программе!";
        }else {
            return num1+"/"+num2+"="+calculateService.divide(num1, num2);
        }
    }
}
