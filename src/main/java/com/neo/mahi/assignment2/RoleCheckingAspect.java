package com.neo.mahi.assignment2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;

@Aspect
@Component

public class RoleCheckingAspect {

    @Pointcut("execution(* com.neo.mahi.assignment2..*(..))")
    public void rolecheck() {}

    @Around("rolecheck()")
    public Object external(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();


        Object[] args = joinPoint.getArgs();
        if (args.length > 0 && args[0] instanceof Role) {
            Role role = (Role) args[0];


            if ("admin".equalsIgnoreCase(role.getName())) {
                System.out.println("Enter "+methodName);
                System.out.println("Exit "+methodName);


            }
            else {
                System.out.println("You're not allowed to access this method. Only 'admin' role is permitted.");
                return   new RoleException("not allowed");
            }
        }

        Object obj =  joinPoint.proceed();

return obj;

    }
}
