package com.charter.mc.mindui.resource;

import com.charter.mc.mindui.model.User;
import com.charter.mc.mindui.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(User user){
        return new UserResponse("Hi " + user.getName());
    }
}
