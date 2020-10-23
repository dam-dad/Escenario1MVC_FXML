package dad.javafx.mvc.escenario1.modificar;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class ModificarModel {

	private IntegerProperty intermedio = new SimpleIntegerProperty();
	private IntegerProperty valor = new SimpleIntegerProperty();

	public final IntegerProperty intermedioProperty() {
		return this.intermedio;
	}

	public final int getIntermedio() {
		return this.intermedioProperty().get();
	}

	public final void setIntermedio(final int intermedio) {
		this.intermedioProperty().set(intermedio);
	}

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
