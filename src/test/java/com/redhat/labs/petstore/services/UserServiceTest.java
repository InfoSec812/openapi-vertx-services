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
 * UserService Test
 */
@RunWith(VertxUnitRunner.class)
public class UserServiceTest {

  @Rule
  public RunTestOnContext rule = new RunTestOnContext();

  UserService userService;

  @Before
  public void before(TestContext context) {
    Vertx vertx = rule.vertx();
    userService = UserService.create(vertx);
    //TODO add some test initialization code like security token retrieval
  }

  @After
  public void after(TestContext context) {
    //TODO add some test end code like session destroy
  }

  @Test
  public void createUserTest(TestContext context) {
    Async async = context.async(1);
    User body;

    // TODO set parameters for 201 response test
    body = null;
    userService.createUser(body, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(201, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });
  }

  @Test
  public void createUsersWithArrayInputTest(TestContext context) {
    Async async = context.async(1);
    List<User> body;

    // TODO set parameters for 201 response test
    body = null;
    userService.createUsersWithArrayInput(body, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(201, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });
  }

  @Test
  public void createUsersWithListInputTest(TestContext context) {
    Async async = context.async(1);
    List<User> body;

    // TODO set parameters for 201 response test
    body = null;
    userService.createUsersWithListInput(body, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(201, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });
  }

  @Test
  public void loginUserTest(TestContext context) {
    Async async = context.async(2);
    String username;
    String password;

    // TODO set parameters for 200 response test
    username = null;
    password = null;
    userService.loginUser(username, password, new OperationRequest(), ar -> {
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
    username = null;
    password = null;
    userService.loginUser(username, password, new OperationRequest(), ar -> {
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
  public void logoutUserTest(TestContext context) {
    Async async = context.async(1);

    // TODO set parameters for 200 response test
    userService.logoutUser(new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(200, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });
  }

  @Test
  public void getUserByNameTest(TestContext context) {
    Async async = context.async(3);
    String username;

    // TODO set parameters for 200 response test
    username = null;
    userService.getUserByName(username, new OperationRequest(), ar -> {
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
    username = null;
    userService.getUserByName(username, new OperationRequest(), ar -> {
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
    username = null;
    userService.getUserByName(username, new OperationRequest(), ar -> {
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
  public void updateUserTest(TestContext context) {
    Async async = context.async(3);
    String username;
    User body;

    // TODO set parameters for 202 response test
    username = null;
    body = null;
    userService.updateUser(username, body, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(202, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });

    // TODO set parameters for 400 response test
    username = null;
    body = null;
    userService.updateUser(username, body, new OperationRequest(), ar -> {
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
    username = null;
    body = null;
    userService.updateUser(username, body, new OperationRequest(), ar -> {
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
  public void deleteUserTest(TestContext context) {
    Async async = context.async(3);
    String username;

    // TODO set parameters for 204 response test
    username = null;
    userService.deleteUser(username, new OperationRequest(), ar -> {
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
    username = null;
    userService.deleteUser(username, new OperationRequest(), ar -> {
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
    username = null;
    userService.deleteUser(username, new OperationRequest(), ar -> {
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