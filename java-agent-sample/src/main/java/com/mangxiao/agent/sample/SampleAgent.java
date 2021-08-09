package com.mangxiao.agent.sample;

import lombok.extern.slf4j.Slf4j;

import java.lang.instrument.Instrumentation;

/**
 * @description:Java agent sample
 * @author:mangxiao2018@126.com
 * @date:2021-8-8
 */
@Slf4j(topic = "c.SampleAgent")
public class SampleAgent {

    public static void premain(String agentOps, Instrumentation inst){
        log.debug("#### premain ####");
        logic(inst);
    }

    public static void agentmain(String agentOps, Instrumentation inst){
        log.debug("#### agentmain ###");
        logic(inst);
    }

    private static void logic(Instrumentation inst){
        inst.addTransformer(new ClassFileTransformerImpl());
        Class[] classes = inst.getAllLoadedClasses();
        for (Class c : classes){
            log.debug("###" + c.getName() + "###");
        }
    }
}
