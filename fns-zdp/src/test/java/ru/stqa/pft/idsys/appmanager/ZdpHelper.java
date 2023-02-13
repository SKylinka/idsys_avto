package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;

//����� �������� ��� ������ � ���
public class ZdpHelper extends HelperBase{

  //���������� ����������� �������� � �������� ��������� � ������������ ������ � ���
  public ZdpHelper(WebDriver wd) {
    super(wd);// ����������� � ������������ �������� ������
  }

  public void sumbitDoc() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div/div/div/div[2]/div/div[3]"));
  }

  public void fillINN(ZdpData zdpData) {

    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[3]/div/div[2]/div/div"));
    type(By.xpath("//*[contains(@class, 'v-textfield v-widget v-textfield-focus')]"), zdpData.getInn());
  }

  public void creationDoc() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]"));
  }

  public void timeout() {

    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
  }

  public void comitDelete() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//span[text()='��']/../../../div"));
  }

  public void selectDelete() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[5]"));
  }

  //
  public void selectDoc(int index) {
    wd.findElements(By.xpath("//table[@class='v-table-table']/tbody/tr")).get(index).click();
  }

  public void selectDocRight() {
    clickR(By.xpath("//div[@id='bankclient-538598663']/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr/td/div"));
  }

  public void sendDoc() {
    click(By.xpath("//*[@id='bankclient-538598663-overlays']/div[2]/div/div/div/div[2]"));
  }

  public void fillBik() {
    click(By.xpath("//*[contains(@class, 'vn-reference-button v-widget')]"));
  }

  public void complite() {
    click(By.xpath("//span[text()='�������']/../../../div"));
  }

  public void selectBik() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[1]"));
  }

  public void copy() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[3]"));
  }

  public void create(ZdpData zdpData) throws InterruptedException {
    //��������������� ����� - ���� �� ������ "�������"
    creationDoc();
    //�������
    TimeUnit.SECONDS.sleep(2);
    //��������������� ����� - ���� �� ������ ������ "���"
    fillBik();
    //��������������� ����� - ��������� ����������(�������) �������
    selectBik();
    //��������������� ����� - ���� �� ������ "�������"
    complite();
    //��������������� ����� - ���� �� ������ "���" � ���� "���"
    fillINN(zdpData);
    //��������������� ����� - ���� �� ������ "���������" + �������� �� ����������� ����
    sumbitDoc();
    if (isElementPresent(By.xpath("//span[text()='OK']/../../../div"))) {
      //��������������� ����� - ���� �� ������ ��
      pressOk();
      //��������������� ����� - ���� �� ������ �������� �����(�������)
      close();
      //��������������� ����� - ���� �� ������ ���
      pressNo();
    } else {
      //��������������� ����� - ���� �� ������ "�������".
      closeDoc();
    }
    zdpCache = null;
  }




  public void copy(int index, ZdpData zdp) throws InterruptedException {
    //��������������� ����� - ��������� ����������(�������) �������
    selectDoc(index); //����� ��������
    //��������������� ����� - ���� �� ������ "������� c ������������"
    copy();
    TimeUnit.SECONDS.sleep(2);
    //������� �������� ��� � ���������� zdp ������ ��������
    if (zdp != null) {
      //��������������� ����� - ������� ���� ���
      clearINN();
      //��������������� ����� - ���� ������ ��� ����� ����������
      fillINN(zdp);
    }
    //��������������� ����� - ���� �� ������ "���������"
    sumbitDoc();
    //��������������� ����� - ���� �� ������ �������� �����(�������)
    close();
    zdpCache = null;
  }

  public void modify(int index, ZdpData zdp) throws InterruptedException {
    //��������������� ����� - ��������� ����������(�������) �������
    selectDoc(index); //����� ��������
    //��������������� ����� - ���� �� ������ "�������������"
    modification();
    TimeUnit.SECONDS.sleep(1);
    //������� �������� ��� � ���������� zdp ������ ��������
    if (zdp != null) {
      //��������������� ����� - ������ ������ "�������������
      modifyDoc();
      //��������������� ����� - ������� ���� ���
      clearINN();
      //��������������� ����� - ���� ������ ��� ����� ����������
      fillINN(zdp);
    }
    //��������������� ����� - ���� �� ������ "���������"
    sumbitDoc();
    //��������������� ����� - ���� �� ������ �������� �����(�������)
    close();
    zdpCache = null;
  }

  private void modifyDoc() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//span[text()='�������������']/../../../div"));
  }

  //����� ��������� �������� ������ �� ��������������
  public String getNameButton(String button) throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    List<WebElement> elements = wd.findElements(By.xpath("//div[@class='vn-s-button v-widget']"));
    for (WebElement element : elements) {
      String buttonName = element.getAttribute("id");
      int index1 = buttonName.indexOf(button); //����� �� ��������, ���� ������� �� ���������� ����� � �������, ����� ���������� 0
      if (index1 == 0) {
       return buttonName;
      }
    }
    return null;
  }

  //����� ������� �� ������, �������� �������� ������ � ���������� %s
  private void modification() throws InterruptedException {
    click(By.xpath(String.format("//div[@id='%s']", getNameButton("BTN-FRAME-EDIT"))));
  }

  public void delete(int index) throws InterruptedException {
    //��������������� ����� - ��������� ����������(�������) �������
    selectDoc(index); //����� ���������� �������� before - 1 - �������� ���������
    //��������������� ����� - ���� �� ������ "�������"
    selectDelete();
    //������������� ��������(������� ������ "��")
    comitDelete();
    zdpCache = null;
  }


  public void pressOk() {
    click(By.xpath("//span[text()='OK']/../../../div"));
  }

  private void pressNo() {
    click(By.xpath("//span[text()='���']/../../../div"));
  }

  private void closeDoc() {
    click(By.xpath("//span[text()='�������']/../../../div"));
  }


  public boolean isThereADoc() {
    return isElementPresent(By.xpath("//div[@id='bankclient-538598663']/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr/td/div"));
  }

  public int count() {
   return wd.findElements(By.xpath("//div[@id='bankclient-538598663']/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr")).size();
  }

  public void close() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div/div/div[2]"));
  }

  public void refreshPage() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]"));
  }



  //����� �������� ���������(������) �� �������� ���������� ������ � ����������
  public List<ZdpData> list() {
    List<ZdpData> zdps = new ArrayList<ZdpData>();  //�������� ������ � �������� ��� � ���������� zdps
    List<WebElement> elements = wd.findElements(By.xpath("//tr[@style]")); //tr[@style] //table[@class='v-table-table']/tbody/tr/td[2]/div
    /*
    ���� � �� ����� ����������� ���� ��� ���� ��� �� ������ ������ ���(��� ������� ���� ��������), ������� ��������� ��� ��������� � ����������(������ ��� ������)
     */
    for (WebElement element : elements) { //���� ��������� ��������� �� �����
      //String id = element.findElement(By.tagName("td")).getAttribute("id"); //��������� �������������� �� �������� + �������������� ��� � ���
      //String id = wd.findElement(By.xpath(String.format("//table[@class='v-table-table']/tbody/tr/..//td[1]")))
      String inn = element.getText();
      zdps.add(new ZdpData().withInn(inn));
    }
    return zdps;
  }

  public void clearINN() throws InterruptedException {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[3]/div/div[2]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    clear(By.xpath("//*[contains(@class, 'v-textfield v-widget v-textfield-focus')]"));
  }

  //���
  private Zdps zdpCache = null;

  public Zdps all() {
    if (zdpCache != null) {
      return new Zdps(zdpCache);
    }
   //����� �������� ���������(������) �� �������� ���������� ������ � ���������� ����� ������(hamcrest)
    zdpCache = new Zdps();
    List<WebElement> elements = wd.findElements(By.xpath("//table[@class='v-table-table']/tbody/tr"));
    for (WebElement element : elements) {
      Long id = Long.parseLong(element.findElement(By.xpath("td[1]")).getText());
      String inn = element.findElement(By.xpath("td[2]")).getText();
      zdpCache.add(new ZdpData().withId(id).withInn(inn));
    }
    return new Zdps(zdpCache);
  }

  //����� ������� �� ������, �������� �������� ������ � ���������� %s
  public void clearFilter() throws InterruptedException {
    click(By.xpath(String.format("//div[@id='%s']", getNameButton("BTN-FRAME-CLEAR_FILTER"))));
  }

  //����� ������ ������� ������ "�����"
  public void changeStatusFilter() throws InterruptedException {
    click(By.xpath(String.format("//div[@id='%s']", getNameButtonAll("REF-[IN]DOCSTATUS_CAPTION"))));
    click(By.xpath("//div[text()='�����']/../div"));
    complite();
    //click(By.xpath("//span[text()='�������']/../../../div"));
    click(By.xpath("//span[text()='���������']/../../../div"));

  }

  //����� ��������� �������� ������ �� ��������������(������������ �� �� ������ ������)
  public String getNameButtonAll(String button) throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    List<WebElement> elements = wd.findElements(By.xpath("//div[@role='button']"));
    for (WebElement element : elements) {
      String buttonName = element.getAttribute("id");
      int index1 = buttonName.indexOf(button); //����� �� ��������, ���� ������� �� ���������� ����� � �������, ����� ���������� 0
      if (index1 == 0) {
        return buttonName;
      }
    }
    return null;
  }

  //����� ��������� �������� ������ ������� ����
  public String getNameButtonFilterDate(String button) throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    List<WebElement> elements = wd.findElements(By.xpath("//*[contains(@class, 'v-datefield v-datefield-popupcalendar v-widget v-datefield-full')]"));
    for (WebElement element : elements) {
      String buttonName = element.getAttribute("id");
      int index1 = buttonName.indexOf(button); //����� �� ��������, ���� ������� �� ���������� ����� � �������, ����� ���������� 0
      if (index1 == 0) {
        return buttonName;
      }
    }
    return null;
  }

  //����� ��������� �������� �������� � �������������� ��� � ����������� ����� ��� �������
  public String currentDate() throws ParseException {
    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    return String.format(dateTime.format(formatter));
  }


  //����� ������ ������� ���� � ����� �������� � - ��
  public void changeCreateDateFilter() throws InterruptedException, ParseException {
    click(By.xpath(String.format("//div[@id='%s']", getNameButtonFilterDate("FILTER-[>=]CREATE_DATE"))));
    type(By.xpath(String.format("//div[@id='%s']//input", getNameButtonFilterDate("FILTER-[>=]CREATE_DATE"))),"30.06.2019 00:00:00");
    click(By.xpath(String.format("//div[@id='%s']", getNameButtonFilterDate("FILTER-[<=]CREATE_DATE"))));
    type(By.xpath(String.format("//div[@id='%s']//input", getNameButtonFilterDate("FILTER-[<=]CREATE_DATE"))),currentDate());
    click(By.xpath("//span[text()='���������']/../../../div"));
  }

  //����� ��������� �������� ������ ������� ����
  public String getNameButtonInn(String button) throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    List<WebElement> elements = wd.findElements(By.xpath("//div[@class='v-slot']//input"));
    for (WebElement element : elements) {
      String buttonName = element.getAttribute("id");
      int index1 = buttonName.indexOf(button); //����� �� ��������, ���� ������� �� ���������� ����� � �������, ����� ���������� 0
      if (index1 == 0) {
        return buttonName;
      }
    }
    return null;
  }



  //����� ������ ������� � ��������� ���
  public void changeInn(String inn) throws InterruptedException {
    click(By.xpath(String.format("//*[@id='%s']", getNameButtonInn("FILTER-[LIKE]INN"))));
    type(By.xpath(String.format("//*[@id='%s']", getNameButtonInn("FILTER-[LIKE]INN"))),inn);
    click(By.xpath("//span[text()='���������']/../../../div"));
    TimeUnit.SECONDS.sleep(1);
  }
}
