package com.jcompiler.state;

/**
 * Created by cassandra on 4/4/14.
 */
public class CompilerThreadLocal {
    private static final ThreadLocal<StateTracker> ruleTraversalContext = new ThreadLocal<StateTracker>();
    private Object mutex = new Object();

    class StateTracker {

    }
}
