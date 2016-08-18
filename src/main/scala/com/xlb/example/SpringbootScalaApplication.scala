package com.xlb.example

import org.springframework.boot.{CommandLineRunner, SpringApplication}
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
  *
  * @author xingliangbo
  * @version $Id: SpringbootScalaApplication, v 0.1 2016-08-17-下午8:02 xingliangbo Exp $
  */

object Application extends App {

  SpringApplication.run(classOf[SpringbootScalaApplication], args: _*)

}

@SpringBootApplication
class SpringbootScalaApplication extends CommandLineRunner {
  override def run(strings: String*): Unit = {
    println("springboot -scala 启动");
  }
}
