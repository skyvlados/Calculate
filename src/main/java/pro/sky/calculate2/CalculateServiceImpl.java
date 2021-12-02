package pro.sky.calculate2;

import org.springframework.stereotype.Service;

//Service Calculate
@Service
public class CalculateServiceImpl implements CalculateService {
    private int sum;
    private int sub;
    private int mult;
    private float div;

    @Override
    public String answerHello() {
        return "Добро пожаловать в кальтулятор";
    }

    @Override
    public int plus(int num1, int num2) {
        sum=num1+num2;
        return sum;
    }
    @Override
    public int minus(int num1, int num2) {
        sub =num1-num2;
        return sub;
    }
    @Override
    public int multiply(int num1, int num2) {
        mult =num1*num2;
        return mult;
    }
    @Override
    public float divide(float num1, float num2) {
            div =num1/num2;
            return div;
    }
}
