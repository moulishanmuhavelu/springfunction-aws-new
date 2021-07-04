package com.serverless.springfunction;

import org.springframework.stereotype.Component;
import java.util.function.Function;

@Component
public class SampleFunction implements Function<String, String> {

    @Override
    public String apply(String input) {
        return "Congrats. This is latest AWS Lambda function:" + input;
    }
}
