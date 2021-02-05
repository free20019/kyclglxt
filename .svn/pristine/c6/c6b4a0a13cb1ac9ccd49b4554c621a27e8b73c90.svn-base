package tw.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tw.entity.BackMessage;
import tw.service.CommonService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: xianlehuang
 * @Description:
 * @date: 2020/12/15 - 10:48
 */

@Controller
@RequestMapping("/common")
@Slf4j
@Api(tags = "测试类")
public class CommonController {

    @Autowired
    CommonService commonService;

    @PostMapping("/test")
    @ResponseBody
    @ApiOperation(value = "测试")
    @ApiImplicitParams({
    })
    public BackMessage<Object> test(HttpServletRequest request) {
        return commonService.test();
    }

}
