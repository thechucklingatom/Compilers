package com.CSCI468.ANTLROut;

public class STC extends Object {


  String type;  // type,in this expample there only is one type==> Int.
  String value; // value, the value in here is a string not a integer value.

  public STC(String itype, String ivalue) {
    type=itype;
    value=ivalue;

  }
  
  public String toString(){
      return "type=" + type + " value=" + value;
  }
}