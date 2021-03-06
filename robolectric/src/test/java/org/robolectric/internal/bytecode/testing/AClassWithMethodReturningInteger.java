package org.robolectric.internal.bytecode.testing;

import org.robolectric.annotation.internal.Instrument;

@SuppressWarnings("UnusedDeclaration")
@Instrument
public class AClassWithMethodReturningInteger {
  public int normalMethodReturningInteger(int intArg) {
    return intArg + 1;
  }
}
