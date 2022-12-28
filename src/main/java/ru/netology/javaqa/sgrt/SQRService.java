package ru.netology.javaqa.sgrt;

public class SQRService {

    public int calcSgr(int min, int max) { // параметры,через которые принимает данные
        int counter = 0; //объявляем счетчик
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                counter++;
            }
        }
        return counter;
    }
}
