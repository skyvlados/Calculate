package pro.sky.Calculate2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Controller Calculate
@RestController
@RequestMapping("/calculator")
public class CalculateController {
    private final pro.sky.Calculate2.CalculateService calculateService;

    public CalculateController(pro.sky.Calculate2.CalculateService calculateService) {
        this.calculateService=calculateService;
    }
    @GetMapping(path="")
    public String answerHello() {
        return calculateService.answerHello();
    }
    @GetMapping(path="plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.plus(num1, num2);
    }

    @GetMapping(path="minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.minus(num1, num2);
    }
    @GetMapping(path="multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.multiply(num1, num2);
    }
    @GetMapping(path="divide")
    public String divide(@RequestParam("num1") float num1, @RequestParam("num2") float num2) {
        return calculateService.divide(num1, num2);
    }
}
