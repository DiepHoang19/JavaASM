package com.example.accoutmodel.controller;

import com.example.accoutmodel.entity.Account;
import com.example.accoutmodel.model.AccountModel;
import com.example.accoutmodel.model.MySQLAccountModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListAccountServlet  extends HttpServlet {
    private AccountModel accountModel;

    @Override
    public void init() throws ServletException {
        accountModel = new MySQLAccountModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Account> accounts =  accountModel.findAll();
        req.setAttribute("accounts", accounts);
        req.getRequestDispatcher("/account/list.jsp").forward(req, resp);
    }
}
