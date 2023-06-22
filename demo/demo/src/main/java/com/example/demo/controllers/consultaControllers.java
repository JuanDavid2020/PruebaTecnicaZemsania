package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import com.example.demo.services.consultaServices;
import com.example.demo.Model.persona;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class consultaControllers {

    @Autowired
    private consultaServices consultaController;

    @GetMapping("/GetMockearinfo")
    @ResponseStatus(HttpStatus.OK)
    public List<persona> GetMockearinfo() {
        return consultaController.Mockearinfo();
    }

    @GetMapping("/GetBuscarPersona/{tipo_id}/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<String> GetBuscarPersona(@PathVariable("tipo_id") String tipo_id, @PathVariable("id") String id) {
        return consultaController.BuscarPersona(tipo_id, id);
    }
}
