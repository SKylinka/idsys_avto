package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.idsys.model.ZdpData;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

//����� �������� ��� ������ � ���
public class ZdpHelper extends HelperBase{

  //���������� ����������� �������� � �������� ��������� � ������������ ������ � ���
  public ZdpHelper(WebDriver wd) {
    super(wd);// ����������� � ������������ �������� ������
  }

  public void sumbitDoc() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div/div/div/div[2]/div/div[3]"));
  }

  public void fillINN(ZdpData zdpData) {

    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[3]/div/div[2]/div/div"));
    type(By.xpath("//*[contains(@class, 'v-textfield v-widget v-textfield-focus')]"), zdpData.getInn());
  }

  public void creationDoc() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]"));
  }

  public void timeout5sec() {

    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
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
    fillINN(new ZdpData().withInn("123456789000"));
    //��������������� ����� - ���� �� ������ "���������"
    sumbitDoc();
    //��������������� ����� - ���� �� ������ "�������".
    closeDoc();
  }

  public void copy(int index, ZdpData zdp) throws InterruptedException {
    //��������������� ����� - ��������� ����������(�������) �������
    selectDoc(index); //����� ��������
    //��������������� ����� - ���� �� ������ "������� c ������������"
    copy();
    TimeUnit.SECONDS.sleep(2);
    //��������������� ����� - ������� ���� ���
    clearINN();
    //��������������� ����� - ���� ������ ��� ����� ����������
    fillINN(zdp);
    //��������������� ����� - ���� �� ������ "���������"
    sumbitDoc();
    //��������������� ����� - ���� �� ������ �������� �����(�������)
    close();
  }

  public void delete(int index) throws InterruptedException {
    //��������������� ����� - ��������� ����������(�������) �������
    selectDoc(index); //����� ���������� �������� before - 1 - �������� ���������
    //��������������� ����� - ���� �� ������ "�������"
    selectDelete();
    //������������� ��������(������� ������ "��")
    comitDelete();
  }


  private void closeDoc() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div/div/div/div[2]/div/div[5]"));
  }


  public boolean isThereADoc() {
    return isElementPresent(By.xpath("//div[@id='bankclient-538598663']/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr/td/div"));
  }

  public int getDocCount() {
   return wd.findElements(By.xpath("//div[@id='bankclient-538598663']/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr")).size();
  }

  public void close() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div/div/div[2]"));
  }

  public void refreshPage() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]"));
  }



  //����� �������� ���������(������) �� �������� ���������� ������ � ����������
  public List<ZdpData> list() {
    List<ZdpData> zdps = new ArrayList<ZdpData>();  //�������� ������ � �������� ��� � ���������� zdps
    List<WebElement> elements = wd.findElements(By.xpath("//tr[@style]")); //tr[@style]//table[@class='v-table-table']/tbody/tr/td[1]/div
    /*
    ���� � �� ����� ����������� ���� ��� ���� ��� �� ������ ������ ���(��� ������� ���� ��������), ������� ��������� ��� ��������� � ����������(������ ��� ������)
     */
    for (WebElement element : elements) { //���� ��������� ��������� �� �����
      //String id = element.findElement(By.tagName("td")).getAttribute("id"); //��������� �������������� �� �������� + �������������� ��� � ���
      String inn = element.getText();
      zdps.add(new ZdpData().withInn(inn));
    }
    return zdps;
  }

  public void clearINN() throws InterruptedException {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[3]/div/div[2]/div/div"));
    clear(By.xpath("//*[contains(@class, 'v-textfield v-widget v-textfield-focus')]"));
  }
}
