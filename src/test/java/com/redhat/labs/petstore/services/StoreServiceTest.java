package com.redhat.labs.petstore.services;

import io.vertx.core.Vertx;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.ext.web.api.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Map;

import com.redhat.labs.petstore.models.*;

/**
 * StoreService Test
 */
@RunWith(VertxUnitRunner.class)
public class StoreServiceTest {

  @Rule
  public RunTestOnContext rule = new RunTestOnContext();

  StoreService storeService;

  @Before
  public void before(TestContext context) {
    Vertx vertx = rule.vertx();
    storeService = StoreService.create(vertx);
    //TODO add some test initialization code like security token retrieval
  }

  @After
  public void after(TestContext context) {
    //TODO add some test end code like session destroy
  }

  @Test
  public void placeOrderTest(TestContext context) {
    Async async = context.async(2);
    Order body;

    // TODO set parameters for 200 response test
    body = null;
    storeService.placeOrder(body, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(200, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });

    // TODO set parameters for 400 response test
    body = null;
    storeService.placeOrder(body, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(400, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });
  }

  @Test
  public void getOrderByIdTest(TestContext context) {
    Async async = context.async(3);
    Long orderId;

    // TODO set parameters for 200 response test
    orderId = null;
    storeService.getOrderById(orderId, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(200, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });

    // TODO set parameters for 400 response test
    orderId = null;
    storeService.getOrderById(orderId, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(400, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });

    // TODO set parameters for 404 response test
    orderId = null;
    storeService.getOrderById(orderId, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(404, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });
  }

  @Test
  public void deleteOrderTest(TestContext context) {
    Async async = context.async(3);
    Long orderId;

    // TODO set parameters for 204 response test
    orderId = null;
    storeService.deleteOrder(orderId, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(204, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });

    // TODO set parameters for 400 response test
    orderId = null;
    storeService.deleteOrder(orderId, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(400, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });

    // TODO set parameters for 404 response test
    orderId = null;
    storeService.deleteOrder(orderId, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(404, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });
  }


}