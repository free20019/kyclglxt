//package tw.weblog;
//
//import java.util.Arrays;
//
//import javax.servlet.http.HttpServletRequest;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//@Aspect
//@Component
//@Slf4j
//public class WebLogAspect {
//
////    private Logger logger = Logger.getLogger(getClass());
//
//    @Pointcut("execution(public * tw.controllers.*.*(..))")
//    public void webLog(){}
//
//    @Before("webLog()")
//    public void doBefore(JoinPoint joinPoint) throws Throwable {
//        // 接收到请求，记录请求内容
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//        request.getSession().setAttribute("phone", "15157103602");
////        request.getSession().setAttribute("is_sh", "1");
//        System.out.println(request.getRequestURL());
//        // 记录下请求内容
//        log.info("URL : " + request.getRequestURL().toString());
////        logger.info("URL : " + request.getRequestURL().toString());
////        logger.info("HTTP_METHOD : " + request.getMethod());
////        logger.info("IP : " + request.getRemoteAddr());
////        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
////        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
//
//    }
//
//    @AfterReturning(returning = "ret", pointcut = "webLog()")
//    public void doAfterReturning(Object ret) throws Throwable {
//        // 处理完请求，返回内容
////        logger.info("RESPONSE : " + ret);
//    }
//
//}