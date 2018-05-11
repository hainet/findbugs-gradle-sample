package com.hainet.findbugs.gradle.sample;

public class BuggyOperation {

  public void run() {
    final String value = null;
    value.toString();
  }
}
