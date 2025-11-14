package com.example2.hellofx2;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.List;
import java.util.ArrayList;
import net.synedra.validatorfx.Check;

public class HelloController {

    /// buttons
    @FXML
    private RadioButton csRadio, bRadio;

    /// combobox

    @FXML
    private ComboBox<String> courseComboBox;

    @FXML
    private ListView<String> courseListView;


    /// toggle group

    @FXML
    public void initialize() {
        ToggleGroup majorGroup = new ToggleGroup();
        csRadio.setToggleGroup(majorGroup);
        bRadio.setToggleGroup(majorGroup);

        csRadio.setSelected(true);
        loadComputerScienceCourses();

        majorGroup.selectedToggleProperty().addListener((obs, oldVal, newVal) -> {
            courseListView.getItems().clear();

            if(csRadio.isSelected()){
                loadComputerScienceCourses();
            } else {
                loadBusinessCourses();
            }
        });
    }

    /// arrays for course holding
    private final String[] ComputerScienceCourses ={
    "Java", "Pythn", "C#", "JavaScript"
    };

    private final String[] BusinessCourses ={
    "Marketing", "Advertising", "Persuasive Writing", "Networking"
    };

    /// loads the course for each toggle
    private void loadComputerScienceCourses(){
        courseComboBox.getItems().setAll(ComputerScienceCourses);
    }
    private void loadBusinessCourses(){
        courseComboBox.getItems().setAll(BusinessCourses);
    }

    @FXML
    private void addCourses(){
        String selected = courseComboBox.getValue();

        if (!courseListView.getItems().contains(selected)) {
            courseListView.getItems().add(selected);
        } ///no room for duplicates
    }




    /// ohter info referenced
    @FXML
    private TextField fullNameField;
    @FXML
    private TextField streetAddressField;
    @FXML
    private TextField provinceField;
    @FXML
    private TextField cityField;
    @FXML
    private TextField postalField;
    @FXML
    private TextField phoneNumField;
    @FXML
    private TextField emailField;
    @FXML
    private CheckBox studentCouncilCheckmark;
    @FXML
    private CheckBox VolunteerCheckmark;


    /// display info
    @FXML
    private TextArea displayInfo;


    @FXML
    private void displayInfo(){
        String name = fullNameField.getText();;
        String address = streetAddressField.getText();
        String city = this.cityField.getText();
        String province = provinceField.getText();
        String postalcode = postalField.getText();
        String phone = phoneNumField.getText();
        String email = emailField.getText();

        /// grab major
        String major = csRadio.isSelected() ? "Computer Science" : "Business";

        /// grab checkboxes
        List<String> extrasList = new ArrayList<>();
        if(studentCouncilCheckmark.isSelected()) extrasList.add("Student Council");
        if(VolunteerCheckmark.isSelected()) extrasList.add("Volunteer Work");

        String extras = extrasList.isEmpty() ? "None" : String.join(",", extrasList);

        /// combine the courses
        String courses = String.join(",", courseListView.getItems());

        /// take all the info and put it into a string
        String infoDisplayed = String.format(
                "Full Name: " + name + "\n Address: " + address + "\n City: " + city + "\n Province: " + province + "\n Postal Code: " + postalcode + "\n Phone Number: "+ phone + "\n Email: " + email + "\n Major: " + major + "\n Courses: " + courses + "\n Extra: " + extras

        );

        /// display the above string
        displayInfo.setText(infoDisplayed);
    }


}



