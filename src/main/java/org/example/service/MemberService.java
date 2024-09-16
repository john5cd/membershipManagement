package org.example.service;

import org.example.model.Member;

/* the MemberService is responsible for handling members. In this scenario the only
*  functionality we have is for the creation opf the members.
*/
public class MemberService {

    public Member create(String firstName, String lastName, String email, Long phoneNumber, int age) {
        return  new Member(firstName, lastName, email, phoneNumber, age);
    }
}
