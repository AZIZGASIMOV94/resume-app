package com.mycompany.resumeapp.dao.inter;

import com.mycompany.bean.Skill;
import com.mycompany.bean.User;
import com.mycompany.bean.UserSkill;
import java.util.List;

/**
 *
 * @author azizg
 */
public interface SkillDaoInter {
    //get all skill by user id
    public List<Skill> getAllSkill();

}
