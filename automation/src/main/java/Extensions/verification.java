package Extensions;
import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

public class verification extends commonOps
{
    @Step("Verify text In Element")
    public static void textInElement(WebElement elem,String expctValue)
    {
        if(!Platform.equalsIgnoreCase("mobile")&& !Platform.equalsIgnoreCase("electron")&& !Platform.equalsIgnoreCase("desktop"))
        {
            wait.until(ExpectedConditions.visibilityOf(elem));
        }
        if(Platform.equalsIgnoreCase("desktop"))
        {
            assertEquals(elem.getText().replaceAll("Display is","").trim(),expctValue);

            System.out.println("The elem value "+elem.getText());
        }
        else
            assertEquals(elem.getText(),expctValue);

}


    @Step("Verify Cart Inventory Item Number")
    public static void testCartInventory(int cartNum,int expctNum)
    {
        assertEquals(cartNum,expctNum);
    }

    @Step ("Verify Element Visually")
    public static void visualElement(WebElement imageElement, String expectedImageName)
    {
        BufferedImage expectedImage=null;
        try
        {
            expectedImage= ImageIO.read(new File(getData("ImageRepo")+expectedImageName + ".png"));
        }
        catch(Exception e)
        {
            System.out.println("Error reading image file: "+e);
        }
        Screenshot imageScreenShot=new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, imageElement);
        BufferedImage actualImage=imageScreenShot.getImage();
        imgDiff=new ImageDiffer();
        diff=imgDiff.makeDiff(actualImage,expectedImage);
        assertFalse(diff.hasDiff(),"Images are not the same");

    }

//    @Step("Verify Steven Jokes Number")
//    public static void jokesNum(List<String> jokes , int expctNum)
//    {
//        assertEquals(jokes.size(),expctNum);
//
//        //printing only the jokes with Steven Seagal
//        for(String value:jokes)
//            System.out.println(value);
//    }

    @Step("Verify Students Number")
    public static void StudentsNum(List<String> students , int expctNum)
    {
        assertEquals(students.size(),expctNum);

        System.out.println("student list size: "+students.size());

        //printing only the names
        for(String name:students)
            System.out.println(name);
    }

    @Step("Verify Students record text")
    public static void text(String actualText , String expctedText)
    {
        assertEquals(actualText,expctedText);
    }

}
