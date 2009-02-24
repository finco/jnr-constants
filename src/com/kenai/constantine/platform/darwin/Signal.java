// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 16:15:20 -0800 2009
package com.kenai.constantine.platform.darwin;
public enum Signal implements com.kenai.constantine.Constant {
SIGHUP(1),
SIGINT(2),
SIGQUIT(3),
SIGILL(4),
SIGTRAP(5),
SIGABRT(6),
SIGIOT(6),
SIGBUS(10),
SIGFPE(8),
SIGKILL(9),
SIGUSR1(30),
SIGSEGV(11),
SIGUSR2(31),
SIGPIPE(13),
SIGALRM(14),
SIGTERM(15),
// SIGSTKFLT not defined
// SIGCLD not defined
SIGCHLD(20),
SIGCONT(19),
SIGSTOP(17),
SIGTSTP(18),
SIGTTIN(21),
SIGTTOU(22),
SIGURG(16),
SIGXCPU(24),
SIGXFSZ(25),
SIGVTALRM(26),
SIGPROF(27),
SIGWINCH(28),
// SIGPOLL not defined
SIGIO(23),
// SIGPWR not defined
SIGSYS(12),
// SIGUNUSED not defined
// SIGRTMIN not defined
// SIGRTMAX not defined
NSIG(32);
private final int value;
private Signal(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 32;

public final int value() { return value; }
}
