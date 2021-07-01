package com.binance.client.model.enums;

import com.binance.client.impl.utils.EnumLookup;

/**
 * buy-market, sell-market, buy-limit, buy-ioc, sell-ioc,
 * buy-limit-maker, sell-limit-maker, buy-stop-limit, sell-stop-limit.
 */
// 订单类型
public enum OrderType {
    LIMIT("LIMIT"),     // 限价单
    MARKET("MARKET"),   // 市价单

    STOP("STOP"),       // 止损单
    STOP_MARKET("STOP_MARKET"),     // 止损市价单
    TRAILING_STOP_MARKET("TRAILING_STOP_MARKET"),   //跟踪止损市价单

    TAKE_PROFIT("TAKE_PROFIT"),     // 止盈单
    TAKE_PROFIT_MARKET("TAKE_PROFIT_MARKET"),       // 止盈市价单

    INVALID(null);

  private final String code;

  OrderType(String code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return code;
  }

  private static final EnumLookup<OrderType> lookup = new EnumLookup<>(OrderType.class);

  public static OrderType lookup(String name) {
    return lookup.lookup(name);
  }

}
