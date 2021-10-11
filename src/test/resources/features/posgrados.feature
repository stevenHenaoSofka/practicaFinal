Feature: Posgrados

  Yo como usuario
  Quiero poder ingresar a la pagina de la universidad
  Para poder chequear el Código SNIES de un programa de posgrado

  @Posgrados
  Scenario Outline: ingreso a la sección de Posgrados de la UdeA
    Narrative: Jefeas es la composición de nombres de Jerónimo, Felipe, Alejandro y Steven.\n El test accederá al portal universitario, buscará y seleccionará uno de los posgrados que se hayan indicado en el example y verificará que el título de la pantalla corresponda con el esperado.
    Given 'Jefeas' accedió al portal universitario de la gloriosa y poderosísima Universidad de Antioquia
    When ingresa a la sección de "<Posgrados>" de Quiero estudiar en la UdeA
    And se verifica que el título de la página corresponda con el elegido "<Posgrados>"

    Examples:
      | Posgrados              |
      | Especializaciones      |
      | Doctorados             |