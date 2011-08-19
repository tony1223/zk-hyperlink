package ork.zkoss.fiddle.hyperlink;

import java.io.IOException;

import org.zkoss.zk.ui.sys.ContentRenderer;
import org.zkoss.zul.A;

public class Hyperlink extends A {

	private boolean _disableHref = false;

	public Hyperlink() {
	}

	public Hyperlink(String label) {
		super(label);
	}

	public Hyperlink(String label, String image) {
		super(label, image);
	}

	public boolean isDisableHref() {
		return _disableHref;
	}

	public void setDisableHref(boolean disableHref) {
		if (this._disableHref != disableHref) {
			this._disableHref = disableHref;
			smartUpdate("_disableHref", _disableHref);
		}
	}

	protected void renderProperties(ContentRenderer renderer) throws IOException {
		super.renderProperties(renderer);

		render(renderer, "_disableHref", _disableHref);
	}
}
