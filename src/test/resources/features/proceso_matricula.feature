Feature: Proceso de matricula

  Yo como estudiante
  Quiero poder ingresar a la pagina de la universidad
  Para poder hacer mi proceso de matricula

  Scenario: Estudiante puede ingresar al proceso de matricula
    Given estoy en la pagina de la universidad
    When voy a la seccion de estudiantes
    Then deberia ver la opcion del "Proceso de matrícula"

