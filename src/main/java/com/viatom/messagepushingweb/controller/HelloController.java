package com.viatom.messagepushingweb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: HelloController
 * @author: qiujiawei
 * @date: 2020/8/10 8:58
 */
@Api("测试接口")
@Controller
@RequestMapping("/testHello")
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello0() {
        return "Hello ,spring security!";
    }

    @RequestMapping("/info")
    @ResponseBody
    public String productInfo(){
        return " some product info ";
    }

    @RequestMapping("/home")
    @ResponseBody
    public String productInfo0(){
        return " admin home page ";
    }

    @ApiOperation(value = "测试model和thymeleaf")
    @GetMapping("/getHello")
    public String hello(Model model) {
        model.addAttribute("hello", "hello world!!!");
        return "hello";
    }

    @GetMapping("/getCharts")
    public String msgEcharts() {
        return "msgEcharts";
    }

    @GetMapping("/error")
    public String error() {
        int a = 1 / 0;
        return "error";
    }

    @GetMapping("/getChartJson")
    @ResponseBody
    public String getChart() {
        return "[{\"name\":1596038400000,\"value\":[1596038400000,53]},{\"name\":1596039040000,\"value\":[1596039040000,51]},{\"name\":1596039680000,\"value\":[1596039680000,51]}," +
                "{\"name\":1596040320000,\"value\":[1596040320000,51]},{\"name\":1596040832000,\"value\":[1596040832000,58]},{\"name\":1596041472000,\"value\":[1596041472000,67]}," +
                "{\"name\":1596042112000,\"value\":[1596042112000,68]},{\"name\":1596042624000,\"value\":[1596042624000,54]},{\"name\":1596043264000,\"value\":[1596043264000,51]}," +
                "{\"name\":1596043904000,\"value\":[1596043904000,57]},{\"name\":1596044416000,\"value\":[1596044416000,52]},{\"name\":1596045056000,\"value\":[1596045056000,54]}," +
                "{\"name\":1596045696000,\"value\":[1596045696000,51]},{\"name\":1596046208000,\"value\":[1596046208000,51]},{\"name\":1596046848000,\"value\":[1596046848000,52]}," +
                "{\"name\":1596047488000,\"value\":[1596047488000,51]},{\"name\":1596048000000,\"value\":[1596048000000,53]},{\"name\":1596048640000,\"value\":[1596048640000,52]}," +
                "{\"name\":1596049280000,\"value\":[1596049280000,67]},{\"name\":1596049920000,\"value\":[1596049920000,59]},{\"name\":1596050432000,\"value\":[1596050432000,58]}," +
                "{\"name\":1596051072000,\"value\":[1596051072000,52]},{\"name\":1596051712000,\"value\":[1596051712000,55]},{\"name\":1596052224000,\"value\":[1596052224000,53]}," +
                "{\"name\":1596052864000,\"value\":[1596052864000,54]},{\"name\":1596053504000,\"value\":[1596053504000,54]},{\"name\":1596054016000,\"value\":[1596054016000,54]}," +
                "{\"name\":1596054656000,\"value\":[1596054656000,52]},{\"name\":1596055296000,\"value\":[1596055296000,54]},{\"name\":1596055808000,\"value\":[1596055808000,65]}," +
                "{\"name\":1596056448000,\"value\":[1596056448000,59]},{\"name\":1596057088000,\"value\":[1596057088000,55]},{\"name\":1596057600000,\"value\":[1596057600000,53]}," +
                "{\"name\":1596058240000,\"value\":[1596058240000,55]},{\"name\":1596058880000,\"value\":[1596058880000,54]},{\"name\":1596059520000,\"value\":[1596059520000,55]}," +
                "{\"name\":1596060032000,\"value\":[1596060032000,64]},{\"name\":1596060672000,\"value\":[1596060672000,57]},{\"name\":1596061312000,\"value\":[1596061312000,56]}," +
                "{\"name\":1596061824000,\"value\":[1596061824000,55]},{\"name\":1596062464000,\"value\":[1596062464000,55]},{\"name\":1596063104000,\"value\":[1596063104000,55]}," +
                "{\"name\":1596063616000,\"value\":[1596063616000,58]},{\"name\":1596064256000,\"value\":[1596064256000,79]},{\"name\":1596064896000,\"value\":[1596064896000,60]}," +
                "{\"name\":1596065408000,\"value\":[1596065408000,63]},{\"name\":1596066048000,\"value\":[1596066048000,63]},{\"name\":1596066688000,\"value\":[1596066688000,82]}," +
                "{\"name\":1596067200000,\"value\":[1596067200000,81]},{\"name\":1596067840000,\"value\":[1596067840000,78]},{\"name\":1596068480000,\"value\":[1596068480000,78]}," +
                "{\"name\":1596069120000,\"value\":[1596069120000,65]},{\"name\":1596069632000,\"value\":[1596069632000,76]},{\"name\":1596070272000,\"value\":[1596070272000,80]}," +
                "{\"name\":1596070912000,\"value\":[1596070912000,78]},{\"name\":1596107040000,\"value\":[1596107040000,70]},{\"name\":1596124799000,\"value\":[1596124799000,0]}]";
    }

    @GetMapping("/getChartJson1")
    @ResponseBody
    public String getChart1() {
        return "[{\"name\":1596038400000,\"value\":[1596038400000,53]},{\"name\":1596039040000,\"value\":[1596039040000,51]},{\"name\":1596039680000,\"value\":[1596039680000,51]}," +
                "{\"name\":1596040320000,\"value\":[1596040320000,51]},{\"name\":1596040832000,\"value\":[1596040832000,58]},{\"name\":1596041472000,\"value\":[1596041472000,67]}," +
                "{\"name\":1596042112000,\"value\":[1596042112000,68]},{\"name\":1596042624000,\"value\":[1596042624000,54]},{\"name\":1596043264000,\"value\":[1596043264000,51]}," +
                "{\"name\":1596043904000,\"value\":[1596043904000,57]},{\"name\":1596044416000,\"value\":[1596044416000,52]},{\"name\":1596045056000,\"value\":[1596045056000,54]}," +
                "{\"name\":1596045696000,\"value\":[1596045696000,51]},{\"name\":1596046208000,\"value\":[1596046208000,51]},{\"name\":1596046848000,\"value\":[1596046848000,52]}," +
                "{\"name\":1596047488000,\"value\":[1596047488000,51]},{\"name\":1596048000000,\"value\":[1596048000000,53]},{\"name\":1596048640000,\"value\":[1596048640000,52]}," +
                "{\"name\":1596049280000,\"value\":[1596049280000,67]},{\"name\":1596049920000,\"value\":[1596049920000,59]},{\"name\":1596050432000,\"value\":[1596050432000,58]}," +
                "{\"name\":1596051072000,\"value\":[1596051072000,52]},{\"name\":1596051712000,\"value\":[1596051712000,55]},{\"name\":1596052224000,\"value\":[1596052224000,53]}," +
                "{\"name\":1596052864000,\"value\":[1596052864000,54]},{\"name\":1596053504000,\"value\":[1596053504000,54]},{\"name\":1596054016000,\"value\":[1596054016000,54]}," +
                "{\"name\":1596054656000,\"value\":[1596054656000,52]},{\"name\":1596055296000,\"value\":[1596055296000,54]},{\"name\":1596055808000,\"value\":[1596055808000,65]}," +
                "{\"name\":1596056448000,\"value\":[1596056448000,59]},{\"name\":1596057088000,\"value\":[1596057088000,55]},{\"name\":1596057600000,\"value\":[1596057600000,53]}," +
                "{\"name\":1596058240000,\"value\":[1596058240000,55]},{\"name\":1596058880000,\"value\":[1596058880000,54]},{\"name\":1596059520000,\"value\":[1596059520000,55]}," +
                "{\"name\":1596060032000,\"value\":[1596060032000,64]},{\"name\":1596060672000,\"value\":[1596060672000,57]},{\"name\":1596061312000,\"value\":[1596061312000,56]}," +
                "{\"name\":1596061824000,\"value\":[1596061824000,55]},{\"name\":1596062464000,\"value\":[1596062464000,55]},{\"name\":1596063104000,\"value\":[1596063104000,55]}," +
                "{\"name\":1596063616000,\"value\":[1596063616000,58]},{\"name\":1596064256000,\"value\":[1596064256000,79]},{\"name\":1596064896000,\"value\":[1596064896000,60]}," +
                "{\"name\":1596065408000,\"value\":[1596065408000,63]},{\"name\":1596066048000,\"value\":[1596066048000,63]},{\"name\":1596066688000,\"value\":[1596066688000,82]}," +
                "{\"name\":1596067200000,\"value\":[1596067200000,81]},{\"name\":1596067840000,\"value\":[1596067840000,78]},{\"name\":1596068480000,\"value\":[1596068480000,78]}," +
                "{\"name\":1596069120000,\"value\":[1596069120000,65]},{\"name\":1596069632000,\"value\":[1596069632000,76]},{\"name\":1596070272000,\"value\":[1596070272000,80]}," +
                "{\"name\":1596070912000,\"value\":[1596070912000,78]},{\"name\":1596107040000,\"value\":[1596107040000,70]}]";
    }
}
