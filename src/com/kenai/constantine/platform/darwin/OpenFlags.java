// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 16:15:19 -0800 2009
package com.kenai.constantine.platform.darwin;
public enum OpenFlags implements com.kenai.constantine.Constant {
O_RDONLY(0),
O_WRONLY(1),
O_RDWR(2),
O_ACCMODE(3),
O_NONBLOCK(4),
O_APPEND(8),
O_SYNC(128),
O_SHLOCK(16),
O_EXLOCK(32),
O_ASYNC(64),
O_FSYNC(128),
O_NOFOLLOW(256),
O_CREAT(512),
O_TRUNC(1024),
O_EXCL(2048),
O_EVTONLY(32768),
O_DIRECTORY(1048576),
O_SYMLINK(2097152);
private final int value;
private OpenFlags(int value) { this.value = value; }
public static final long MIN_VALUE = 0;
public static final long MAX_VALUE = 2097152;

public final int value() { return value; }
}
