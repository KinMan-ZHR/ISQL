package org.GeekFuture.SqlBuilder;

/**
 * SQL,干货都在AbstractSQL里
 */
public class SQL extends AbstractSQL<SQL> {

  //fluent API
  @Override
  public SQL getSelf() {
    return this;
  }

}