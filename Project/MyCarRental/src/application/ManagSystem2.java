package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.Node;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.cell.PropertyValueFactory;

public class ManagSystem2 implements Initializable {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchToScene1(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Front1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();

	}

	//table
	@FXML
    private TableColumn<Car, String> availableColumn;

    @FXML
    private TableColumn<Car, Integer> carregnoColumn;

    @FXML
    private TableColumn<Car, String> makeColumn;

    @FXML
    private TableColumn<Car, String> modelColumn;

    @FXML
    private TableView<Car> tableView;
    
    //Table input
    @FXML
    private TextField carregnoInput;


    @FXML
    private TextField makeInput;


    @FXML
    private TextField modelInput;
    
    @FXML
    private TextField availableInput;
    
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    	carregnoColumn.setCellValueFactory(new PropertyValueFactory<Car, Integer>("carregno"));
    	makeColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("make"));
    	modelColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("model"));
    	availableColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("available"));
    }
    
    //Add button
    @FXML
    void add(ActionEvent event) {
    	Car car = new Car(Integer.parseInt(carregnoInput.getText()),
    			makeInput.getText(),
    			modelInput.getText(),
    			availableInput.getText());

    	ObservableList<Car> cars = tableView.getItems();
    	cars.add(car);
    	tableView.setItems(cars);
    	carregnoInput.clear();
    	makeInput.clear();
    	modelInput.clear();
    	availableInput.clear();
    }
    
    @FXML
    void deleteCars(ActionEvent event) {
    	int selectID = tableView.getSelectionModel().getSelectedIndex();
    	tableView.getItems().remove(selectID);
    }
    
    
}
	
	

