package com.mangxiao.agent.sample;

import lombok.extern.slf4j.Slf4j;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;


@Slf4j(topic = "c.ClassFileTransformerImpl")
public class ClassFileTransformerImpl implements ClassFileTransformer {
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        log.debug("### access to ClassFileTransformerImpl #####");
        log.debug("### loading classes:" + className);
        return new byte[0];
    }
}
