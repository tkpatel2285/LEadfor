package lf;

import org.openqa.selenium.By;

public class LogInButton extends Utils
{

    HomePage hm = new HomePage();
    LoadProp loadProp = new LoadProp();
    By _username = By.id("UserName");
    By _password= By.id("Password");
    By _loginbuttonfinal = By.id("btnSubmit");
    By _logout = By.linkText("Log out");
    public void userDetail()
    {
        send_keys(_username,loadProp.getproperty("UserName"));
        send_keys(_password,loadProp.getproperty("Password"));
        click_Element(_loginbuttonfinal);
        String actualRegisterSuccessMessage = driver.findElement(By.id("portal-name")).getText();//expected result"Your registration completed"
        // actual result "Your registration completed"

        System.out.println(actualRegisterSuccessMessage);
       assert_element(actualRegisterSuccessMessage,"lfoptimise","Test case failed");
    }

    public void userLogOut(){
        click_Element(By.linkText("Log out"));
    }


}
