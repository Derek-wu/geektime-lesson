package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.service.UserServiceImpl;
import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
@Path("/user")
public class UserLoginController implements PageController {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        return null;
    }

    @Path("/login")
    @POST
    public String login(HttpServletRequest request,HttpServletResponse response) throws Throwable {
        return "login-form.jsp";
    }
    @Path("")
    public String loginSuccess(HttpServletRequest request,HttpServletResponse response) throws Throwable {
        return "login-success.jsp";
    }
    @POST
    @Path("/doSignin")
    public String doSignin(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        UserService userService = new UserServiceImpl();
        String name = request.getParameter("username");
        String password = request.getParameter("pwd");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        User user = new User(name,password,email,phone);
        userService.register(user);
        return "register-success.jsp";
    }

}
