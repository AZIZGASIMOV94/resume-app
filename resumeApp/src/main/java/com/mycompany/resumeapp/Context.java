/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.resumeapp;

import com.mycompany.resumeapp.dao.impl.CountryDaoImpl;
import com.mycompany.resumeapp.dao.impl.SkillDaoImpl;
import com.mycompany.resumeapp.dao.impl.UserDaoImpl;
import com.mycompany.resumeapp.dao.inter.CountryDaoInter;
import com.mycompany.resumeapp.dao.inter.SkillDaoInter;
import com.mycompany.resumeapp.dao.inter.UserDaoInter;

/**
 *
 * @author azizg
 */
public class Context {
    public static UserDaoInter instanceUserDao(){
        return new UserDaoImpl();
    }
    public static SkillDaoInter instanceSkillDao(){
        return new SkillDaoImpl();
    }
    
    public static CountryDaoInter instanceCountryDao(){
        return new CountryDaoImpl();
    }
}
