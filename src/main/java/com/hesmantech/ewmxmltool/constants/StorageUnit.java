package com.hesmantech.ewmxmltool.constants;

public enum StorageUnit {
    KB(1024),
    MB(1024 * KB.byteValue);

    private final long byteValue;

    StorageUnit(long byteValue) {
        this.byteValue = byteValue;
    }

    public long getByteValue() {
        return byteValue;
    }
}
