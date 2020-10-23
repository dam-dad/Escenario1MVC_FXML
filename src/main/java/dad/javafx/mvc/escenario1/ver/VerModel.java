package dad.javafx.mvc.escenario1.ver;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class VerModel {

	private IntegerProperty valor = new SimpleIntegerProperty();

	public final IntegerProperty valorProperty() {
		return this.valor;
	}

	public final int getValor() {
		return this.valorProperty().get();
	}

	public final void setValor(final int valor) {
		this.valorProperty().set(valor);
	}

}
