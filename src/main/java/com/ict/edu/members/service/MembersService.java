package com.ict.edu.members.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.edu.guestbook.repository.GuestBookRepository;
import com.ict.edu.guestbook.vo.GuestBookVO;
import com.ict.edu.members.repository.MembersRepository;
import com.ict.edu.members.vo.MembersVO;

@Service
public class MembersService {

    @Autowired
    private MembersRepository membersRepository;

    public String postLogin(MembersVO mvo){
        MembersVO m_vo = membersRepository.postLogin(mvo); 
        if(m_vo == null){
            return "0";
        }else{
            return "1";
        }
    }
    public MembersVO postLogin2(MembersVO mvo){
        MembersVO m_vo = membersRepository.postLogin(mvo); 
        if(m_vo != null){
            return m_vo;
        }
        return null;
    }

    public String postJoin(MembersVO mvo) {
        int result = membersRepository.postJoin(mvo);
        return String.valueOf(result);
    }
}
