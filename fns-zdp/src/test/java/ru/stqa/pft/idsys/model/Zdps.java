package ru.stqa.pft.idsys.model;

import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


//класс для методов проверки
public class Zdps extends ForwardingSet<ZdpData> {

  //кому делегируется это всё
  private Set<ZdpData> delegate;


  //берем множество из существующего объекта в качестве параметра
  public Zdps(Zdps zdps) {
    //строим новое множетво которое содержит теже самые элементы и присваиваем в новый объект
        this.delegate = new HashSet<>(zdps.delegate);
  }

  //конструктор без параметров
  public Zdps() {
    this.delegate = new HashSet<>();
  }


  @Override
  protected Set<ZdpData> delegate() {
    return delegate;
  }

  //добавление в список
  public Zdps withAdded(ZdpData zdp) {
    Zdps zdps = new Zdps(this);
    zdps.add(zdp);
    return zdps;
  }

  //удаление в список
  public Zdps without(ZdpData zdp) {
    Zdps zdps = new Zdps(this);
    zdps.remove(zdp);
    return zdps;
  }


  //коллекция объектов
  public Zdps(Collection<ZdpData> zdps) {
    this.delegate = new HashSet<>(zdps);
  }

}
