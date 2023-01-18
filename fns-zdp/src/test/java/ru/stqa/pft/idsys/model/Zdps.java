package ru.stqa.pft.idsys.model;

import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


//����� ��� ������� ��������
public class Zdps extends ForwardingSet<ZdpData> {

  //���� ������������ ��� ��
  private Set<ZdpData> delegate;


  //����� ��������� �� ������������� ������� � �������� ���������
  public Zdps(Zdps zdps) {
    //������ ����� �������� ������� �������� ���� ����� �������� � ����������� � ����� ������
        this.delegate = new HashSet<>(zdps.delegate);
  }

  //����������� ��� ����������
  public Zdps() {
    this.delegate = new HashSet<>();
  }


  @Override
  protected Set<ZdpData> delegate() {
    return delegate;
  }

  //���������� � ������
  public Zdps withAdded(ZdpData zdp) {
    Zdps zdps = new Zdps(this);
    zdps.add(zdp);
    return zdps;
  }

  //�������� � ������
  public Zdps without(ZdpData zdp) {
    Zdps zdps = new Zdps(this);
    zdps.remove(zdp);
    return zdps;
  }


  //��������� ��������
  public Zdps(Collection<ZdpData> zdps) {
    this.delegate = new HashSet<>(zdps);
  }

}
