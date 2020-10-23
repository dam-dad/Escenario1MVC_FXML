package dad.javafx.mvc.escenario1.modificar;

import javafx.event.ActionEvent;
import javafx.util.converter.NumberStringConverter;

public class ModificarController {
	
	private ModificarModel model = new ModificarModel();
	private ModificarView view = new ModificarView(); 
	
	public ModificarController() {
		
		view.getValorText().textProperty().bindBidirectional(model.intermedioProperty(), new NumberStringConverter());
		
		view.getEstablecerButton().setOnAction(e -> onEstablecerAction(e));

		view.getDecrementarButton().setOnAction(e -> onDecrementarAction(e));
		view.getDecrementarButton().disableProperty().bind(model.valorProperty().isEqualTo(0));

		view.getIncrementarButton().setOnAction(e -> onIncrementarAction(e));
		view.getIncrementarButton().disableProperty().bind(model.valorProperty().isEqualTo(100));

		model.valorProperty().addListener((o, ov, nv) -> System.out.println("ov=" + ov + "/nv=" + nv));
		
	}
	
	private void onEstablecerAction(ActionEvent e) {
		if (model.getIntermedio() >= 0 && model.getIntermedio() <= 100) {
			model.setValor(model.getIntermedio());
		} else {
			// TODO mostrar un alert
			System.err.println("Valor fuera de rango");
		}
	}

	private void onDecrementarAction(ActionEvent e) {
		model.setValor(model.getValor() - 1);
	}

	private void onIncrementarAction(ActionEvent e) {
		model.setValor(model.getValor() + 1);
	}

	public ModificarModel getModel() {
		return model;
	}
	
	public ModificarView getView() {
		return view;
	}

}
