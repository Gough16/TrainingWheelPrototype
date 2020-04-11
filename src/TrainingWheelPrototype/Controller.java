package TrainingWheelPrototype;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * This controller class implements the program.
 *
 * @author Michael Gough
 * @version 1
 * @since 2020-04-03
 */
public class Controller {

  @FXML
  private ComboBox<String> employeeSelection_ComboBox;

  @FXML
  private BarChart<?, ?> barChart_EmployeeRecords;

  @FXML
  private Label label_AddEmployee;

  @FXML
  private Label label_SearchEmployee;

  @FXML
  private Label label_CreateGroup;

  @FXML
  private ListView listView_ClientNames;

  @FXML
  private ListView listView_ClientDates;

  /**
   * This method load everything in the program at run time
   */
  public void initialize() {

    //Method used for the comboBox
    handleEmployeeComboBox();

    //Method used for loading the client names in the listview
    handleClientNameListView();

    //Method used for loading the client dates in the listview when the program runs
    handleClientDateListView();

  }

  /**
   * This method is used to list the current clients that TrainingWheel has for projects.
   */
  private void handleClientNameListView() {

    listView_ClientNames.getItems().add("Current Client Projects: ");
    listView_ClientNames.getItems().add("St. Vincents Hospital");
    listView_ClientNames.getItems().add("Lee Health");
    listView_ClientNames.getItems().add("Broward Health");

  }

  /**
   * This method is used to list the current client project dates that corresponds to the clients.
   */
  private void handleClientDateListView() {

    //Printing client dates in the client listview
    listView_ClientDates.getItems().add("Client Dates: ");
    listView_ClientDates.getItems().add("11/14/2020 ");
    listView_ClientDates.getItems().add("02/06/2021 ");
    listView_ClientDates.getItems().add("07/12/2020 ");

  }

  /**
   * This method handles the Combo box action and shows the options for employees
   */
  public void handleEmployeeComboBox() {

    //Adding items (names) to the choice box in the group creation tab
    employeeSelection_ComboBox.getItems().add("Kevin Smith");
    employeeSelection_ComboBox.getItems().add("Mark Gilbert");
    employeeSelection_ComboBox.getItems().add("Megan Wheeler");
    employeeSelection_ComboBox.getItems().add("Michael Gough");
    employeeSelection_ComboBox.getItems().add("Marshall Johnson");

  }

  /**
   * This method prints a message to the user when the add employee button is selected.
   */
  public void handleAddEmployeeButton() {
    label_AddEmployee.setText("New Employee Added!");
  }

  /**
   * This method prints a message to the user once the search button has been selected.
   */
  public void handleEmployeeSearchButton() {
    label_SearchEmployee.setText("Searching.....");
  }

  /**
   * This method prints a message to the user once the create group button has been selected.
   */
  public void handleCreateGroupButton() {
    label_CreateGroup.setText("Group Created!");
  }

  /**
   * This method prints bar chart data to the UI when they press the display button.
   */
  public void handleDisplayButton() {

    //Display chart data when the button is selected
    XYChart.Series trainingWheel = new Series();
    trainingWheel.getData().add(new XYChart.Data("With Submissions", 243));
    trainingWheel.getData().add(new XYChart.Data("Without Submissions", 26));

    barChart_EmployeeRecords.getData().addAll(trainingWheel);
  }
}

