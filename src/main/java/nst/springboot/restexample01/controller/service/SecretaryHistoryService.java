/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package nst.springboot.restexample01.controller.service;

import nst.springboot.restexample01.controller.domain.SecretaryHistory;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public interface SecretaryHistoryService {
    SecretaryHistory save (SecretaryHistory secretaryHistory);
}
