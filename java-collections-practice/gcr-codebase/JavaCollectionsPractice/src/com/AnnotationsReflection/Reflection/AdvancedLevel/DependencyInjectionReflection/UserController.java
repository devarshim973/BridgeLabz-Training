package com.AnnotationsReflection.Reflection.AdvancedLevel.DependencyInjectionReflection;


public class UserController {

    @Inject
    private MessageService messageService; // dependency

    public void process() {
        messageService.sendMessage("Hello from UserController!");
    }
}
