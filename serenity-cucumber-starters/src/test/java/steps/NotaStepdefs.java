package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import whenDo.CreateTaskScreen;
import whenDo.ListViewScreen;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class NotaStepdefs {

    @Before
    public void createDriver(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{actor} tiene acceso a apk")
    public void actorTieneAccesoAApk(Actor actor) {
    }

    @When("{actor} agrego una nueva tarea")
    public void agregoUnaNuevaTarea(Actor actor) {
        actor.attemptsTo(Click.on(ListViewScreen.addTaskButton));
    }

    @And("{actor} registrar Un Titulo: {string}")
    public void registrarUnTitulo(Actor actor, String titulo) {
       actor.attemptsTo(SendKeys.of(titulo).into(CreateTaskScreen.titleTxtBox)); // CreateTaskScreen.titleTxtBox.of(titulo);
    }

    @And("{actor} registrar Una Descripcion: {string}")
    public void registrarUnaDescripcion(Actor actor, String descripcion) {
        actor.attemptsTo(SendKeys.of(descripcion).into(CreateTaskScreen.noteTxtBox));
    }

    @And("{actor} hago click en guardar")
    public void hagoClickEnGuardar(Actor actor) {
        actor.attemptsTo(Click.on(CreateTaskScreen.saveButton));
    }

    @Then("la tarea {string} deberia ser mostrado")
    public void laTareaDeberiaSerMostrado( String expectedResult) {

        ListViewScreen.taskLabel.equals(expectedResult);

    }

    @And("{actor} Seleccionar el tipo de orden")
    public void seleccionarElTipoDeOrden(Actor actor) {
        actor.attemptsTo(Click.on(ListViewScreen.select));
    }

    @Then("{actor} seleccionar el orden alfabetico")
    public void seleccionarElOrdenAlfabetico(Actor actor) {
        actor.attemptsTo(Click.on(ListViewScreen.ComboSelect));
    }
}
