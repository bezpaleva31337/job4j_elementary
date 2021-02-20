package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        double inn = 180;
        double expectedd = 3;
        double outt = Converter.rubleToDollar(inn);
        Assert.assertEquals(expectedd, outt,0.01);
    }


}