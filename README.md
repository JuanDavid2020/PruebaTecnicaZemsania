# PruebaTecnicaZemsania
 El consumo de la api creada en este proyecto muestra la implementación de un microservicio básico que utiliza datos simulados para recuperar una consulta.
 ## GET Mockearinfo
```html
https://localhost:8090/api/GetMockearinfo
```
Crea una lista de 10 objetos de la clase persona con información ficticia para consumir el servicio.
 ## GET BuscarPersona
```html
https://localhost:8090/api/GetBuscarPersona/{tipo_id}/{id}
```
Devuelve una lista  tipo String con la informacíon de la persona solicitada, recibe comoo parametros el tipo de documento y documento,"C" para cedula de ciudadania o "P" para pasaporte,de lo contrario se generara una excepción. 

| Query Params        |  Tipo de Entrada |
| ------------- | ------------- |
|  tipo_id |  "C" o "P"|
|  CC |  string (solo números) |

