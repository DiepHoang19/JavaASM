package com.example.accoutmodel.model;

import com.example.accoutmodel.entity.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySQLAccountModelTest {

    @Test
    void save() {
        MySQLAccountModel mySQLAccountModel = new MySQLAccountModel();
        Account account = new Account( "diep", "diep2", "diep@gmail.com","diep2002", 1 );
        assertEquals(true,  mySQLAccountModel.save(account));
    }
}