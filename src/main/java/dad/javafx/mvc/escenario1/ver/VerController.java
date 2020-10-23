package dad.javafx.mvc.escenario1.ver;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;

public class VerController implements Initializable {

	// model
	
	private VerModel model = new VerModel();
	
	// view
	
	@FXML
	private VBox view;

	@FXML
	private ProgressBar valorProgress;
	
	@FXML
	private Label valorLabel;
	
	public VerController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Ver.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		valorProgress.progressProperty().bind(model.valorProperty().divide(100.0));

		valorLabel.textProperty().bind(model.valorProperty().asString());
				
	}
	
	public VerModel getModel() {
		return model;
	}
	
	public VBox getView() {
		return view;
	}

}
