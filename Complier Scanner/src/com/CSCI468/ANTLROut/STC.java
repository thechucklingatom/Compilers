package com.CSCI468.ANTLROut;

public class STC extends Object {


  String type;  // type,in this expample there only is one type==> Int.
  String value; // value, the value in here is a string not a integer value.
  String scope; // scope, the current position within the program a variable is located.

  public STC(String itype, String ivalue, String iscope) {
    type=itype;
    value=ivalue;
    scope=iscope;

  }
  
  @Override
  public String toString(){
      return "type=" + type + " value=" + value + " scope=" + scope;
  }
  
  public String getType(){
      return type;
  }
}