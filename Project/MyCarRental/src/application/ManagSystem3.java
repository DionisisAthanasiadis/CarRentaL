package application;

import javafx.scene.Node;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ManagSystem3 implements Initializable {
	
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
	    private TableColumn<Car1, String> addressColumn;
	 
	 @FXML
	    private TableColumn<Car1, Integer> customeridColumn;
	 
	 @FXML
	 	private TableView<Car1> tableView;
	 
	 @FXML
	    private TableColumn<Car1, String> customernameColumn;

	 @FXML
	    private TableColumn<Car1, String> mobileColumn;

	 
	 //table input
	 @FXML
	    private TextField customeridInput;
   
	 @FXML
	    private TextField customernameInput;
	 
	 @FXML
	    private TextField mobileInput;
	    
	 @FXML
	    private TextArea addressInput;

	 @Override
	    public void initialize(URL url, ResourceBundle resourceBundle) {
	        customeridColumn.setCellValueFactory(new PropertyValueFactory<Car1, Integer>("customerid"));
	        customernameColumn.setCellValueFactory(new PropertyValueFactory<Car1, String>("customername"));
	        addressColumn.setCellValueFactory(new PropertyValueFactory<Car1, String>("address"));
	        mobileColumn.setCellValueFactory(new PropertyValueFactory<Car1, String>("mobile"));
	       }
	        
	 //Add button
	 @FXML
	    void add(ActionEvent event) {
	        Car1 car = new Car1(Integer.parseInt(customeridInput.getText()),
	        		customernameInput.getText(),
	        		addressInput.getText(),
	        		mobileInput.getText());

	        	ObservableList<Car1> cars = tableView.getItems();
	        	cars.add(car);
	        	tableView.setItems(cars);
	        	customeridInput.clear();
	        	customernameInput.clear();
	        	addressInput.clear();
	        	mobileInput.clear();
	        }
	        
	        @FXML
	        void deleteCars(ActionEvent event) {
	        	int selectID = tableView.getSelectionModel().getSelectedIndex();
	        	tableView.getItems().remove(selectID);
	        }
	        
	      	
   }

