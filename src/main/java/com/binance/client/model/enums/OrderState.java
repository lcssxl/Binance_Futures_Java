package com.binance.client.model.enums;

import com.binance.client.impl.utils.EnumLookup;

/**
 * SUBMITTED, PARTIALFILLED, CANCELLING. PARTIALCANCELED FILLED CANCELED CREATED
 */
// 订单状态
public enum OrderState {
  SUBMITTED("submitted"),
  CREATED("created"),
  PARTIALFILLED("partial-filled"),
  CANCELLING("cancelling"),
  PARTIALCANCELED("partial-canceled"),
  FILLED("filled"),       // 全部成交
  CANCELED("canceled");


  private final String code;

  OrderState(String code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return code;
  }

  private static final EnumLookup<OrderState> lookup = new EnumLookup<>(OrderState.class);

  public static OrderState lookup(String name) {
    return lookup.lookup(name);
  }
}
