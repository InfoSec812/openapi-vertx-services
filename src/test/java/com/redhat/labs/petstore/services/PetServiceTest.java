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
 * PetService Test
 */
@RunWith(VertxUnitRunner.class)
public class PetServiceTest {

  @Rule
  public RunTestOnContext rule = new RunTestOnContext();

  PetService petService;

  @Before
  public void before(TestContext context) {
    Vertx vertx = rule.vertx();
    petService = PetService.create(vertx);
    //TODO add some test initialization code like security token retrieval
  }

  @After
  public void after(TestContext context) {
    //TODO add some test end code like session destroy
  }

  @Test
  public void updatePetTest(TestContext context) {
    Async async = context.async(4);
    Pet body;

    // TODO set parameters for 202 response test
    body = null;
    petService.updatePet(body, new OperationRequest(), ar -> {
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
    body = null;
    petService.updatePet(body, new OperationRequest(), ar -> {
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
    body = null;
    petService.updatePet(body, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(404, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });

    // TODO set parameters for 405 response test
    body = null;
    petService.updatePet(body, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(405, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });
  }

  @Test
  public void addPetTest(TestContext context) {
    Async async = context.async(2);
    Pet body;

    // TODO set parameters for 201 response test
    body = null;
    petService.addPet(body, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(201, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });

    // TODO set parameters for 405 response test
    body = null;
    petService.addPet(body, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(405, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });
  }

  @Test
  public void findPetsByStatusTest(TestContext context) {
    Async async = context.async(2);
    List<String> status;

    // TODO set parameters for 200 response test
    status = null;
    petService.findPetsByStatus(status, new OperationRequest(), ar -> {
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
    status = null;
    petService.findPetsByStatus(status, new OperationRequest(), ar -> {
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
  public void findPetsByTagsTest(TestContext context) {
    Async async = context.async(2);
    List<String> tags;

    // TODO set parameters for 200 response test
    tags = null;
    petService.findPetsByTags(tags, new OperationRequest(), ar -> {
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
    tags = null;
    petService.findPetsByTags(tags, new OperationRequest(), ar -> {
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
  public void getPetByIdTest(TestContext context) {
    Async async = context.async(3);
    Long petId;

    // TODO set parameters for 200 response test
    petId = null;
    petService.getPetById(petId, new OperationRequest(), ar -> {
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
    petId = null;
    petService.getPetById(petId, new OperationRequest(), ar -> {
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
    petId = null;
    petService.getPetById(petId, new OperationRequest(), ar -> {
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
  public void updatePetWithFormTest(TestContext context) {
    Async async = context.async(2);
    Long petId;

    // TODO set parameters for 201 response test
    petId = null;
    petService.updatePetWithForm(petId, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(201, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });

    // TODO set parameters for 405 response test
    petId = null;
    petService.updatePetWithForm(petId, new OperationRequest(), ar -> {
      if (ar.succeeded()) {
        OperationResponse result = ar.result();
        context.assertEquals(405, result.getStatusCode());
        //TODO add your asserts
      } else {
        context.fail("Operation failed with " + ar.cause().toString());
      }
      async.countDown();
    });
  }

  @Test
  public void deletePetTest(TestContext context) {
    Async async = context.async(3);
    Long petId;
    String apiKey;

    // TODO set parameters for 204 response test
    petId = null;
    apiKey = null;
    petService.deletePet(petId, apiKey, new OperationRequest(), ar -> {
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
    petId = null;
    apiKey = null;
    petService.deletePet(petId, apiKey, new OperationRequest(), ar -> {
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
    petId = null;
    apiKey = null;
    petService.deletePet(petId, apiKey, new OperationRequest(), ar -> {
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
  public void uploadFileTest(TestContext context) {
    Async async = context.async(1);
    Long petId;

    // TODO set parameters for 200 response test
    petId = null;
    petService.uploadFile(petId, new OperationRequest(), ar -> {
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
  public void getInventoryTest(TestContext context) {
    Async async = context.async(1);

    // TODO set parameters for 200 response test
    petService.getInventory(new OperationRequest(), ar -> {
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


}