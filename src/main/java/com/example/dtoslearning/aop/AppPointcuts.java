//package com.example.dtoslearning.aop;
//
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class AppPointcuts {
//
//
//    @Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
//    public void controllerPointcut(){
//    }
//    @Pointcut("within(@org.springframework.stereotype.Service *)")
//    public void servicePointcut(){
//    }
//    @Pointcut("within(@org.springframework.stereotype.Repository *)")
//    public void repositoryPointcut(){
//    }
//
//    @Pointcut("execution(* com.example.dtoslearning..*(..))")
//    public void appPointcut(){
//
//    }
//
//    @Pointcut("appPointcut() && (controllerPointcut() || servicePointcut() || repositoryPointcut())")
//    public void mainPointcut(){
//
//    }
//}
