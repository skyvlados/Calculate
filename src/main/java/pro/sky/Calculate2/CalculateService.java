package pro.sky.Calculate2;

import org.springframework.stereotype.Service;

//Service Calculate
@Service
public class CalculateService {
    public String answerHello() {
        return "Добро пожаловать в кальтулятор";
    }
    public String plus(int num1, int num2) {
        int sum;
        sum=num1+num2;
        return num1+"+"+num2+"="+sum;
    }
    public String minus(int num1, int num2) {
        int sub;
        sub =num1-num2;
        return num1+"-"+num2+"="+ sub;
    }

    public String multiply(int num1, int num2) {
        int mult;
        mult =num1*num2;
        return num1+"*"+num2+"="+ mult;
    }

    public String divide(float num1, float num2) {
        float div;
        if (num2 == 0) {
            return "Деление на нуль невозможно в этой программе!";
        } else {
            div =num1/num2;
            return num1+"/"+num2+"="+ div;
        }

    }
}
