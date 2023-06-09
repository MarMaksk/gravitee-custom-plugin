package ru.local.custom;

import io.gravitee.gateway.api.ExecutionContext;
import io.gravitee.gateway.api.Request;
import io.gravitee.gateway.api.Response;
import io.gravitee.policy.api.PolicyChain;
import io.gravitee.policy.api.annotations.OnRequest;
import io.gravitee.policy.api.annotations.OnResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomPlugin {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomPlugin.class);
    private static final String LOG_MESSAGE = "CUSTOM PLUGIN";

    public CustomPlugin() {
    }


    @OnRequest
    public void onRequest(Request request, Response response, ExecutionContext executionContext, PolicyChain policyChain) {
        LOGGER.info(LOG_MESSAGE);
        policyChain.doNext(request, response);
    }

    @OnResponse
    public void onResponse(Request request, Response response, ExecutionContext executionContext, PolicyChain policyChain) {
        LOGGER.info(LOG_MESSAGE);
        policyChain.doNext(request, response);
    }
}
