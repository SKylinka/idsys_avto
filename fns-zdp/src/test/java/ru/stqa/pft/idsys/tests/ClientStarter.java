package ru.stqa.pft.idsys.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.LookupCustomersRqData;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0.LookupCustomersErr;

import java.io.IOException;


public class ClientStarter extends TestBase {

  @Test
  public void testClientStarter() throws  LookupCustomersErr {
    LookupCustomersRqData lookupCustomersRqData = new LookupCustomersRqData()
            .withCustomerDataType("FNS_RESTRICTION")
            .withInn("123456789000");
    app.soap().createLookupCustomersRq(lookupCustomersRqData);

  }
}
