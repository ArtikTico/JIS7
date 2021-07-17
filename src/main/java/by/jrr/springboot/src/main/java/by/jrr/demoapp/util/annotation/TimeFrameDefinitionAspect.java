package by.jrr.demoapp.util.annotation;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Slf4j
public class TimeFrameDefinitionAspect {

    @SneakyThrows
    @Around("@annotation(by.jrr.demoapp.util.annotation.LogExecutorManagement)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) {
        log.info("EXECUTION METHOD " + joinPoint.getSignature().getName() + " in service " + joinPoint.getSignature().getDeclaringTypeName());
        var start = System.currentTimeMillis();

        var proceed = joinPoint.proceed();

        var executionTime = System.currentTimeMillis() - start;

        log.info(joinPoint.getSignature().getName());
        log.info("****** Time working method: " + executionTime + " ******");
        return proceed;
    }


    @Pointcut("execution(public * by.jrr.demoapp.creditcard.service.CreditCardService.*(..))")
    public void pointcutAfterReturning() {}

    @Pointcut("execution(public * by.jrr.demoapp.creditcard.service.converter.CreditCardEntityConverter.*(..))")
    public void pointcutAfterReturning2() {}

    @SneakyThrows
    @AfterReturning(pointcut = "pointcutAfterReturning() || pointcutAfterReturning2()", returning = "value")
    public Object makeAdditionalLogic(JoinPoint joinPoint,  Object value) {
        System.out.println(joinPoint.getSignature());
        Arrays.stream(joinPoint.getArgs()).forEach(System.out::println);
        System.out.println("WORKING ASPECT " + value.toString());
        return value;
    }


}
