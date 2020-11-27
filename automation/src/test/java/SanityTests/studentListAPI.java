package SanityTests;
import Extensions.verification;
import Utilities.commonOps;
import WorkFlows.WebFlows;
import WorkFlows.apiFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Event_Listeners.class)

public class studentListAPI extends commonOps
{
    @Test(description = "Test01: Get StudentList from server")
    @Description("Test Description: open server and get Students name list")
    public void test01_GetList() throws InterruptedException
    {
        verification.StudentsNum(apiFlows.getStudentsProperty("firstName"),100);

    }

    @Test(description = "Test02: Add Student record and verify it")
    @Description("Test Description: Add new Student record and verify it")
    public void test02_addStudent() throws InterruptedException
    {
        apiFlows.postStudent("Yoni","Cohen","Yoni@walla.com","Computer Science");
        verification.StudentsNum(apiFlows.getStudentsProperty("firstName"),101);

    }

    @Test(description = "Test03: Update Student record and verify it")
    @Description("Test Description: Update Student record and verify it")
    public void test03_updateStudent() throws InterruptedException
    {
        apiFlows.updateStudent("Yoni","Cohen","Yoni@walla.com","Medicine","102");
        verification.text(apiFlows.getStudentsRecord("[100].programme"),"Medicine");
    }

    @Test(description = "Test04: Delete Student record and verify it")
    @Description("Test Description: Delete Student new record and verify it")
    public void test04_deleteStudent() throws InterruptedException
    {
        apiFlows.deleteStudent("102");
        verification.StudentsNum(apiFlows.getStudentsProperty("firstName"),100);
    }
}
