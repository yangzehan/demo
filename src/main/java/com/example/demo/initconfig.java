package com.example.demo;


import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportRuntimeHints;

@Configuration(proxyBeanMethods = false)
@ImportRuntimeHints(initconfig.runtimehint.class)
public class initconfig {
    public static class runtimehint implements RuntimeHintsRegistrar {
        @Override
        public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
            hints.reflection().registerType(org.apache.xmlbeans.impl.store.Locale.class, MemberCategory.values());
            hints.reflection().registerType(org.apache.xmlbeans.impl.store.Path.class,MemberCategory.values());
            hints.reflection().registerType(org.apache.xmlbeans.impl.store.Query.class,MemberCategory.values());

            hints.resources().registerResourceBundle("org.apache.xmlbeans.impl.regex.message");
        }
    }
}
