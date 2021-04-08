package com.example;

import com.salesforce.functions.jvm.sdk.Context;
import com.salesforce.functions.jvm.sdk.InvocationEvent;
import com.salesforce.functions.jvm.sdk.SalesforceFunction;

public class Function implements SalesforceFunction<Input, Output> {
  @Override
  public Output apply(InvocationEvent<Input> event, Context context) {
    return new Output(String.format("Hello %s!", event.getData().getName()));
  }
}
