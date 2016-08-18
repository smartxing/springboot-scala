package com.xlb.example.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

/**
  *
  * @author xingliangbo
  * @version $Id: TestController, v 0.1 2016-08-17-下午8:07 xingliangbo Exp $
  */
@RestController
class TestController {

  @Autowired
  var env: Environment = _;

  @RequestMapping(value = Array("/helloword"), method = Array(RequestMethod.GET))
  def helloword(): String = {
    "helloword";
  }

  @RequestMapping(value = Array("/testp"), method = Array(RequestMethod.GET))
  def testproperties(): String = {
    env.getProperty("testscala");
  }

  @RequestMapping(value = Array("/test"), method = Array(RequestMethod.GET))
  def testList(): List[Int] = {
    val list =  List(1,2,3)
    list.foreach(_ => println(_))
    list
  }
}
