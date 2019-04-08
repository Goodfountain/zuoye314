package com.rcnjtech.action;

import java.io.*;
import java.util.*;
import javax.servlet.http.*;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.ServletActionContext;


import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;



public class JsonAction01 {

    public String testShpService(){
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/javascript");
        response.setCharacterEncoding("utf-8");
        try {
            PrintWriter out = response.getWriter();
            out.write("Hello World!!!");
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}