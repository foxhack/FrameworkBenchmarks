package com.techempower.act.controller;

import act.controller.Controller;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.SessionFree;

import javax.inject.Singleton;

@Singleton
final class HelloController extends Controller.Util {

    private static final String HELLO_WORLD = "Hello, World!";

	@GetAction("/json")
    @SessionFree
    public void json() throws Exception {
        json(new Message("Hello, World!"));
    }

    @GetAction("/plaintext")
    @SessionFree
    public void plaintext() {
        text(HELLO_WORLD);
    }

    public static final class Message {

        private final String message;

        private Message(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

    }

}
