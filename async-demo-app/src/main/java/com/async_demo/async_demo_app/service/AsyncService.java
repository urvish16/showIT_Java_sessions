package com.async_demo.async_demo_app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {

    private static final Logger logger = LoggerFactory.getLogger(AsyncService.class);

    @Async("asyncExecutor")
    public CompletableFuture<String> performAsyncTask(String taskName){

        logger.info("Statrting async task : {} on thread : {} ", taskName, Thread.currentThread().getName());

        try{
            // long running task
            Thread.sleep(2000);
        }
        catch (InterruptedException ie){
            logger.error("Task interrupted : ", ie);
            Thread.currentThread().interrupt();
        }
        String result = "Completed : "+taskName;
        logger.info("Finished async task : {} ", taskName);
        return CompletableFuture.completedFuture(result);
    }
}
