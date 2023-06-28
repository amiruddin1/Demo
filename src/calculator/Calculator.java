package calculator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Calculator {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver cd = new ChromeDriver();
        cd.get("G:\\Study Material\\MCA-22MCA138\\Sem-2\\CA_870 SQA\\Assignment\\Leb Work\\SQA\\arthmetic.html");
        cd.manage().window().maximize();
        cd.findElement(By.name("first")).sendKeys("25");
        cd.findElement(By.name("second")).sendKeys("12");
        Thread.sleep(3000);
        cd.findElement(By.name("ADD")).click();
        Thread.sleep(3000);
        cd.switchTo().alert().accept();
        Thread.sleep(3000);
        cd.findElement(By.name("SUB")).click();
        Thread.sleep(3000);
        cd.switchTo().alert().accept();
        Thread.sleep(3000);
        cd.findElement(By.name("DIV")).click();
        Thread.sleep(3000);
        cd.switchTo().alert().accept();
        Thread.sleep(3000);
        cd.findElement(By.name("MUL")).click();
        Thread.sleep(3000);
        cd.switchTo().alert().accept();
        Thread.sleep(3000);
        cd.findElement(By.name("first")).clear();
        cd.findElement(By.name("second")).clear();
        Thread.sleep(3000);
        cd.findElement(By.name("MUL")).click();
        Thread.sleep(3000);
        cd.switchTo().alert().accept();
        Thread.sleep(3000);
        cd.close();
    }
    
}
