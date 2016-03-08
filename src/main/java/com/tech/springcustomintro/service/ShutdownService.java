/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.springcustomintro.service;

import com.tech.springcustomintro.service.interfaces.IShutdownService;
import org.springframework.stereotype.Service;

/**
 *
 * @author KuroiTenshi
 */
@Service
public class ShutdownService implements IShutdownService {
    @Override
    public void Shutdown(){        
        System.out.println("Session terminated by the user");
        System.exit(0);
    }
}
