import org.apache.commons.lang3.StringUtils;
import org.redrover.Nine.Utill;
import org.redrover.Nine.Worker;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HW11 {

    @Test
    public void testStringUtils(){
        Assert.assertEquals(StringUtils.capitalize(null), null);// с большойбуквы переделывает метод слово
        Assert.assertEquals(StringUtils.capitalize(" "), " ");
        Assert.assertEquals(StringUtils.capitalize("dog"), "Dog");
    }
    @Test
    public static void testUtill(){
        Worker[]worker = {
                new Worker("anna",123),
                new Worker("nick",456)
        };
        Assert.assertEquals(Utill.scanName( worker,"anna"),0);
        Assert.assertEquals(Utill.scanName( worker,"nick"),1);
        Assert.assertEquals(Utill.scanName( worker,"leo"),-1);

    }
    @Test
    public static void testUtill2(){
        Worker[]worker = {
                new Worker("anna",123),
                new Worker("nick klljkljlk",456)
        };
        Assert.assertEquals(Utill.lookIntoName( worker,"anna"),0);
        Assert.assertEquals(Utill.lookIntoName( worker,"nick"),1);
        Assert.assertEquals(Utill.lookIntoName( worker,"leo"),-1);

    }

}
