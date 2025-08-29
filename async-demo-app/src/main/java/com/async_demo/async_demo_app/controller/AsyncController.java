package com.async_demo.async_demo_app.controller;

import com.async_demo.async_demo_app.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class AsyncController {

    private static final Logger logger = LoggerFactory.getLogger(AsyncController.class);


    @Autowired
    private AsyncService asyncService;

    @GetMapping("/async-task")
    public CompletableFuture<String> triggerAsyncTask(@RequestParam String taskName){
        logger.info("Received request for task: {} ", taskName);
        return asyncService.performAsyncTask(taskName)
                .thenApply(result -> {
                    logger.info("Task result : {}", result);
                    return result;
                });
    }
}
