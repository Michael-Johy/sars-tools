package org.example;

import org.openjdk.btrace.core.BTraceUtils;
import org.openjdk.btrace.core.annotations.BTrace;
import org.openjdk.btrace.core.annotations.OnMethod;
import org.openjdk.btrace.core.annotations.ProbeClassName;
import org.openjdk.btrace.core.annotations.ProbeMethodName;

@BTrace
public class Monitor {

    @OnMethod(clazz = "/com.ksyun.cdn.schedule.edge.network.ws.controller.EdgeNetworkConfigController/", method = "/.*/")
    public static void m(@ProbeClassName String clazzName, @ProbeMethodName String methodName){
        BTraceUtils.println(clazzName);
        BTraceUtils.println(methodName);
    }
}
