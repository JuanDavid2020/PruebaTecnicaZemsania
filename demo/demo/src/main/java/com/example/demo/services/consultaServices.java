package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.Model.persona;

@Service
public class consultaServices {

    List<persona> personas = new ArrayList<>();
    List<String> resultadoConsulta = new ArrayList<>();

    public List<persona> Mockearinfo() {
        personas.add(new persona("C", "23445322", "Juan ", "David", "Leguizamon", "Lopez", "3102940398",
                "Calle 23f 96g 82", "Bogota"));
        personas.add(new persona("P", "87654321", "Jane", "", "Smith", "", "987654321", "Avenida XYZ", "Ciudad B"));
        personas.add(new persona("C", "11111111", "Mike", "", "Johnson", "", "111111111", "Calle ABC", "Ciudad C"));
        personas.add(new persona("P", "22222222", "Lisa", "", "Brown", "", "222222222", "Avenida DEF", "Ciudad D"));
        personas.add(new persona("C", "33333333", "David", "", "Wilson", "", "333333333", "Calle GHI", "Ciudad E"));
        personas.add(new persona("P", "44444444", "Amy", "", "Taylor", "", "444444444", "Avenida JKL", "Ciudad F"));
        personas.add(new persona("C", "55555555", "Brian", "", "Miller", "", "555555555", "Calle MNO", "Ciudad G"));
        personas.add(new persona("P", "66666666", "Emily", "", "Clark", "", "666666666", "Avenida PQR", "Ciudad H"));
        personas.add(new persona("C", "77777777", "Adam", "", "Anderson", "", "777777777", "Calle STU", "Ciudad I"));
        personas.add(new persona("P", "88888888", "Olivia", "", "White", "", "888888888", "Avenida VWX", "Ciudad J"));
        return personas;
    }

    public List<String> BuscarPersona(String tipo_cc, String cc) {

        if (tipo_cc.equals("C")) {
            for (persona persona : personas) {

                if (persona.getTipoDocumento().equals(tipo_cc) && persona.getDocumento().equals(cc)) {
                    resultadoConsulta.add(
                            "Primer nombre: " + persona.getPrimerNombre() + " Segundo nombre: " + " Primer apellido :"
                                    + persona.getPrimerApellido() + " Segundo apellido: " + persona.getSegundoApellido()
                                    + " Telefono :" + persona.getTelefono() + " Dirección :" + persona.getDireccion()
                                    + " Ciudad de Residencia: " + persona.getCiudadResidencia());
                }

            }
            return resultadoConsulta;
        } else {
            resultadoConsulta.add("Parametro no VALIDO");
            return resultadoConsulta;
        }
    }

}
