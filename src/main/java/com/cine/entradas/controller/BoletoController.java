package com.cine.entradas.controller;

import com.cine.entradas.service.BoletoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entrada")

public class BoletoController {

    @Autowired
    private BoletoService boletoService;
}
