package pl.globallogic.configuration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGConfigurationVerificationTest {

    @Test
    public void shouldAlwaysBeTrue(){
        //arrange
        int n1 = 4;
        int n2 = 4;
        //act
        n1 = n1 +10;
        //assert
        Assert.assertNotEquals(n1, n2);
    }
}
