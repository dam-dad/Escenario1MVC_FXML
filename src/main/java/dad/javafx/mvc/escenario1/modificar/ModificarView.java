package dad.javafx.mvc.escenario1.modificar;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ModificarView extends VBox {

	private TextField valorText;
	private Button establecerButton, incrementarButton, decrementarButton;

	public ModificarView() {
		super();

		valorText = new TextField();
		valorText.setPrefColumnCount(5);

		HBox valorBox = new HBox(5, new Label("Nuevo valor:"), valorText);
		valorBox.setAlignment(Pos.BASELINE_CENTER);

		establecerButton = new Button("Establecer");

		incrementarButton = new Button(">>");
		decrementarButton = new Button("<<");

		HBox botonesBox = new HBox(5, decrementarButton, incrementarButton);

		this.setSpacing(5);
		this.setFillWidth(false);
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(valorBox, establecerButton, botonesBox);

	}

	public TextField getValorText() {
		return valorText;
	}

	public Button getEstablecerButton() {
		return establecerButton;
	}

	public Button getIncrementarButton() {
		return incrementarButton;
	}

	public Button getDecrementarButton() {
		return decrementarButton;
	}

}
