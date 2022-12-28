package ru.netology.javaqa.sgrt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/sgr.csv")
    public void shouldCalcExact(int expected, int min, int max) {
        SQRService service = new SQRService(); // создаем объект сервиса

        int actual = service.calcSgr(min, max);
        Assertions.assertEquals(expected, actual);
    }
}



