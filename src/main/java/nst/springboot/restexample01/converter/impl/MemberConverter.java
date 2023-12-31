/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nst.springboot.restexample01.converter.impl;

import nst.springboot.restexample01.controller.domain.Department;
import nst.springboot.restexample01.controller.domain.Member;
import nst.springboot.restexample01.converter.DtoEntityConverter;
import nst.springboot.restexample01.dto.DepartmentDto;
import nst.springboot.restexample01.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class MemberConverter implements DtoEntityConverter<MemberDto, Member> {
    @Autowired
    private DepartmentConverter departmentConverter;
    @Override
    public MemberDto toDto(Member e) {
       Department d = e.getDepartment();
        return new MemberDto(
                e.getId(), 
                e.getFirstname(),e.getLastname(), e.getAcademic_title(),e.getEducation_title(), e.getScientific_field(), 
                (d!=null ? departmentConverter.toDto(d) : null), e.getAcademicTitleHistories(), e.getTitle_start()
        );
    }

    @Override
    public Member toEntity(MemberDto t) {
        DepartmentDto d = t.getDepartmentDto();
        return new Member(
                t.getId(), t.getFirstname(),t.getLastname(),t.getAcademic_title(),
                t.getEducation_title(),
                t.getScientific_field(),
        (d!=null ? departmentConverter.toEntity(d) : null), t.getAcademicTitleHistories(), t.getTitle_start());
    }
    
}
