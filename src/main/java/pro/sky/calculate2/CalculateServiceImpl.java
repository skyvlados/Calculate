package pro.sky.calculate2;

import org.springframework.stereotype.Service;

//Service Calculate
@Service
public class CalculateServiceImpl implements CalculateService {

    @Override
    public int plus(int num1, int num2) {
        return num1+num2;
    }
    @Override
    public int minus(int num1, int num2) {
        return num1-num2;
    }
    @Override
    public int multiply(int num1, int num2) {
        return num1*num2;
    }
    @Override
    public float divide(float num1, float num2) {
            return num1/num2;
    }
}
