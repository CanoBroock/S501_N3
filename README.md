Usando RestTemplate o WebClient, te tendrás que conectar a la API que has hecho al nivel 2, para llamar y testar todas las peticiones que permite esta API.

Ten en cuenta, que en esta tarea del nivel 3, no tienes ninguna referencia a ninguna base de datos, ni necesitas usar JPA, ya que tu repositorio accederá a la API del nivel 2.

No te hace falta crear una Vista, porque este nivel 3 está previsto como una API Rest, pero tendrás que crear todas las capas hasta el controlador como cualquier otra aplicación:

-          cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.controllers

-          cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.domain

-          cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.dto

-          cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.services

-          cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.repository

 

La clase controladora, deberá ser capaz de atender las siguientes peticiones:

http://localhost:9002/flor/clientFlorsAdd

http://localhost:9002/flor/clientFlorsUpdate

http://localhost:9002/flor/clientFlorsDelete/{id}

http://localhost:9002/flor/clientFlorsGetOne/{id}

http://localhost:9002/flor/clientFlorsAll

 

Como puedes ver, en el archivo application.properties, deberás configurar que el puerto a usar sea el 9002.

Para probar el nivel 3, deberás tener en marcha la API del nivel 2. No tendrás problemas, ya que la API del nivel 3 trabaja con el puerto 9002 y la del nivel 2 con el puerto 9001.
