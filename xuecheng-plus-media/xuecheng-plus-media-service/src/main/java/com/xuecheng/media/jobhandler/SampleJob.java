package com.xuecheng.media.jobhandler;

import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
 @Slf4j
public class SampleJob {
 /**
  * 1、简单任务示例（Bean模式）
  */
 @XxlJob("testJob111")
 public void testJob() throws Exception {
  log.info("开始执行.....");
  System.out.println("执行任务++++++++++++++++++++++++++++++++++++++++++++++++++");

 }

}