package com.binance.client.model.enums;

// 挂单有效方式
public enum  TimeInForce {
    GTC,    // 成交为止, 一直有效 - Good Till Cancel
    IOC,    // 无法立即成交(吃单)的部分就撤销 - Immediate or Cancel
    FOK,    // 无法全部立即成交就撤销 - Fill or Kill
    GTX,    // 无法成为挂单方就撤销 - Good Till Crossing
}
