package ru.stqa.pft.idsys.appmanager;

import javaeetutorial.helloservice.endpoint.HelloService;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0.LookupCustomersRq;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0.LookupCustomersRs;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

public class oldSOAPhelper {

  @WebServiceRef(wsdlLocation =
          "http://192.168.1.211:8080/bank_client/service/idbank_customers?wsdl")
  private idbank_customers service;

  protected void processRequest(LookupCustomersRq request,
                                LookupCustomersRs response)
          throws  IOException {
    response.getCustomersData("text/html;charset=UTF-8");
    try (PrintWriter out = response.getCustomersData()) {

      out.println("<html lang=\"en\">");
      out.println("<head>");
      out.println("<title>Servlet HelloServlet</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>Servlet HelloServlet at " +
              request.getClass () + "</h1>");
      out.println("<p>" + sayHello("world") + "</p>");
      out.println("</body>");
      out.println("</html>");
    }
  }


  private String sayHello(java.lang.String arg0) {
    javaeetutorial.helloservice.endpoint.Hello port =
            service.getHelloPort();
    return port.sayHello(arg0);
  }

}
