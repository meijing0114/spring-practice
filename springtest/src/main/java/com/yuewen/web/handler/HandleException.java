package com.yuewen.web.handler;


import com.yuewen.web.ResultMessage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import javax.servlet.http.HttpServletRequest;

/**
 * 通用拦截错误，这里处理
 * Created by wangjun04 on 2018/5/24.
 */
@ControllerAdvice
public class HandleException {

    @ExceptionHandler(value = Exception.class)
    public ResultMessage defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ResultMessage<String> resultMessage = new ResultMessage<>();
        resultMessage.setCode(1);
        resultMessage.setMsg("fail");
        resultMessage.setData(null);
        return resultMessage;
    }
}
