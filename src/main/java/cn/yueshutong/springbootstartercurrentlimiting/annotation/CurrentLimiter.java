package cn.yueshutong.springbootstartercurrentlimiting.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@Inherited
@Deprecated
public @interface CurrentLimiter {

    long QPS() default 20;

    long initialDelay() default 0;

    boolean failFast() default true;
}
