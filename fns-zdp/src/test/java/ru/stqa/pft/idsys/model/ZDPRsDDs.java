package ru.stqa.pft.idsys.model;

import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ZDPRsDDs extends ForwardingSet<ZDPRsDecisionData> implements Models<ZDPRsDDs, ZDPRsDecisionData> {
  private Set<ZDPRsDecisionData> delegate;

  public ZDPRsDDs(Collection<ZDPRsDecisionData> responses){
    this.delegate = new HashSet<ZDPRsDecisionData>(responses);
  }

  public ZDPRsDDs(){
    this.delegate = new HashSet<ZDPRsDecisionData>();
  }

  @Override
  protected Set<ZDPRsDecisionData> delegate() {
    return delegate;
  }

  public ZDPRsDDs withAdded(ZDPRsDecisionData document){
    ZDPRsDDs responses = new ZDPRsDDs(this);
    responses.add(document);
    return responses;
  }

  public ZDPRsDDs without(ZDPRsDecisionData document){
    ZDPRsDDs responses = new ZDPRsDDs(this);
    responses.remove(document);
    return responses;
  }
}