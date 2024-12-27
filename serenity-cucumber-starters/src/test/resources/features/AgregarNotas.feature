@Global
Feature: Subir Notas
  @Notas
  Scenario Outline: Crear una tarea de notas
    Given actor tiene acceso a apk
    When el agrego una nueva tarea
    And el registrar Un Titulo: "<titulo>"
    And el registrar Una Descripcion: "<descripcion>"
    And el hago click en guardar
    Then la tarea "Deporte" deberia ser mostrado
    Examples:
      | titulo  | descripcion    |
      | Deporte | Futbol y voley |
      | carrera | sistemas       |
      | Noticia | El comercio    |


  @Alfabetico
  Scenario: Orden alfabetico
    And el Seleccionar el tipo de orden
    Then el seleccionar el orden alfabetico