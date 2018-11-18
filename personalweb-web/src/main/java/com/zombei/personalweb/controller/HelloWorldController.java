package com.zombei.personalweb.controller;


import com.zombei.personalweb.utils.MsgResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/zzb")
@PropertySource(value = {"classpath:application.properties"})
@RestController
public class HelloWorldController {

    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("common/begin");
        mv.addObject("resource", resource);
        return mv;
    }

    @RequestMapping("/test")
    public MsgResponse test() {
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);
        return MsgResponse.success().add("resource", bean);

    }
}
